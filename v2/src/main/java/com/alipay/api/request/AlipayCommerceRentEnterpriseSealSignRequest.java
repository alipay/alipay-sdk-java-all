package com.alipay.api.request;

import com.alipay.api.domain.SignAreaRequest;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceRentEnterpriseSealSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.rent.enterprise.seal.sign request
 * 
 * @author auto create
 * @since 1.0, 2025-03-07 11:02:29
 */
public class AlipayCommerceRentEnterpriseSealSignRequest implements AlipayUploadRequest<AlipayCommerceRentEnterpriseSealSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务描述
	 */
	private String bizDesc;

	/** 
	* 业务名称
	 */
	private String bizName;

	/** 
	* 业务流水号
	 */
	private String bizNo;

	/** 
	* 上传的合同PDF文件
	 */
	private FileItem fileContent;

	/** 
	* 预授权订单号
	 */
	private String preAuthNo;

	/** 
	* 企业签署区域信息
	 */
	private SignAreaRequest signAreaOrg;

	/** 
	* 用户个人签署区域信息
	 */
	private SignAreaRequest signAreaPerson;

	/** 
	* 签署用户身份证件号
	 */
	private String signerUserCertNumber;

	/** 
	* 签署用户个人姓名
	 */
	private String signerUserName;

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc() {
		return this.bizDesc;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getBizName() {
		return this.bizName;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setPreAuthNo(String preAuthNo) {
		this.preAuthNo = preAuthNo;
	}
	public String getPreAuthNo() {
		return this.preAuthNo;
	}

	public void setSignAreaOrg(SignAreaRequest signAreaOrg) {
		this.signAreaOrg = signAreaOrg;
	}
	public SignAreaRequest getSignAreaOrg() {
		return this.signAreaOrg;
	}

	public void setSignAreaPerson(SignAreaRequest signAreaPerson) {
		this.signAreaPerson = signAreaPerson;
	}
	public SignAreaRequest getSignAreaPerson() {
		return this.signAreaPerson;
	}

	public void setSignerUserCertNumber(String signerUserCertNumber) {
		this.signerUserCertNumber = signerUserCertNumber;
	}
	public String getSignerUserCertNumber() {
		return this.signerUserCertNumber;
	}

	public void setSignerUserName(String signerUserName) {
		this.signerUserName = signerUserName;
	}
	public String getSignerUserName() {
		return this.signerUserName;
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
		return "alipay.commerce.rent.enterprise.seal.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_desc", this.bizDesc);
		txtParams.put("biz_name", this.bizName);
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("pre_auth_no", this.preAuthNo);
		txtParams.put("sign_area_org", this.signAreaOrg == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.signAreaOrg, true));
		txtParams.put("sign_area_person", this.signAreaPerson == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.signAreaPerson, true));
		txtParams.put("signer_user_cert_number", this.signerUserCertNumber);
		txtParams.put("signer_user_name", this.signerUserName);
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

	public Class<AlipayCommerceRentEnterpriseSealSignResponse> getResponseClass() {
		return AlipayCommerceRentEnterpriseSealSignResponse.class;
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
