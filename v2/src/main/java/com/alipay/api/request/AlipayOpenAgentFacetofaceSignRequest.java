package com.alipay.api.request;

import com.alipay.api.domain.SignAddressInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentFacetofaceSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.facetoface.sign request
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:34:26
 */
public class AlipayOpenAgentFacetofaceSignRequest implements AlipayUploadRequest<AlipayOpenAgentFacetofaceSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代商户操作事务编号，通过https://opendocs.alipay.com/apis/api_50/alipay.open.agent.create (开启代商户签约、创建应用事务)接口进行事务创建后获取。
	 */
	private String batchNo;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填
	 */
	private String businessLicenseMobile;

	/** 
	* 营业执照号码
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片。被代创建商户运营主体为个人账户必填，企业账户无需填写，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
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
	* 商家经营类目编码。参见 <a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目2.0</a> 中的“一级类目code_二级类目code”。
	 */
	private String mccCode;

	/** 
	* 服务费率（%），0.38~0.6 之间（小数点后两位，可取0.38%及0.6%）。
当签约且授权标识 sign_and_auth=true 时，该费率信息必填。
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
	* 店铺内景图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 签约且授权标识，默认为false，只进行签约操作； 如果设置为true，则表示签约成功后，会自动进行应用授权操作。
	 */
	private Boolean signAndAuth;

	/** 
	* 企业特殊资质图片，当mcc_code为需要特殊资质类目时必填。可参考
<a href="https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE">商家经营类目</a> 中的“所需资质”，最小5KB ，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

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

	public void setSignAndAuth(Boolean signAndAuth) {
		this.signAndAuth = signAndAuth;
	}
	public Boolean getSignAndAuth() {
		return this.signAndAuth;
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
		return "alipay.open.agent.facetoface.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_mobile", this.businessLicenseMobile);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("rate", this.rate);
		txtParams.put("shop_address", this.shopAddress == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.shopAddress, true));
		txtParams.put("shop_name", this.shopName);
		txtParams.put("sign_and_auth", this.signAndAuth);
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
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentFacetofaceSignResponse> getResponseClass() {
		return AlipayOpenAgentFacetofaceSignResponse.class;
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
