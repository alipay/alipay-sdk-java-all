package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentCommonSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.common.sign request
 * 
 * @author auto create
 * @since 1.0, 2023-04-12 16:20:56
 */
public class AlipayOpenAgentCommonSignRequest implements AlipayUploadRequest<AlipayOpenAgentCommonSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝生活号(原服务窗)名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String alipayLifeName;

	/** 
	* APP demo，格式为.apk；或者应用说明文档, 格式为.doc .docx .pdf格式（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private FileItem appDemo;

	/** 
	* 商户的APP应用名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String appName;

	/** 
	* 代商户操作事务编号，通过alipay.open.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照号码
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片。被代创建商户运营主体为个人账户必填，企业账户无需填写。图片最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
	 */
	private FileItem businessLicensePic;

	/** 
	* 营业期限
	 */
	private String dateLimitation;

	/** 
	* 营业期限是否长期有效
	 */
	private Boolean longTerm;

	/** 
	* <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* isv要代商户签约产品码，产品码是支付宝内部对产品的唯一标识
	 */
	private String productCode;

	/** 
	* 店铺内景图片，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://opendocs.alipay.com/common/02khjv">商家经营类目</a> 中的“需要的特殊资质证书”。文件最小为 5KB，最大为5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
	 */
	private FileItem specialLicensePic;

	/** 
	* 网站首页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem webHomeScreenshot;

	/** 
	* 网站商品页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem webItemScreenshot;

	/** 
	* 网站支付页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem webPayScreenshot;

	/** 
	* 接入网址信息（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private List<String> webSites;

	/** 
	* 接入网址的授权涵，格式为.doc .docx .pdf格式
	 */
	private FileItem webSitesLoa;

	/** 
	* 网站状态，枚举值为：已上线，未上线
	 */
	private String webStatus;

	/** 
	* 可以登录此网站的测试账户
	 */
	private String webTestAccount;

	/** 
	* 可以登录此网站的账户的密码。对应web_test_account的登录密码
	 */
	private String webTestAccountPassword;

	/** 
	* 微信公众号名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String wechatOfficialAccountName;

	public void setAlipayLifeName(String alipayLifeName) {
		this.alipayLifeName = alipayLifeName;
	}
	public String getAlipayLifeName() {
		return this.alipayLifeName;
	}

	public void setAppDemo(FileItem appDemo) {
		this.appDemo = appDemo;
	}
	public FileItem getAppDemo() {
		return this.appDemo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setShopScenePic(FileItem shopScenePic) {
		this.shopScenePic = shopScenePic;
	}
	public FileItem getShopScenePic() {
		return this.shopScenePic;
	}

	public void setShopSignBoardPic(FileItem shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}
	public FileItem getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

	public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}
	public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
	}

	public void setWebHomeScreenshot(FileItem webHomeScreenshot) {
		this.webHomeScreenshot = webHomeScreenshot;
	}
	public FileItem getWebHomeScreenshot() {
		return this.webHomeScreenshot;
	}

	public void setWebItemScreenshot(FileItem webItemScreenshot) {
		this.webItemScreenshot = webItemScreenshot;
	}
	public FileItem getWebItemScreenshot() {
		return this.webItemScreenshot;
	}

	public void setWebPayScreenshot(FileItem webPayScreenshot) {
		this.webPayScreenshot = webPayScreenshot;
	}
	public FileItem getWebPayScreenshot() {
		return this.webPayScreenshot;
	}

	public void setWebSites(List<String> webSites) {
		this.webSites = webSites;
	}
	public List<String> getWebSites() {
		return this.webSites;
	}

	public void setWebSitesLoa(FileItem webSitesLoa) {
		this.webSitesLoa = webSitesLoa;
	}
	public FileItem getWebSitesLoa() {
		return this.webSitesLoa;
	}

	public void setWebStatus(String webStatus) {
		this.webStatus = webStatus;
	}
	public String getWebStatus() {
		return this.webStatus;
	}

	public void setWebTestAccount(String webTestAccount) {
		this.webTestAccount = webTestAccount;
	}
	public String getWebTestAccount() {
		return this.webTestAccount;
	}

	public void setWebTestAccountPassword(String webTestAccountPassword) {
		this.webTestAccountPassword = webTestAccountPassword;
	}
	public String getWebTestAccountPassword() {
		return this.webTestAccountPassword;
	}

	public void setWechatOfficialAccountName(String wechatOfficialAccountName) {
		this.wechatOfficialAccountName = wechatOfficialAccountName;
	}
	public String getWechatOfficialAccountName() {
		return this.wechatOfficialAccountName;
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
		return "alipay.open.agent.common.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_life_name", this.alipayLifeName);
		txtParams.put("app_name", this.appName);
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("product_code", this.productCode);
		txtParams.put("web_sites", this.webSites == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.webSites, true));
		txtParams.put("web_status", this.webStatus);
		txtParams.put("web_test_account", this.webTestAccount);
		txtParams.put("web_test_account_password", this.webTestAccountPassword);
		txtParams.put("wechat_official_account_name", this.wechatOfficialAccountName);
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
		params.put("app_demo", this.appDemo);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		params.put("web_home_screenshot", this.webHomeScreenshot);
		params.put("web_item_screenshot", this.webItemScreenshot);
		params.put("web_pay_screenshot", this.webPayScreenshot);
		params.put("web_sites_loa", this.webSitesLoa);
		return params;
	}

	public Class<AlipayOpenAgentCommonSignResponse> getResponseClass() {
		return AlipayOpenAgentCommonSignResponse.class;
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
