package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.DatadigitalFincloudGeneralsaasOcrLlmDetectResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.ocr.llm.detect request
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 17:27:57
 */
public class DatadigitalFincloudGeneralsaasOcrLlmDetectRequest implements AlipayUploadRequest<DatadigitalFincloudGeneralsaasOcrLlmDetectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 指定需要提取的字段名称，类型为字符串数组，字段名可自定义，与 ocr_type 互不约束。传入非空数组时按指定字段结构化抽取；不传或传空数组时，按材料类型默认字段或通用模式抽取。
	 */
	private List<String> extractFields;

	/** 
	* 二进制流图片，大小限制1M
	 */
	private FileItem fileContent;

	/** 
	* 待识别图片的材料类型。传入枚举编码时按对应材料默认字段抽取；不传或传 OTHER 时使用通用识别模式。可通过 extract_fields 指定需要提取的字段。
	 */
	private String ocrType;

	/** 
	* 客户业务单据号，请保证幂等性。
	 */
	private String outerOrderNo;

	/** 
	* 大模型识别提示词
	 */
	private String prompt;

	public void setExtractFields(List<String> extractFields) {
		this.extractFields = extractFields;
	}
	public List<String> getExtractFields() {
		return this.extractFields;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setOcrType(String ocrType) {
		this.ocrType = ocrType;
	}
	public String getOcrType() {
		return this.ocrType;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}
	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getPrompt() {
		return this.prompt;
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
		return "datadigital.fincloud.generalsaas.ocr.llm.detect";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("extract_fields", this.extractFields == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.extractFields, true));
		txtParams.put("ocr_type", this.ocrType);
		txtParams.put("outer_order_no", this.outerOrderNo);
		txtParams.put("prompt", this.prompt);
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

	public Class<DatadigitalFincloudGeneralsaasOcrLlmDetectResponse> getResponseClass() {
		return DatadigitalFincloudGeneralsaasOcrLlmDetectResponse.class;
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
