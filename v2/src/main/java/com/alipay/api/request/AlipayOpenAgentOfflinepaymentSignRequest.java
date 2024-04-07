package com.alipay.api.request;

import com.alipay.api.domain.SignAddressInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentOfflinepaymentSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.offlinepayment.sign request
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:44:31
 */
public class AlipayOpenAgentOfflinepaymentSignRequest implements AlipayUploadRequest<AlipayOpenAgentOfflinepaymentSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代商户操作事务编号，通过alipay.open.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填
	 */
	private String businessLicenseMobile;

	/** 
	* 营业执照号码。若填写，请与以下营业执照图片、期限、一起提供。
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片。被代创建商户运营主体为个人账户必填，企业账户无需填写，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicensePic;

	/** 
	* 营业期限
	 */
	private String dateLimitation;

	/** 
	* 送货地址
	 */
	private SignAddressInfo deliveryAddress;

	/** 
	* 营业期限是否长期有效
	 */
	private Boolean longTerm;

	/** 
	* 所属MCCCode，可参考
<a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 服务费率（%），0.38~3之间，精确到0.01
	 */
	private String rate;

	/** 
	* 店铺地址
	 */
	private SignAddressInfo shopAddress;

	/** 
	* 店铺名称
	 */
	private String shopName;

	/** 
	* 店铺内景照片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，需要包括招牌信息。最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目</a> 中的“需要的特殊资质证书”，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo() {
		return this.batchNo;
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

	public void setDeliveryAddress(SignAddressInfo deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public SignAddressInfo getDeliveryAddress() {
		return this.deliveryAddress;
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

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate() {
		return this.rate;
	}

	public void setShopAddress(SignAddressInfo shopAddress) {
		this.shopAddress = shopAddress;
	}
	public SignAddressInfo getShopAddress() {
		return this.shopAddress;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName() {
		return this.shopName;
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
		return "alipay.open.agent.offlinepayment.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_mobile", this.businessLicenseMobile);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("delivery_address", this.deliveryAddress == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.deliveryAddress, true));
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("rate", this.rate);
		txtParams.put("shop_address", this.shopAddress == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.shopAddress, true));
		txtParams.put("shop_name", this.shopName);
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
		params.put("business_license_pic", this.businessLicensePic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentOfflinepaymentSignResponse> getResponseClass() {
		return AlipayOpenAgentOfflinepaymentSignResponse.class;
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
