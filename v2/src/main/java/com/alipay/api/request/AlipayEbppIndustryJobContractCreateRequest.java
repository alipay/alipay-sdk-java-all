package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.ContractCompanyInfo;
import com.alipay.api.domain.ContractUserInfo;
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
 * @since 1.0, 2024-03-01 16:34:28
 */
public class AlipayEbppIndustryJobContractCreateRequest implements AlipayUploadRequest<AlipayEbppIndustryJobContractCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 企业列表
	 */
	private List<ContractCompanyInfo> companyList;

	/** 
	* 合同签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致
	 */
	private String failureRedirectUrl;

	/** 
	* 上传文件的二进制流
	 */
	private FileItem fileContent;

	/** 
	* 签署状态变更时的通知地址
	 */
	private String noticeUrl;

	/** 
	* 外部订单号
	 */
	private String outerBizNo;

	/** 
	* 签署成功后的重定向跳转地址
	 */
	private String redirectUrl;

	/** 
	* 签署平台: H5 或者 ALIPAY
	 */
	private String signPlatform;

	/** 
	* 合同用户列表
	 */
	private List<ContractUserInfo> userList;

	public void setCompanyList(List<ContractCompanyInfo> companyList) {
		this.companyList = companyList;
	}
	public List<ContractCompanyInfo> getCompanyList() {
		return this.companyList;
	}

	public void setFailureRedirectUrl(String failureRedirectUrl) {
		this.failureRedirectUrl = failureRedirectUrl;
	}
	public String getFailureRedirectUrl() {
		return this.failureRedirectUrl;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}
	public String getNoticeUrl() {
		return this.noticeUrl;
	}

	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}
	public String getOuterBizNo() {
		return this.outerBizNo;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl() {
		return this.redirectUrl;
	}

	public void setSignPlatform(String signPlatform) {
		this.signPlatform = signPlatform;
	}
	public String getSignPlatform() {
		return this.signPlatform;
	}

	public void setUserList(List<ContractUserInfo> userList) {
		this.userList = userList;
	}
	public List<ContractUserInfo> getUserList() {
		return this.userList;
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
		txtParams.put("company_list", this.companyList == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.companyList, true));
		txtParams.put("failure_redirect_url", this.failureRedirectUrl);
		txtParams.put("notice_url", this.noticeUrl);
		txtParams.put("outer_biz_no", this.outerBizNo);
		txtParams.put("redirect_url", this.redirectUrl);
		txtParams.put("sign_platform", this.signPlatform);
		txtParams.put("user_list", this.userList == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.userList, true));
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
