package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileLoginUnifyalipayLoginResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.login.unifyalipay.login request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileLoginUnifyalipayLoginRequest implements AlipayRequest<AlipayMobileLoginUnifyalipayLoginResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户无线接入点名称
	 */
	private String accessPoint;

	/** 
	* 环境上下文数据--RDS数据采集支付宝（由支付宝提供的JS或sdk采集的设备信息及用户行为信息）
	 */
	private String alipayEnvJson;

	/** 
	* 设备指纹
	 */
	private String apdid;

	/** 
	* 应用标识
	 */
	private String appClientId;

	/** 
	* 应用key
	 */
	private String appKey;

	/** 
	* 手机基站
	 */
	private String cellId;

	/** 
	* apple-iphone
	 */
	private String channel;

	/** 
	* 456123
	 */
	private String checkCode;

	/** 
	* 校验码id
	 */
	private String checkCodeId;

	/** 
	* 终端位置（地理位置）
	 */
	private String clientPostion;

	/** 
	* 客户端类型(IOS,ANDRIOD)
	 */
	private String clientType;

	/** 
	* 扩展参数(json格式)
	 */
	private String externParams;

	/** 
	* IMEI
	 */
	private String imei;

	/** 
	* IMSI
	 */
	private String imsi;

	/** 
	* 基站LAC
	 */
	private String lacId;

	/** 
	* 登录帐号(手机号码或邮箱)
	 */
	private String loginId;

	/** 
	* 登陆密码（RSA加密后）
	 */
	private String loginPwd;

	/** 
	* 登录类型（TAOBAO或者ALIPAY）
	 */
	private String loginType;

	/** 
	* 手机品牌
	 */
	private String mobileBrand;

	/** 
	* 手机机型
	 */
	private String mobileModel;

	/** 
	* 设备是否越狱
	 */
	private Boolean prisonBreak;

	/** 
	* 屏幕高
	 */
	private String screenHigh;

	/** 
	* 屏幕宽
	 */
	private String screenWidth;

	/** 
	* 操作系统类型
	 */
	private String systemType;

	/** 
	* 操作系统版本
	 */
	private String systemVersion;

	/** 
	* 标识
	 */
	private String token;

	/** 
	* userAgent
	 */
	private String userAgent;

	/** 
	* 38:83:45:e4:76:c0
	 */
	private String wifiMac;

	/** 
	* wifi 接入点名称
	 */
	private String wifiNodeName;

	public void setAccessPoint(String accessPoint) {
		this.accessPoint = accessPoint;
	}
	public String getAccessPoint() {
		return this.accessPoint;
	}

	public void setAlipayEnvJson(String alipayEnvJson) {
		this.alipayEnvJson = alipayEnvJson;
	}
	public String getAlipayEnvJson() {
		return this.alipayEnvJson;
	}

	public void setApdid(String apdid) {
		this.apdid = apdid;
	}
	public String getApdid() {
		return this.apdid;
	}

	public void setAppClientId(String appClientId) {
		this.appClientId = appClientId;
	}
	public String getAppClientId() {
		return this.appClientId;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppKey() {
		return this.appKey;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}
	public String getCellId() {
		return this.cellId;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel() {
		return this.channel;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String getCheckCode() {
		return this.checkCode;
	}

	public void setCheckCodeId(String checkCodeId) {
		this.checkCodeId = checkCodeId;
	}
	public String getCheckCodeId() {
		return this.checkCodeId;
	}

	public void setClientPostion(String clientPostion) {
		this.clientPostion = clientPostion;
	}
	public String getClientPostion() {
		return this.clientPostion;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getClientType() {
		return this.clientType;
	}

	public void setExternParams(String externParams) {
		this.externParams = externParams;
	}
	public String getExternParams() {
		return this.externParams;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getImei() {
		return this.imei;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getImsi() {
		return this.imsi;
	}

	public void setLacId(String lacId) {
		this.lacId = lacId;
	}
	public String getLacId() {
		return this.lacId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getLoginType() {
		return this.loginType;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getMobileBrand() {
		return this.mobileBrand;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getMobileModel() {
		return this.mobileModel;
	}

	public void setPrisonBreak(Boolean prisonBreak) {
		this.prisonBreak = prisonBreak;
	}
	public Boolean getPrisonBreak() {
		return this.prisonBreak;
	}

	public void setScreenHigh(String screenHigh) {
		this.screenHigh = screenHigh;
	}
	public String getScreenHigh() {
		return this.screenHigh;
	}

	public void setScreenWidth(String screenWidth) {
		this.screenWidth = screenWidth;
	}
	public String getScreenWidth() {
		return this.screenWidth;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	public String getSystemType() {
		return this.systemType;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}
	public String getSystemVersion() {
		return this.systemVersion;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return this.token;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getUserAgent() {
		return this.userAgent;
	}

	public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}
	public String getWifiMac() {
		return this.wifiMac;
	}

	public void setWifiNodeName(String wifiNodeName) {
		this.wifiNodeName = wifiNodeName;
	}
	public String getWifiNodeName() {
		return this.wifiNodeName;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.mobile.login.unifyalipay.login";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("access_point", this.accessPoint);
		txtParams.put("alipay_env_json", this.alipayEnvJson);
		txtParams.put("apdid", this.apdid);
		txtParams.put("app_client_id", this.appClientId);
		txtParams.put("app_key", this.appKey);
		txtParams.put("cell_id", this.cellId);
		txtParams.put("channel", this.channel);
		txtParams.put("check_code", this.checkCode);
		txtParams.put("check_code_id", this.checkCodeId);
		txtParams.put("client_postion", this.clientPostion);
		txtParams.put("client_type", this.clientType);
		txtParams.put("extern_params", this.externParams);
		txtParams.put("imei", this.imei);
		txtParams.put("imsi", this.imsi);
		txtParams.put("lac_id", this.lacId);
		txtParams.put("login_id", this.loginId);
		txtParams.put("login_pwd", this.loginPwd);
		txtParams.put("login_type", this.loginType);
		txtParams.put("mobile_brand", this.mobileBrand);
		txtParams.put("mobile_model", this.mobileModel);
		txtParams.put("prison_break", this.prisonBreak);
		txtParams.put("screen_high", this.screenHigh);
		txtParams.put("screen_width", this.screenWidth);
		txtParams.put("system_type", this.systemType);
		txtParams.put("system_version", this.systemVersion);
		txtParams.put("token", this.token);
		txtParams.put("user_agent", this.userAgent);
		txtParams.put("wifi_mac", this.wifiMac);
		txtParams.put("wifi_node_name", this.wifiNodeName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayMobileLoginUnifyalipayLoginResponse> getResponseClass() {
		return AlipayMobileLoginUnifyalipayLoginResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
