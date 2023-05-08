package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniAmpeEnterApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.ampe.enter.apply request
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:39:08
 */
public class AlipayOpenMiniAmpeEnterApplyRequest implements AlipayUploadRequest<AlipayOpenMiniAmpeEnterApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 详细地址
	 */
	private String address;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人姓名
	 */
	private String contactName;

	/** 
	* 联系人手机号
	 */
	private String contactPhone;

	/** 
	* 厂商名称，必填，最大长度为128
	 */
	private String enterpriseName;

	/** 
	* 介绍资料，选填，最小为1k，最大不能超过10MB，文件格式支持zip，rar，jpg，png，doc，docx，pdf
	 */
	private FileItem introductionFile;

	/** 
	* 企业营业执照照片二进制流，必填，最小为1k，最大不能超过5MB，图片格式支持jpg，png
	 */
	private FileItem licensePic;

	/** 
	* 主营产品信息，选填
	 */
	private String majorProducts;

	/** 
	* 企业官网，选填，最大长度为128
	 */
	private String officialWebsite;

	/** 
	* 场景码，申请后平台分配，必填
	 */
	private String sceneCode;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
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

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setIntroductionFile(FileItem introductionFile) {
		this.introductionFile = introductionFile;
	}
	public FileItem getIntroductionFile() {
		return this.introductionFile;
	}

	public void setLicensePic(FileItem licensePic) {
		this.licensePic = licensePic;
	}
	public FileItem getLicensePic() {
		return this.licensePic;
	}

	public void setMajorProducts(String majorProducts) {
		this.majorProducts = majorProducts;
	}
	public String getMajorProducts() {
		return this.majorProducts;
	}

	public void setOfficialWebsite(String officialWebsite) {
		this.officialWebsite = officialWebsite;
	}
	public String getOfficialWebsite() {
		return this.officialWebsite;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
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
		return "alipay.open.mini.ampe.enter.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("address", this.address);
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_phone", this.contactPhone);
		txtParams.put("enterprise_name", this.enterpriseName);
		txtParams.put("major_products", this.majorProducts);
		txtParams.put("official_website", this.officialWebsite);
		txtParams.put("scene_code", this.sceneCode);
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
		params.put("introduction_file", this.introductionFile);
		params.put("license_pic", this.licensePic);
		return params;
	}

	public Class<AlipayOpenMiniAmpeEnterApplyResponse> getResponseClass() {
		return AlipayOpenMiniAmpeEnterApplyResponse.class;
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
