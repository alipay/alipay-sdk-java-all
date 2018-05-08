package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.create request
 * 
 * @author auto create
 * @since 1.0, 2017-12-18 14:57:49
 */
public class AlipayOpenPublicLifeCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 背景图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方背景图位置，后缀是jpg或者jpeg，图片大小限制1mb
	 */
	private FileItem background;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人姓名
	 */
	private String contactName;

	/** 
	* 联系人电话
	 */
	private String contactTel;

	/** 
	* 客服电话，可以是电话号码，手机号码，400电话
	 */
	private String customerTel;

	/** 
	* 生活号简介，此内容显示在支付宝客户端生活号主页简介区块
	 */
	private String description;

	/** 
	* 扩展数据JSON串
	 */
	private String extendData;

	/** 
	* 生活号名称
	 */
	private String lifeName;

	/** 
	* logo图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方位置，后缀是jpg或者jpeg，图片大小限制1mb，图片最小150px ，图片建议为是正方形
	 */
	private FileItem logo;

	/** 
	* mcc code
	 */
	private String mccCode;

	/** 
	* 目前只支持 LIFE_APP：应用号
	 */
	private String publicBizType;

	/** 
	* 生活号前端展示类型
	 */
	private String showStyle;

	/** 
	* 支付宝用户id，由支付宝同学提供用户id，为该生活号对应pid
	 */
	private String userId;

	public void setBackground(FileItem background) {
		this.background = background;
	}
	public FileItem getBackground() {
		return this.background;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName() {
		return this.contactName;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getContactTel() {
		return this.contactTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getCustomerTel() {
		return this.customerTel;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}

	public void setExtendData(String extendData) {
		this.extendData = extendData;
	}
	public String getExtendData() {
		return this.extendData;
	}

	public void setLifeName(String lifeName) {
		this.lifeName = lifeName;
	}
	public String getLifeName() {
		return this.lifeName;
	}

	public void setLogo(FileItem logo) {
		this.logo = logo;
	}
	public FileItem getLogo() {
		return this.logo;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode() {
		return this.mccCode;
	}

	public void setPublicBizType(String publicBizType) {
		this.publicBizType = publicBizType;
	}
	public String getPublicBizType() {
		return this.publicBizType;
	}

	public void setShowStyle(String showStyle) {
		this.showStyle = showStyle;
	}
	public String getShowStyle() {
		return this.showStyle;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.open.public.life.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_tel", this.contactTel);
		txtParams.put("customer_tel", this.customerTel);
		txtParams.put("description", this.description);
		txtParams.put("extend_data", this.extendData);
		txtParams.put("life_name", this.lifeName);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("public_biz_type", this.publicBizType);
		txtParams.put("show_style", this.showStyle);
		txtParams.put("user_id", this.userId);
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
		params.put("background", this.background);
		params.put("logo", this.logo);
		return params;
	}

	public Class<AlipayOpenPublicLifeCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeCreateResponse.class;
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
