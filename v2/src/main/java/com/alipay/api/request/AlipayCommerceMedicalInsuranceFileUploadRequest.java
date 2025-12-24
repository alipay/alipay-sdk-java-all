package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceMedicalInsuranceFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 17:57:42
 */
public class AlipayCommerceMedicalInsuranceFileUploadRequest implements AlipayUploadRequest<AlipayCommerceMedicalInsuranceFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 理赔申请号（保司）
	 */
	private String applyNo;

	/** 
	* 支付宝生成的业务流水号
	 */
	private String bizNo;

	/** 
	* 报案号（保司）
	 */
	private String claimNo;

	/** 
	* 支付宝给出固定值,见接口文档附录
	 */
	private String claimStatus;

	/** 
	* 保司类型
	 */
	private String companyType;

	/** 
	* 文件内容
	 */
	private FileItem fileContent;

	/** 
	* 理赔通知书文件编码
	 */
	private String fileNo;

	/** 
	* 支付宝open_id
	 */
	private String openId;

	/** 
	* 支付宝user_id
	 */
	private String userId;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getClaimStatus() {
		return this.claimStatus;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyType() {
		return this.companyType;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileNo() {
		return this.fileNo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
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
		return "alipay.commerce.medical.insurance.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apply_no", this.applyNo);
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("claim_no", this.claimNo);
		txtParams.put("claim_status", this.claimStatus);
		txtParams.put("company_type", this.companyType);
		txtParams.put("file_no", this.fileNo);
		txtParams.put("open_id", this.openId);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayCommerceMedicalInsuranceFileUploadResponse> getResponseClass() {
		return AlipayCommerceMedicalInsuranceFileUploadResponse.class;
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
