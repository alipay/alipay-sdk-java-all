package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayZdatafrontCommonQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.zdatafront.common.query request
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 09:56:03
 */
public class AlipayZdatafrontCommonQueryRequest implements AlipayRequest<AlipayZdatafrontCommonQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 如果cacheInterval<=0,就直接从外部获取数据；
如果cacheInterval>0,就先判断cache中的数据是否过期，如果没有过期就返回cache中的数据，如果过期再从外部获取数据并刷新cache，然后返回数据。
单位：秒
	 */
	private Long cacheInterval;

	/** 
	* 通用查询的入参
	 */
	private String queryConditions;

	/** 
	* 服务名称请与相关开发负责人联系
	 */
	private String serviceName;

	/** 
	* 访问该服务的业务
	 */
	private String visitBiz;

	/** 
	* 访问该服务的业务线
	 */
	private String visitBizLine;

	/** 
	* 访问该服务的部门名称
	 */
	private String visitDomain;

	public void setCacheInterval(Long cacheInterval) {
		this.cacheInterval = cacheInterval;
	}
	public Long getCacheInterval() {
		return this.cacheInterval;
	}

	public void setQueryConditions(String queryConditions) {
		this.queryConditions = queryConditions;
	}
	public String getQueryConditions() {
		return this.queryConditions;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName() {
		return this.serviceName;
	}

	public void setVisitBiz(String visitBiz) {
		this.visitBiz = visitBiz;
	}
	public String getVisitBiz() {
		return this.visitBiz;
	}

	public void setVisitBizLine(String visitBizLine) {
		this.visitBizLine = visitBizLine;
	}
	public String getVisitBizLine() {
		return this.visitBizLine;
	}

	public void setVisitDomain(String visitDomain) {
		this.visitDomain = visitDomain;
	}
	public String getVisitDomain() {
		return this.visitDomain;
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
		return "alipay.zdatafront.common.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("cache_interval", this.cacheInterval);
		txtParams.put("query_conditions", this.queryConditions);
		txtParams.put("service_name", this.serviceName);
		txtParams.put("visit_biz", this.visitBiz);
		txtParams.put("visit_biz_line", this.visitBizLine);
		txtParams.put("visit_domain", this.visitDomain);
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

	public Class<AlipayZdatafrontCommonQueryResponse> getResponseClass() {
		return AlipayZdatafrontCommonQueryResponse.class;
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
