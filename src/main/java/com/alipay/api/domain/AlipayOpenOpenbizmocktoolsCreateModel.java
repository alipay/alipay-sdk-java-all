package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openbizmock应用的创建功能性接口
 *
 * @author auto create
 * @since 1.0, 2022-10-25 11:00:40
 */
public class AlipayOpenOpenbizmocktoolsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1849146858661985158L;

	/**
	 * 接口赋权
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 允许的签名类型
	 */
	@ApiField("allow_sign_types")
	private String allowSignTypes;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用的APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	/**
	 * 应用类型
	 */
	@ApiField("application_type")
	private String applicationType;

	/**
	 * 字符格式
	 */
	@ApiField("charset_type")
	private String charsetType;

	/**
	 * 加密类型
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 环境
	 */
	@ApiField("env")
	private String env;

	/**
	 * 网关地址
	 */
	@ApiField("gateway_url")
	private String gatewayUrl;

	/**
	 * group_id值
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 抬头
	 */
	@ApiField("header")
	private String header;

	/**
	 * 接口英文名
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * isvAPPID
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 是否压测
	 */
	@ApiField("load_test")
	private String loadTest;

	/**
	 * mock配置
	 */
	@ApiField("mock_config")
	private String mockConfig;

	/**
	 * 通知字段
	 */
	@ApiField("notify_fields")
	private String notifyFields;

	/**
	 * 通知场景
	 */
	@ApiField("notify_triggers")
	private String notifyTriggers;

	/**
	 * OID
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * OPENID值
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 输出字段
	 */
	@ApiField("outputs")
	private String outputs;

	/**
	 * 功能包
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 商家账号
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 接入方式
	 */
	@ApiField("protocol")
	private String protocol;

	/**
	 * 公钥
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * 查询
	 */
	@ApiField("query")
	private String query;

	/**
	 * 回调地址
	 */
	@ApiField("return_url_address")
	private String returnUrlAddress;

	/**
	 * scope值
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 加密密钥
	 */
	@ApiField("secret_key")
	private String secretKey;

	/**
	 * 签名类型
	 */
	@ApiField("signature_type")
	private String signatureType;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订阅标签
	 */
	@ApiField("sub_tag")
	private String subTag;

	/**
	 * 订阅方式
	 */
	@ApiField("subscribe_type")
	private String subscribeType;

	/**
	 * URL
	 */
	@ApiField("test_url")
	private String testUrl;

	/**
	 * 超时时间
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * UID值
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 是否强制加密
	 */
	@ApiField("use_encrypt")
	private String useEncrypt;

	/**
	 * userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAllowSignTypes() {
		return this.allowSignTypes;
	}
	public void setAllowSignTypes(String allowSignTypes) {
		this.allowSignTypes = allowSignTypes;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public String getApplicationType() {
		return this.applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getCharsetType() {
		return this.charsetType;
	}
	public void setCharsetType(String charsetType) {
		this.charsetType = charsetType;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getGatewayUrl() {
		return this.gatewayUrl;
	}
	public void setGatewayUrl(String gatewayUrl) {
		this.gatewayUrl = gatewayUrl;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getHeader() {
		return this.header;
	}
	public void setHeader(String header) {
		this.header = header;
	}

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getLoadTest() {
		return this.loadTest;
	}
	public void setLoadTest(String loadTest) {
		this.loadTest = loadTest;
	}

	public String getMockConfig() {
		return this.mockConfig;
	}
	public void setMockConfig(String mockConfig) {
		this.mockConfig = mockConfig;
	}

	public String getNotifyFields() {
		return this.notifyFields;
	}
	public void setNotifyFields(String notifyFields) {
		this.notifyFields = notifyFields;
	}

	public String getNotifyTriggers() {
		return this.notifyTriggers;
	}
	public void setNotifyTriggers(String notifyTriggers) {
		this.notifyTriggers = notifyTriggers;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutputs() {
		return this.outputs;
	}
	public void setOutputs(String outputs) {
		this.outputs = outputs;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getPublicKey() {
		return this.publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getReturnUrlAddress() {
		return this.returnUrlAddress;
	}
	public void setReturnUrlAddress(String returnUrlAddress) {
		this.returnUrlAddress = returnUrlAddress;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getSignatureType() {
		return this.signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTag() {
		return this.subTag;
	}
	public void setSubTag(String subTag) {
		this.subTag = subTag;
	}

	public String getSubscribeType() {
		return this.subscribeType;
	}
	public void setSubscribeType(String subscribeType) {
		this.subscribeType = subscribeType;
	}

	public String getTestUrl() {
		return this.testUrl;
	}
	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
	}

	public String getTimeout() {
		return this.timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUseEncrypt() {
		return this.useEncrypt;
	}
	public void setUseEncrypt(String useEncrypt) {
		this.useEncrypt = useEncrypt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
