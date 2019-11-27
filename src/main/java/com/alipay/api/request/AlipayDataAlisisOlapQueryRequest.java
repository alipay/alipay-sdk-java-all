package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataAlisisOlapQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.alisis.olap.query request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayDataAlisisOlapQueryRequest implements AlipayRequest<AlipayDataAlisisOlapQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 过滤条件
	 */
	private String filterJson;

	/** 
	* 度量过滤条件
	 */
	private String havingFilterJson;

	/** 
	* 工作表id
	 */
	private String id;

	/** 
	* 最大值5000，返回结果集数量
	 */
	private Long limit;

	/** 
	* 排序
	 */
	private String orderJson;

	/** 
	* 类型：cube/worksheet
	 */
	private String type;

	public void setFilterJson(String filterJson) {
		this.filterJson = filterJson;
	}
	public String getFilterJson() {
		return this.filterJson;
	}

	public void setHavingFilterJson(String havingFilterJson) {
		this.havingFilterJson = havingFilterJson;
	}
	public String getHavingFilterJson() {
		return this.havingFilterJson;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}
	public Long getLimit() {
		return this.limit;
	}

	public void setOrderJson(String orderJson) {
		this.orderJson = orderJson;
	}
	public String getOrderJson() {
		return this.orderJson;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
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
		return "alipay.data.alisis.olap.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("filter_json", this.filterJson);
		txtParams.put("having_filter_json", this.havingFilterJson);
		txtParams.put("id", this.id);
		txtParams.put("limit", this.limit);
		txtParams.put("order_json", this.orderJson);
		txtParams.put("type", this.type);
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

	public Class<AlipayDataAlisisOlapQueryResponse> getResponseClass() {
		return AlipayDataAlisisOlapQueryResponse.class;
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
