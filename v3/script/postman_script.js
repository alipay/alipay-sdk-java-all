const appId = ""; // 应用id配置
const appPrivateKey = ""; //应用私钥配置
const alipayPublicKey = ""; //支付宝公钥配置

init(appId, appPrivateKey, alipayPublicKey);
signRequest();
verifyRespnose();

function verifyRespnose() {
    if (pm.response) {
        check(pm.collectionVariables.get("alipay_public_key"));
    }
}

function signRequest() {
    if (!pm.response) {
        pm.request.headers.add({key: 'alipay-request-id', value: pm.variables.replaceIn('{{$randomUUID}}')});
        addAuthHeader(pm.collectionVariables.get("app_id"),pm.collectionVariables.get("app_private_key"),pm.collectionVariables.get("app_cert_sn") );
    }
}

function init(appId, privateKey, alipayPublicKey, certSN) {
    pm.collectionVariables.set("app_id", appId);
    pm.collectionVariables.set("app_private_key", "-----BEGIN PRIVATE KEY----- " + privateKey + " -----END PRIVATE KEY-----");
    pm.collectionVariables.set("alipay_public_key", "-----BEGIN PUBLIC KEY----- " + alipayPublicKey + " -----END PUBLIC KEY-----");
    pm.collectionVariables.set("app_cert_sn", certSN);

    // 加载类库
    if (!pm.globals.has("pmlib_code")) {
        pm.sendRequest("https://joolfe.github.io/postman-util-lib/dist/bundle.js", (err, res) => {
            if (!err) {
                pm.globals.set("pmlib_code", res.text())
                eval( pm.globals.get('pmlib_code') );
            }
        });
        sleep(5000)
    } else {
        eval( pm.globals.get('pmlib_code') );
    }
}

// 添加认证参数
function addAuthHeader(appId, privateKey, sn) {

    const timestamp = new Date().getTime();

    var authString = genAuthString(timestamp, appId,sn, pm.variables.replaceIn('{{$randomUUID}}'), 120);

    var method = pm.request.method;
    var url = pm.request.url.getPathWithQuery();



    var body = pm.request.body;
    if (pm.request.body.mode == 'formdata') {
        body = pm.request.body.formdata.get("data")
        pm.request.body.formdata.get("data").type='application/json'
    }

    var signContent = authString + '\n' + method + '\n' + url + '\n' + body + '\n';

    var appAuthToken = pm.request.headers.get("alipay-app-auth-token");
    if (appAuthToken) {
        signContent += appAuthToken + '\n';
    }

    const sha256withRSA = new pmlib.rs.KJUR.crypto.Signature({"alg":"SHA256withRSA"});

    sha256withRSA.init(privateKey);
    sha256withRSA.updateString(signContent);

    const sign = pmlib.rs.hextob64(sha256withRSA.sign());
    pm.request.headers.add({key: 'authorization', value: "ALIPAY-SHA256withRSA " + authString + ",sign=" + sign })
}

function check(publicKey) {
    const timestamp = pm.response.headers.get("alipay-timestamp");
    const nonce = pm.response.headers.get("alipay-nonce");
    const sign = pm.response.headers.get("alipay-signature");
    const body = pm.response.text();

    var signContent = timestamp + '\n' + nonce + '\n' + body + '\n';

    const sha256withRSA = new pmlib.rs.KJUR.crypto.Signature({"alg":"SHA256withRSA"});
    sha256withRSA.init(publicKey);
    sha256withRSA.updateString(signContent);

    var verified =  sha256withRSA.verify(pmlib.rs.b64tohex(sign));
    console.log("响应验签结果：" + verified);

    pm.expect(verified).to.be.true;
}

function genAuthString(timestamp, appId, sn, nonce, nonceExpireSeconds) {
    var authString = "app_id="+appId + ",timestamp=" +timestamp + ",nonce=" + nonce + ",expired_seconds=" + nonceExpireSeconds ;
    return authString;
}