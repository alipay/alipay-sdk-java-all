package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityInfoAnalysisResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.info.analysis request
 * 
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:20
 */
public class AlipaySecurityInfoAnalysisRequest implements AlipayRequest<AlipaySecurityInfoAnalysisResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端的imsi
	 */
	private String envClientImsi;

	/** 
	* IOS设备的UDID
	 */
	private String envClientIosUdid;

	/** 
	* 操作的客户端ip
	 */
	private String envClientIp;

	/** 
	* 操作的客户端mac
	 */
	private String envClientMac;

	/** 
	* 操作的客户端分辨率，格式为：水平像素^垂直像素；如：800^600
	 */
	private String envClientScreen;

	/** 
	* 客户端设备的统一识别码UUID
	 */
	private String envClientUuid;

	/** 
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户ID
	 */
	private String userAccountNo;

	/** 
	* 用户绑定银行卡号
	 */
	private String userBindBankcard;

	/** 
	* 用户绑定银行卡的卡类型
	 */
	private String userBindBankcardType;

	/** 
	* 用户绑定手机号
	 */
	private String userBindMobile;

	/** 
	* 用户证件类型
	 */
	private String userIdentityType;

	/** 
	* 用户真实姓名
	 */
	private String userRealName;

	/** 
	* 用户注册时间
	 */
	private String userRegDate;

	/** 
	* 用户注册Email
	 */
	private String userRegEmail;

	/** 
	* 用户注册手机号
	 */
	private String userRegMobile;

	/** 
	* 用户证件号码
	 */
	private String userrIdentityNo;

	public void setEnvClientBaseBand(String envClientBaseBand) {
		this.envClientBaseBand = envClientBaseBand;
	}
	public String getEnvClientBaseBand() {
		return this.envClientBaseBand;
	}

	public void setEnvClientBaseStation(String envClientBaseStation) {
		this.envClientBaseStation = envClientBaseStation;
	}
	public String getEnvClientBaseStation() {
		return this.envClientBaseStation;
	}

	public void setEnvClientCoordinates(String envClientCoordinates) {
		this.envClientCoordinates = envClientCoordinates;
	}
	public String getEnvClientCoordinates() {
		return this.envClientCoordinates;
	}

	public void setEnvClientImei(String envClientImei) {
		this.envClientImei = envClientImei;
	}
	public String getEnvClientImei() {
		return this.envClientImei;
	}

	public void setEnvClientImsi(String envClientImsi) {
		this.envClientImsi = envClientImsi;
	}
	public String getEnvClientImsi() {
		return this.envClientImsi;
	}

	public void setEnvClientIosUdid(String envClientIosUdid) {
		this.envClientIosUdid = envClientIosUdid;
	}
	public String getEnvClientIosUdid() {
		return this.envClientIosUdid;
	}

	public void setEnvClientIp(String envClientIp) {
		this.envClientIp = envClientIp;
	}
	public String getEnvClientIp() {
		return this.envClientIp;
	}

	public void setEnvClientMac(String envClientMac) {
		this.envClientMac = envClientMac;
	}
	public String getEnvClientMac() {
		return this.envClientMac;
	}

	public void setEnvClientScreen(String envClientScreen) {
		this.envClientScreen = envClientScreen;
	}
	public String getEnvClientScreen() {
		return this.envClientScreen;
	}

	public void setEnvClientUuid(String envClientUuid) {
		this.envClientUuid = envClientUuid;
	}
	public String getEnvClientUuid() {
		return this.envClientUuid;
	}

	public void setJsTokenId(String jsTokenId) {
		this.jsTokenId = jsTokenId;
	}
	public String getJsTokenId() {
		return this.jsTokenId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setUserAccountNo(String userAccountNo) {
		this.userAccountNo = userAccountNo;
	}
	public String getUserAccountNo() {
		return this.userAccountNo;
	}

	public void setUserBindBankcard(String userBindBankcard) {
		this.userBindBankcard = userBindBankcard;
	}
	public String getUserBindBankcard() {
		return this.userBindBankcard;
	}

	public void setUserBindBankcardType(String userBindBankcardType) {
		this.userBindBankcardType = userBindBankcardType;
	}
	public String getUserBindBankcardType() {
		return this.userBindBankcardType;
	}

	public void setUserBindMobile(String userBindMobile) {
		this.userBindMobile = userBindMobile;
	}
	public String getUserBindMobile() {
		return this.userBindMobile;
	}

	public void setUserIdentityType(String userIdentityType) {
		this.userIdentityType = userIdentityType;
	}
	public String getUserIdentityType() {
		return this.userIdentityType;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserRealName() {
		return this.userRealName;
	}

	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	public String getUserRegDate() {
		return this.userRegDate;
	}

	public void setUserRegEmail(String userRegEmail) {
		this.userRegEmail = userRegEmail;
	}
	public String getUserRegEmail() {
		return this.userRegEmail;
	}

	public void setUserRegMobile(String userRegMobile) {
		this.userRegMobile = userRegMobile;
	}
	public String getUserRegMobile() {
		return this.userRegMobile;
	}

	public void setUserrIdentityNo(String userrIdentityNo) {
		this.userrIdentityNo = userrIdentityNo;
	}
	public String getUserrIdentityNo() {
		return this.userrIdentityNo;
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
		return "alipay.security.info.analysis";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("env_client_base_band", this.envClientBaseBand);
		txtParams.put("env_client_base_station", this.envClientBaseStation);
		txtParams.put("env_client_coordinates", this.envClientCoordinates);
		txtParams.put("env_client_imei", this.envClientImei);
		txtParams.put("env_client_imsi", this.envClientImsi);
		txtParams.put("env_client_ios_udid", this.envClientIosUdid);
		txtParams.put("env_client_ip", this.envClientIp);
		txtParams.put("env_client_mac", this.envClientMac);
		txtParams.put("env_client_screen", this.envClientScreen);
		txtParams.put("env_client_uuid", this.envClientUuid);
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("user_account_no", this.userAccountNo);
		txtParams.put("user_bind_bankcard", this.userBindBankcard);
		txtParams.put("user_bind_bankcard_type", this.userBindBankcardType);
		txtParams.put("user_bind_mobile", this.userBindMobile);
		txtParams.put("user_identity_type", this.userIdentityType);
		txtParams.put("user_real_name", this.userRealName);
		txtParams.put("user_reg_date", this.userRegDate);
		txtParams.put("user_reg_email", this.userRegEmail);
		txtParams.put("user_reg_mobile", this.userRegMobile);
		txtParams.put("userr_identity_no", this.userrIdentityNo);
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

	public Class<AlipaySecurityInfoAnalysisResponse> getResponseClass() {
		return AlipaySecurityInfoAnalysisResponse.class;
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
