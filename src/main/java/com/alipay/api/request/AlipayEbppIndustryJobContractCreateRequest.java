package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.ContractSignArea;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppIndustryJobContractCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.industry.job.contract.create request
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 14:26:49
 */
public class AlipayEbppIndustryJobContractCreateRequest implements AlipayUploadRequest<AlipayEbppIndustryJobContractCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户身份证号码
	 */
	private String certNo;

	/** 
	* 企业信用代码或者营业执照注册号
	 */
	private String companyCertNo;

	/** 
	* 企业名称
	 */
	private String companyName;

	/** 
	* 上传文件的二进制流
	 */
	private FileItem fileContent;

	/** 
	* 企业法人身份证号码
	 */
	private String legalPersonCertNo;

	/** 
	* 企业法人名称
	 */
	private String legalPersonName;

	/** 
	* 蚂蚁统一会员ID
	 */
	private String openId;

	/** 
	* 外部订单号
	 */
	private String outerBizNo;

	/** 
	* 电子合同签署区配置，必须包含个人和企业两部分信息
	 */
	private List<ContractSignArea> signArea;

	/** 
	* 签署平台: H5 或者 ALIPAY
	 */
	private String signPlatform;

	/** 
	* 蚂蚁统一会员ID
	 */
	private String userId;

	/** 
	* 用户名称
	 */
	private String userName;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}
	public String getCompanyCertNo() {
		return this.companyCertNo;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return this.companyName;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}
	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
	}

	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}
	public String getOuterBizNo() {
		return this.outerBizNo;
	}

	public void setSignArea(List<ContractSignArea> signArea) {
		this.signArea = signArea;
	}
	public List<ContractSignArea> getSignArea() {
		return this.signArea;
	}

	public void setSignPlatform(String signPlatform) {
		this.signPlatform = signPlatform;
	}
	public String getSignPlatform() {
		return this.signPlatform;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
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
		return "alipay.ebpp.industry.job.contract.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("cert_no", this.certNo);
		txtParams.put("company_cert_no", this.companyCertNo);
		txtParams.put("company_name", this.companyName);
		txtParams.put("legal_person_cert_no", this.legalPersonCertNo);
		txtParams.put("legal_person_name", this.legalPersonName);
		txtParams.put("open_id", this.openId);
		txtParams.put("outer_biz_no", this.outerBizNo);
		txtParams.put("sign_area", this.signArea == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.signArea, true));
		txtParams.put("sign_platform", this.signPlatform);
		txtParams.put("user_id", this.userId);
		txtParams.put("user_name", this.userName);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayEbppIndustryJobContractCreateResponse> getResponseClass() {
		return AlipayEbppIndustryJobContractCreateResponse.class;
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
