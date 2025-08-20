package com.alipay.api.request;

import com.alipay.api.domain.RainyComplexTypesTheThirteen;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataDataserviceTreeapitwelveRainystestQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.dataservice.treeapitwelve.rainystest.query request
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:11
 */
public class AlipayDataDataserviceTreeapitwelveRainystestQueryRequest implements AlipayUploadRequest<AlipayDataDataserviceTreeapitwelveRainystestQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 测试数据
	 */
	private FileItem demoField;

	/** 
	* 测试
	 */
	private RainyComplexTypesTheThirteen refCase;

	public void setDemoField(FileItem demoField) {
		this.demoField = demoField;
	}
	public FileItem getDemoField() {
		return this.demoField;
	}

	public void setRefCase(RainyComplexTypesTheThirteen refCase) {
		this.refCase = refCase;
	}
	public RainyComplexTypesTheThirteen getRefCase() {
		return this.refCase;
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
		return "alipay.data.dataservice.treeapitwelve.rainystest.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("ref_case", this.refCase == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.refCase, true));
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
		params.put("demo_field", this.demoField);
		return params;
	}

	public Class<AlipayDataDataserviceTreeapitwelveRainystestQueryResponse> getResponseClass() {
		return AlipayDataDataserviceTreeapitwelveRainystestQueryResponse.class;
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
