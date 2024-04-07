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
 * @since 1.0, 2024-03-01 16:26:13
 */
public class AlipayOpenAgentCommonSignRequest implements AlipayUploadRequest<AlipayOpenAgentCommonSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝生活号(原服务窗)名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name。1、2、3少选择一个填写）
	 */
	private String alipayLifeName;

	/** 
	* APP授权函图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appAuthPic;

	/** 
	* APP demo，格式为.apk；或者应用说明文档, 格式为.doc .docx .pdf格式（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
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
	* 投放应用市场
	 */
	private String appMarket;

	/** 
	* 商户的APP应用名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String appName;

	/** 
	* 应用内支付页截图，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem appPayScreenshot;

	/** 
	* 应用状态
	 */
	private String appStatus;

	/** 
	* 可以登录该应用的测试账户
	 */
	private String appTestAccount;

	/** 
	* 可以登录此应用的账户的密码。对app_test_account的登录密码。
	 */
	private String appTestAccountPassword;

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
	* 应用下载链接
	 */
	private String downloadLink;

	/** 
	* 网站备注图片
	 */
	private FileItem h5ExtraPic;

	/** 
	* H5网站首页截图
	 */
	private FileItem h5HomeScreenshot;

	/** 
	* H5网站商品截图
	 */
	private FileItem h5ItemScreenshot;

	/** 
	* 网站扩展信息文本
	 */
	private String h5Memo;

	/** 
	* H5网站支付页截图
	 */
	private FileItem h5PayScreenshot;

	/** 
	* H5网站地址
	 */
	private String h5Sites;

	/** 
	* H5网站授权函
	 */
	private FileItem h5SitesLoa;

	/** 
	* H5网站状态
	 */
	private String h5Status;

	/** 
	* 请输入被签约商户的支付宝生活号ID编号
	 */
	private String lifeAppId;

	/** 
	* 营业期限是否长期有效
	 */
	private Boolean longTerm;

	/** 
	* <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 请输入被签约商家下任意小程序APPID ID编号
	 */
	private String miniAppId;

	/** 
	* 小程序名称
	 */
	private String miniAppName;

	/** 
	* 请上传商家小程序截图信息，最小5KB ，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem miniAppScreenshot;

	/** 
	* 移动设备类型，当开通电脑网站支付产品时不需赋值；当开通手机网站支付时，传H5；当开通JSAPI时，传APP；当开通预授权支付产品，且交易场景选择“mobile”(移动设备)时，需要从APP,H5中至少选择一个，可多选，字符串英文逗号分隔。
	 */
	private String mobileType;

	/** 
	* isv要代商户签约产品码，产品码是支付宝内部对产品的唯一标识
	 */
	private String productCode;

	/** 
	* 服务费率（%），例如：请输入0.38~0.6 之间（小数点后两位，可取0.38%及0.6%），直播买卖通涉及JSAPI支付产品，交易手续费为 0.38%-0.6%，后续费率变化可参考支付宝标准服务费。
当签约且授权标识 sign_and_auth=true 时，该费率信息必填。
	 */
	private String rate;

	/** 
	* 门店所在城市
	 */
	private String shopCityCode;

	/** 
	* 门店详细地址
	 */
	private String shopDetailAddress;

	/** 
	* 门店所在区/县
	 */
	private String shopDistrictCode;

	/** 
	* 门店名称
	 */
	private String shopName;

	/** 
	* 门店所在省份
	 */
	private String shopProvinceCode;

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
	* 合约特殊资质的类型，不传默认99
	 */
	private String specialLicenseType;

	/** 
	* 交易场景，当开通产品为电脑网站支付时，传pc；当开通产品为手机网站支付时，传mobile；当开通产品为JSAPI时，传tiny_app；当开通产品为预授权支付时，下面括号中三个至少传一个（tiny_app,mobile,offline_store），可多选，字符串用英文逗号分隔
	 */
	private String tradeScene;

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
	* 网站状态，枚举值为：ONLINE，OFFLINE
	 */
	private String webStatus;

	/** 
	* 可以登录此网站的测试账户。
	 */
	private String webTestAccount;

	/** 
	* 可以登录此网站的账户的密码。对应web_test_account的登录密码
	 */
	private String webTestAccountPassword;

	/** 
	* 1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写
	 */
	private String wechatOfficialAccountName;

	public void setAlipayLifeName(String alipayLifeName) {
		this.alipayLifeName = alipayLifeName;
	}
	public String getAlipayLifeName() {
		return this.alipayLifeName;
	}

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

	public void setAppMarket(String appMarket) {
		this.appMarket = appMarket;
	}
	public String getAppMarket() {
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

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setH5ExtraPic(FileItem h5ExtraPic) {
		this.h5ExtraPic = h5ExtraPic;
	}
	public FileItem getH5ExtraPic() {
		return this.h5ExtraPic;
	}

	public void setH5HomeScreenshot(FileItem h5HomeScreenshot) {
		this.h5HomeScreenshot = h5HomeScreenshot;
	}
	public FileItem getH5HomeScreenshot() {
		return this.h5HomeScreenshot;
	}

	public void setH5ItemScreenshot(FileItem h5ItemScreenshot) {
		this.h5ItemScreenshot = h5ItemScreenshot;
	}
	public FileItem getH5ItemScreenshot() {
		return this.h5ItemScreenshot;
	}

	public void setH5Memo(String h5Memo) {
		this.h5Memo = h5Memo;
	}
	public String getH5Memo() {
		return this.h5Memo;
	}

	public void setH5PayScreenshot(FileItem h5PayScreenshot) {
		this.h5PayScreenshot = h5PayScreenshot;
	}
	public FileItem getH5PayScreenshot() {
		return this.h5PayScreenshot;
	}

	public void setH5Sites(String h5Sites) {
		this.h5Sites = h5Sites;
	}
	public String getH5Sites() {
		return this.h5Sites;
	}

	public void setH5SitesLoa(FileItem h5SitesLoa) {
		this.h5SitesLoa = h5SitesLoa;
	}
	public FileItem getH5SitesLoa() {
		return this.h5SitesLoa;
	}

	public void setH5Status(String h5Status) {
		this.h5Status = h5Status;
	}
	public String getH5Status() {
		return this.h5Status;
	}

	public void setLifeAppId(String lifeAppId) {
		this.lifeAppId = lifeAppId;
	}
	public String getLifeAppId() {
		return this.lifeAppId;
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

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId() {
		return this.miniAppId;
	}

	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}
	public String getMiniAppName() {
		return this.miniAppName;
	}

	public void setMiniAppScreenshot(FileItem miniAppScreenshot) {
		this.miniAppScreenshot = miniAppScreenshot;
	}
	public FileItem getMiniAppScreenshot() {
		return this.miniAppScreenshot;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public String getMobileType() {
		return this.mobileType;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate() {
		return this.rate;
	}

	public void setShopCityCode(String shopCityCode) {
		this.shopCityCode = shopCityCode;
	}
	public String getShopCityCode() {
		return this.shopCityCode;
	}

	public void setShopDetailAddress(String shopDetailAddress) {
		this.shopDetailAddress = shopDetailAddress;
	}
	public String getShopDetailAddress() {
		return this.shopDetailAddress;
	}

	public void setShopDistrictCode(String shopDistrictCode) {
		this.shopDistrictCode = shopDistrictCode;
	}
	public String getShopDistrictCode() {
		return this.shopDistrictCode;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName() {
		return this.shopName;
	}

	public void setShopProvinceCode(String shopProvinceCode) {
		this.shopProvinceCode = shopProvinceCode;
	}
	public String getShopProvinceCode() {
		return this.shopProvinceCode;
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

	public void setSpecialLicenseType(String specialLicenseType) {
		this.specialLicenseType = specialLicenseType;
	}
	public String getSpecialLicenseType() {
		return this.specialLicenseType;
	}

	public void setTradeScene(String tradeScene) {
		this.tradeScene = tradeScene;
	}
	public String getTradeScene() {
		return this.tradeScene;
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
		txtParams.put("app_market", this.appMarket);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_status", this.appStatus);
		txtParams.put("app_test_account", this.appTestAccount);
		txtParams.put("app_test_account_password", this.appTestAccountPassword);
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("download_link", this.downloadLink);
		txtParams.put("h_5_memo", this.h5Memo);
		txtParams.put("h_5_sites", this.h5Sites);
		txtParams.put("h_5_status", this.h5Status);
		txtParams.put("life_app_id", this.lifeAppId);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("mini_app_id", this.miniAppId);
		txtParams.put("mini_app_name", this.miniAppName);
		txtParams.put("mobile_type", this.mobileType);
		txtParams.put("product_code", this.productCode);
		txtParams.put("rate", this.rate);
		txtParams.put("shop_city_code", this.shopCityCode);
		txtParams.put("shop_detail_address", this.shopDetailAddress);
		txtParams.put("shop_district_code", this.shopDistrictCode);
		txtParams.put("shop_name", this.shopName);
		txtParams.put("shop_province_code", this.shopProvinceCode);
		txtParams.put("special_license_type", this.specialLicenseType);
		txtParams.put("trade_scene", this.tradeScene);
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
		params.put("app_auth_pic", this.appAuthPic);
		params.put("app_demo", this.appDemo);
		params.put("app_home_screenshot", this.appHomeScreenshot);
		params.put("app_item_screenshot", this.appItemScreenshot);
		params.put("app_pay_screenshot", this.appPayScreenshot);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("h_5_extra_pic", this.h5ExtraPic);
		params.put("h_5_home_screenshot", this.h5HomeScreenshot);
		params.put("h_5_item_screenshot", this.h5ItemScreenshot);
		params.put("h_5_pay_screenshot", this.h5PayScreenshot);
		params.put("h_5_sites_loa", this.h5SitesLoa);
		params.put("mini_app_screenshot", this.miniAppScreenshot);
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
