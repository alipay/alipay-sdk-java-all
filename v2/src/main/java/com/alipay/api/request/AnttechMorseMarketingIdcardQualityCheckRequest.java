package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AnttechMorseMarketingIdcardQualityCheckResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: anttech.morse.marketing.idcard.quality.check request
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 22:47:53
 */
public class AnttechMorseMarketingIdcardQualityCheckRequest implements AlipayUploadRequest<AnttechMorseMarketingIdcardQualityCheckResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 上传的文件流
	 */
	private FileItem fileContent;

	/** 
	* 质检策略，控制校验哪些维度
	 */
	private String qualityStrategy;

	/** 
	* 调用方生成的请求唯一标识；实现采用时间戳，作为幂等键
	 */
	private String requestId;

	/** 
	* 证件面：emblem=正面（国徽面）/ portrait=背面（人像面），大小写容错
	 */
	private String side;

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setQualityStrategy(String qualityStrategy) {
		this.qualityStrategy = qualityStrategy;
	}
	public String getQualityStrategy() {
		return this.qualityStrategy;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId() {
		return this.requestId;
	}

	public void setSide(String side) {
		this.side = side;
	}
	public String getSide() {
		return this.side;
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
		return "anttech.morse.marketing.idcard.quality.check";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("quality_strategy", this.qualityStrategy);
		txtParams.put("request_id", this.requestId);
		txtParams.put("side", this.side);
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

	public Class<AnttechMorseMarketingIdcardQualityCheckResponse> getResponseClass() {
		return AnttechMorseMarketingIdcardQualityCheckResponse.class;
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
