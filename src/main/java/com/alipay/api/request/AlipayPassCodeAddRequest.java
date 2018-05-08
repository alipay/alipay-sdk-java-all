package com.alipay.api.request;

import java.util.List;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPassCodeAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.code.add request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:12
 */
public class AlipayPassCodeAddRequest implements AlipayRequest<AlipayPassCodeAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* alipass文件Base64编码后的内容。
	 */
	private String fileContent;

	/** 
	* 识别信息
当 recognition_type=1时， recognition_info={“partner_id”:”2088102114633762”,“out_trade_no”:”1234567”}
当recognition_type=2时， recognition_info={“user_id”:”2088102114633761“ }
	 */
	private String recognitionInfo;

	/** 
	* 发放对象识别类型
1-	订单信息
2-	支付宝userId
	 */
	private String recognitionType;

	/** 
	* 该pass的核销方式,如果为空，则默认为["wave","qrcode"]
	 */
	private List<String> verifyType;

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	public String getFileContent() {
		return this.fileContent;
	}

	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}
	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}

	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}
	public String getRecognitionType() {
		return this.recognitionType;
	}

	public void setVerifyType(List<String> verifyType) {
		this.verifyType = verifyType;
	}
	public List<String> getVerifyType() {
		return this.verifyType;
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
		return "alipay.pass.code.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("file_content", this.fileContent);
		txtParams.put("recognition_info", this.recognitionInfo);
		txtParams.put("recognition_type", this.recognitionType);
		txtParams.put("verify_type", this.verifyType == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.verifyType, true));
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

	public Class<AlipayPassCodeAddResponse> getResponseClass() {
		return AlipayPassCodeAddResponse.class;
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
