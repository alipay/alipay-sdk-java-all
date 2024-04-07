package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentMobilepaySignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.mobilepay.sign request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:18
 */
public class AlipayOpenAgentMobilepaySignRequest implements AlipayUploadRequest<AlipayOpenAgentMobilepaySignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* APP授权函图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appAuthPic;

	/** 
	* APP demo，格式为.apk；或者应用说明文档, 格式为.doc .docx .pdf格式
	 */
	private FileItem appDemo;

	/** 
	* 应用首页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appHomeScreenshot;

	/** 
	* 商品或服务页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appItemScreenshot;

	/** 
	* 应用在哪些市场上架，枚举值为：苹果,应用宝,华为,360,小米,豌豆荚,其他
	 */
	private List<String> appMarket;

	/** 
	* 商户的APP应用名称
	 */
	private String appName;

	/** 
	* 应用内支付页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appPayScreenshot;

	/** 
	* 应用上架状态，枚举值为 已上线，未上线
	 */
	private String appStatus;

	/** 
	* 可以登录该应用的测试账户
	 */
	private String appTestAccount;

	/** 
	* 可以登录此应用的账户的密码。对应app_test_account的登录密码
	 */
	private String appTestAccountPassword;

	/** 
	* 应用类型，枚举值为：IOS，安卓
	 */
	private List<String> appType;

	/** 
	* 代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照法人手机号码
	 */
	private String businessLicenseMobile;

	/** 
	* 营业执照号码。
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicensePic;

	/** 
	* 营业期限
	 */
	private String dateLimitation;

	/** 
	* 应用下载链接
	 */
	private String downloadLink;

	/** 
	* 应用首页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem homeScreenshot;

	/** 
	* 应用内截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem inAppScreenshot;

	/** 
	* 营业期限是否长期有效
	 */
	private Boolean longTerm;

	/** 
	* 所属MCCCode，详情可参考
<a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 传参：APP，代表设备类型是APP
	 */
	private String mobileType;

	/** 
	* 应用内支付页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem payScreenshot;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目</a> 中的“需要的特殊资质证书”，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

	/** 
	* 传参：mobile，代表交易场景是移动设备
	 */
	private String tradeScene;

	public void setAppAuthPic(FileItem appAuthPic) {
		this.appAuthPic = appAuthPic;
	}
	public FileItem getAppAuthPic() {
		return this.appAuthPic;
	}

	public void setAppDemo(FileItem appDemo) {
		this.appDemo = appDemo;
	}
	public FileItem getAppDemo() {
		return this.appDemo;
	}

	public void setAppHomeScreenshot(FileItem appHomeScreenshot) {
		this.appHomeScreenshot = appHomeScreenshot;
	}
	public FileItem getAppHomeScreenshot() {
		return this.appHomeScreenshot;
	}

	public void setAppItemScreenshot(FileItem appItemScreenshot) {
		this.appItemScreenshot = appItemScreenshot;
	}
	public FileItem getAppItemScreenshot() {
		return this.appItemScreenshot;
	}

	public void setAppMarket(List<String> appMarket) {
		this.appMarket = appMarket;
	}
	public List<String> getAppMarket() {
		return this.appMarket;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setAppPayScreenshot(FileItem appPayScreenshot) {
		this.appPayScreenshot = appPayScreenshot;
	}
	public FileItem getAppPayScreenshot() {
		return this.appPayScreenshot;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	public String getAppStatus() {
		return this.appStatus;
	}

	public void setAppTestAccount(String appTestAccount) {
		this.appTestAccount = appTestAccount;
	}
	public String getAppTestAccount() {
		return this.appTestAccount;
	}

	public void setAppTestAccountPassword(String appTestAccountPassword) {
		this.appTestAccountPassword = appTestAccountPassword;
	}
	public String getAppTestAccountPassword() {
		return this.appTestAccountPassword;
	}

	public void setAppType(List<String> appType) {
		this.appType = appType;
	}
	public List<String> getAppType() {
		return this.appType;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBusinessLicenseAuthPic(FileItem businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}
	public FileItem getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}

	public void setBusinessLicenseMobile(String businessLicenseMobile) {
		this.businessLicenseMobile = businessLicenseMobile;
	}
	public String getBusinessLicenseMobile() {
		return this.businessLicenseMobile;
	}

	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}
	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

	public void setBusinessLicensePic(FileItem businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}
	public FileItem getBusinessLicensePic() {
		return this.businessLicensePic;
	}

	public void setDateLimitation(String dateLimitation) {
		this.dateLimitation = dateLimitation;
	}
	public String getDateLimitation() {
		return this.dateLimitation;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setHomeScreenshot(FileItem homeScreenshot) {
		this.homeScreenshot = homeScreenshot;
	}
	public FileItem getHomeScreenshot() {
		return this.homeScreenshot;
	}

	public void setInAppScreenshot(FileItem inAppScreenshot) {
		this.inAppScreenshot = inAppScreenshot;
	}
	public FileItem getInAppScreenshot() {
		return this.inAppScreenshot;
	}

	public void setLongTerm(Boolean longTerm) {
		this.longTerm = longTerm;
	}
	public Boolean getLongTerm() {
		return this.longTerm;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode() {
		return this.mccCode;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public String getMobileType() {
		return this.mobileType;
	}

	public void setPayScreenshot(FileItem payScreenshot) {
		this.payScreenshot = payScreenshot;
	}
	public FileItem getPayScreenshot() {
		return this.payScreenshot;
	}

	public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}
	public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
	}

	public void setTradeScene(String tradeScene) {
		this.tradeScene = tradeScene;
	}
	public String getTradeScene() {
		return this.tradeScene;
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
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.agent.mobilepay.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_market", this.appMarket == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.appMarket, true));
		txtParams.put("app_name", this.appName);
		txtParams.put("app_status", this.appStatus);
		txtParams.put("app_test_account", this.appTestAccount);
		txtParams.put("app_test_account_password", this.appTestAccountPassword);
		txtParams.put("app_type", this.appType == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.appType, true));
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_mobile", this.businessLicenseMobile);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("download_link", this.downloadLink);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("mobile_type", this.mobileType);
		txtParams.put("trade_scene", this.tradeScene);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("app_auth_pic", this.appAuthPic);
		params.put("app_demo", this.appDemo);
		params.put("app_home_screenshot", this.appHomeScreenshot);
		params.put("app_item_screenshot", this.appItemScreenshot);
		params.put("app_pay_screenshot", this.appPayScreenshot);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("home_screenshot", this.homeScreenshot);
		params.put("in_app_screenshot", this.inAppScreenshot);
		params.put("pay_screenshot", this.payScreenshot);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentMobilepaySignResponse> getResponseClass() {
		return AlipayOpenAgentMobilepaySignResponse.class;
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
