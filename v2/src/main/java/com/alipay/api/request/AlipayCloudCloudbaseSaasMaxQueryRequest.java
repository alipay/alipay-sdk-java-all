package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCloudCloudbaseSaasMaxQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.cloud.cloudbase.saas.max.query request
 * 
 * @author auto create
 * @since 1.0, 2023-08-01 11:06:52
 */
public class AlipayCloudCloudbaseSaasMaxQueryRequest implements AlipayRequest<AlipayCloudCloudbaseSaasMaxQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* appid
	 */
	private String bizAppId;

	/** 
	* 默认值RAW
	 */
	private String imageType;

	/** 
	* 图片值，根据图片image_type填写
	 */
	private String imageValue;

	/** 
	* 默认可不填，具体版本值咨询模型服务提供者
	 */
	private String modelVersion;

	/** 
	* 模型路由规则，默认值UA
	 */
	private String route;

	/** 
	* 模型服务编码，具体值咨询模型服务提供者
	 */
	private String serviceCode;

	/** 
	* 默认值auto，即不区分正反面
	 */
	private String side;

	/** 
	* 模型服务uri，具体值咨询模型服务提供者
	 */
	private String uri;

	/** 
	* 是否开启iot，默认false
	 */
	private Boolean useIot;

	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}
	public String getBizAppId() {
		return this.bizAppId;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType() {
		return this.imageType;
	}

	public void setImageValue(String imageValue) {
		this.imageValue = imageValue;
	}
	public String getImageValue() {
		return this.imageValue;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	public String getRoute() {
		return this.route;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setSide(String side) {
		this.side = side;
	}
	public String getSide() {
		return this.side;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getUri() {
		return this.uri;
	}

	public void setUseIot(Boolean useIot) {
		this.useIot = useIot;
	}
	public Boolean getUseIot() {
		return this.useIot;
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
		return "alipay.cloud.cloudbase.saas.max.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_app_id", this.bizAppId);
		txtParams.put("image_type", this.imageType);
		txtParams.put("image_value", this.imageValue);
		txtParams.put("model_version", this.modelVersion);
		txtParams.put("route", this.route);
		txtParams.put("service_code", this.serviceCode);
		txtParams.put("side", this.side);
		txtParams.put("uri", this.uri);
		txtParams.put("use_iot", this.useIot);
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

	public Class<AlipayCloudCloudbaseSaasMaxQueryResponse> getResponseClass() {
		return AlipayCloudCloudbaseSaasMaxQueryResponse.class;
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
