package com.alipay.api.request;

import com.alipay.api.domain.RainyComplexTypesTheThirteen;
import com.alipay.api.domain.RainyComplexTypesTheFifteenOne;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataDataserviceSchemaapitwentyRainystestQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapitwenty.rainystest.query request
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 18:29:48
 */
public class AlipayDataDataserviceSchemaapitwentyRainystestQueryRequest implements AlipayRequest<AlipayDataDataserviceSchemaapitwentyRainystestQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 测试数据，强引用复杂类型示例
	 */
	private RainyComplexTypesTheThirteen demoStrongRef;

	/** 
	* 测试数据，弱引用复杂类型示例
	 */
	private RainyComplexTypesTheFifteenOne demoWinkRef;

	public void setDemoStrongRef(RainyComplexTypesTheThirteen demoStrongRef) {
		this.demoStrongRef = demoStrongRef;
	}
	public RainyComplexTypesTheThirteen getDemoStrongRef() {
		return this.demoStrongRef;
	}

	public void setDemoWinkRef(RainyComplexTypesTheFifteenOne demoWinkRef) {
		this.demoWinkRef = demoWinkRef;
	}
	public RainyComplexTypesTheFifteenOne getDemoWinkRef() {
		return this.demoWinkRef;
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
		return "alipay.data.dataservice.schemaapitwenty.rainystest.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("demo_strong_ref", this.demoStrongRef == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.demoStrongRef, true));
		txtParams.put("demo_wink_ref", this.demoWinkRef == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.demoWinkRef, true));
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

	public Class<AlipayDataDataserviceSchemaapitwentyRainystestQueryResponse> getResponseClass() {
		return AlipayDataDataserviceSchemaapitwentyRainystestQueryResponse.class;
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
