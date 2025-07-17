package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayUserDtbankCrowdCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.user.dtbank.crowd.create request
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 13:52:33
 */
public class AlipayUserDtbankCrowdCreateRequest implements AlipayUploadRequest<AlipayUserDtbankCrowdCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 人群名称
	 */
	private String crowdName;

	/** 
	* 文件内容的二进制流，最大500M
	 */
	private FileItem fileContent;

	/** 
	* 机构ID
	 */
	private String instId;

	/** 
	* 外部业务单号
	 */
	private String outBizNo;

	/** 
	* 仅支持网联协议号/手机号
	 */
	private String userInfo;

	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}
	public String getCrowdName() {
		return this.crowdName;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId() {
		return this.instId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public String getUserInfo() {
		return this.userInfo;
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
		return "alipay.user.dtbank.crowd.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("crowd_name", this.crowdName);
		txtParams.put("inst_id", this.instId);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("user_info", this.userInfo);
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

	public Class<AlipayUserDtbankCrowdCreateResponse> getResponseClass() {
		return AlipayUserDtbankCrowdCreateResponse.class;
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
