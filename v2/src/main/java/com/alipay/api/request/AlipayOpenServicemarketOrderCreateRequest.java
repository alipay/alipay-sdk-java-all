package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenServicemarketOrderCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.servicemarket.order.create request
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:25:31
 */
public class AlipayOpenServicemarketOrderCreateRequest implements AlipayUploadRequest<AlipayOpenServicemarketOrderCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 11_12;12_13。小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.alipay.com/isv/10325
	 */
	private String appCategoryIds;

	/** 
	* 小程序官方示例Demo，展示已支持的接口能力及组件。
	 */
	private String appDesc;

	/** 
	* 小程序应用英文名称
	 */
	private String appEnglishName;

	/** 
	* 小程序应用logo图标，图片格式必须为：png、jpeg、jpg，建议上传像素为180*180
	 */
	private FileItem appLogo;

	/** 
	* 小程序应用名称
	 */
	private String appName;

	/** 
	* 来源的业务方，需要申请
	 */
	private String appOrigin;

	/** 
	* 小程序应用简介，一句话描述小程序功能
	 */
	private String appSlogan;

	/** 
	* 订购的服务商品ID所在的市场编码。新接入场景必须传递，具体值请联系产品分配。
	 */
	private String marketCode;

	/** 
	* 订购的服务商品ID
	 */
	private String merchandiseId;

	/** 
	* 商户PID
	 */
	private String merchantPid;

	/** 
	* 一二方支持传入appId
	 */
	private String miniAppId;

	/** 
	* 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	private String miniCategoryIds;

	/** 
	* 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	private String outBizNo;

	/** 
	* 小程序客服邮箱
	 */
	private String serviceEmail;

	/** 
	* 小程序客服电话
	 */
	private String servicePhone;

	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}
	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}
	public String getAppEnglishName() {
		return this.appEnglishName;
	}

	public void setAppLogo(FileItem appLogo) {
		this.appLogo = appLogo;
	}
	public FileItem getAppLogo() {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}
	public String getAppOrigin() {
		return this.appOrigin;
	}

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan() {
		return this.appSlogan;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}
	public String getMarketCode() {
		return this.marketCode;
	}

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}
	public String getMerchandiseId() {
		return this.merchandiseId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid() {
		return this.merchantPid;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId() {
		return this.miniAppId;
	}

	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}
	public String getMiniCategoryIds() {
		return this.miniCategoryIds;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}
	public String getServiceEmail() {
		return this.serviceEmail;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone() {
		return this.servicePhone;
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
		return "alipay.open.servicemarket.order.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_origin", this.appOrigin);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("market_code", this.marketCode);
		txtParams.put("merchandise_id", this.merchandiseId);
		txtParams.put("merchant_pid", this.merchantPid);
		txtParams.put("mini_app_id", this.miniAppId);
		txtParams.put("mini_category_ids", this.miniCategoryIds);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
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
		params.put("app_logo", this.appLogo);
		return params;
	}

	public Class<AlipayOpenServicemarketOrderCreateResponse> getResponseClass() {
		return AlipayOpenServicemarketOrderCreateResponse.class;
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
