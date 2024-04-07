package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceEcEnterpriseAuthApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.auth.apply request
 * 
 * @author auto create
 * @since 1.0, 2024-03-18 16:21:58
 */
public class AlipayCommerceEcEnterpriseAuthApplyRequest implements AlipayRequest<AlipayCommerceEcEnterpriseAuthApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 统一社会信用代码
	 */
	private String enterpriseCode;

	/** 
	* 企业ID
	 */
	private String enterpriseId;

	/** 
	* 企业名称
	 */
	private String enterpriseName;

	/** 
	* 营业执照文件ID
	 */
	private String fileId;

	/** 
	* 法人身份证号：
快速创建，小二代入驻非必填。
普通创建，企业自入驻必填。
	 */
	private String legalIdNumber;

	/** 
	* 法人姓名
	 */
	private String legalName;

	/** 
	* 营业执照截止日期，时间格式：yyyy-MM-dd
	 */
	private String licenseEndDate;

	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}
	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId() {
		return this.fileId;
	}

	public void setLegalIdNumber(String legalIdNumber) {
		this.legalIdNumber = legalIdNumber;
	}
	public String getLegalIdNumber() {
		return this.legalIdNumber;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalName() {
		return this.legalName;
	}

	public void setLicenseEndDate(String licenseEndDate) {
		this.licenseEndDate = licenseEndDate;
	}
	public String getLicenseEndDate() {
		return this.licenseEndDate;
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
		return "alipay.commerce.ec.enterprise.auth.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("enterprise_code", this.enterpriseCode);
		txtParams.put("enterprise_id", this.enterpriseId);
		txtParams.put("enterprise_name", this.enterpriseName);
		txtParams.put("file_id", this.fileId);
		txtParams.put("legal_id_number", this.legalIdNumber);
		txtParams.put("legal_name", this.legalName);
		txtParams.put("license_end_date", this.licenseEndDate);
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

	public Class<AlipayCommerceEcEnterpriseAuthApplyResponse> getResponseClass() {
		return AlipayCommerceEcEnterpriseAuthApplyResponse.class;
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
