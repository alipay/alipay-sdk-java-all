package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniAppAgentCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.app.agent.create request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:35
 */
public class AlipayOpenMiniAppAgentCreateRequest implements AlipayUploadRequest<AlipayOpenMiniAppAgentCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商家小程序描述信息，简要描述小程序主要功能（20-200个字），例：xx小程序提供了xx功能，主要解决了XX问题。
	 */
	private String appDesc;

	/** 
	* 小程序logo图片文件，最大256KB，长宽比1:1, 不允许涉及政治敏感与色情；图片格式必须为：png、jpeg、jpg，建议上传像素为180*180
	 */
	private FileItem appLogo;

	/** 
	* 小程序的中文名称，3-40个字符，一个中文对应两个字符，必须全局唯一，详细规则可参见名称审核规范：https://opendocs.alipay.com/mini/operation/standard/auditing/name
	 */
	private String appName;

	/** 
	* 小程序的简介，用于简短描述小程序提供的功能，10-32个字符，一个中文两个字符，详细的审核规范请参见：https://opendocs.alipay.com/mini/operation/standard/auditing/cvdkep
	 */
	private String appSlogan;

	/** 
	* 联系人姓名，仅仅在开发者从未入驻过开放平台的情况下需要提供该字段
	 */
	private String contactName;

	/** 
	* 开发者联系人信息，仅在开发者从未入驻过开放平台的情况下需要提供；如果开发者已经入驻过开放平台，那么该字段无需提供。
	 */
	private String contactPhone;

	/** 
	* 支付宝会员用户登录号，如果是企业账户，应该使用企业的支付宝登录号，
	 */
	private String loginId;

	/** 
	* 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list，需要注意个人账户类目是受限的，不能使用企业类目，但是企业可以使用个人类目。
	 */
	private String miniCategoryIds;

	/** 
	* 外部业务号
	 */
	private String outBizNo;

	/** 
	* 商家小程序的客服电话，用于向用户展示客服信息
	 */
	private String servicePhone;

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc() {
		return this.appDesc;
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

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan() {
		return this.appSlogan;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName() {
		return this.contactName;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId() {
		return this.loginId;
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
		return "alipay.open.mini.app.agent.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_phone", this.contactPhone);
		txtParams.put("login_id", this.loginId);
		txtParams.put("mini_category_ids", this.miniCategoryIds);
		txtParams.put("out_biz_no", this.outBizNo);
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

	public Class<AlipayOpenMiniAppAgentCreateResponse> getResponseClass() {
		return AlipayOpenMiniAppAgentCreateResponse.class;
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
