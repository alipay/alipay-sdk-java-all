package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.viewcallback.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-02 19:52:04
 */
public class AlipayOpenAppServiceViewcallbackQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1581344673289637637L;

	/** 
	 * 服务关联的服务标准类目ID和名称关系
	 */
	@ApiField("catalog_map")
	private String catalogMap;

	/** 
	 * 服务属性扩展值，入关联的父服务编码，不同来源的服务之间可能存在差异性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 高德POI_ID列表，多个之间以英文逗号分隔
	 */
	@ApiField("poi_ids")
	private String poiIds;

	/** 
	 * 服务载体编码
	 */
	@ApiField("service_carrier_code")
	private String serviceCarrierCode;

	/** 
	 * 载体类型
	 */
	@ApiField("service_carrier_type")
	private String serviceCarrierType;

	/** 
	 * 载体url
	 */
	@ApiField("service_carrier_url")
	private String serviceCarrierUrl;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 服务颗粒度如FUNCTION(功能级服务)
	 */
	@ApiField("service_granularity_type")
	private String serviceGranularityType;

	/** 
	 * 服务logo
	 */
	@ApiField("service_logo")
	private String serviceLogo;

	/** 
	 * VALID--生效、INVALID--失效
	 */
	@ApiField("service_major_status")
	private String serviceMajorStatus;

	/** 
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/** 
	 * 服务短描述
	 */
	@ApiField("service_simple_desc")
	private String serviceSimpleDesc;

	/** 
	 * 服务来源
	 */
	@ApiField("service_spec_code")
	private String serviceSpecCode;

	public void setCatalogMap(String catalogMap) {
		this.catalogMap = catalogMap;
	}
	public String getCatalogMap( ) {
		return this.catalogMap;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setPoiIds(String poiIds) {
		this.poiIds = poiIds;
	}
	public String getPoiIds( ) {
		return this.poiIds;
	}

	public void setServiceCarrierCode(String serviceCarrierCode) {
		this.serviceCarrierCode = serviceCarrierCode;
	}
	public String getServiceCarrierCode( ) {
		return this.serviceCarrierCode;
	}

	public void setServiceCarrierType(String serviceCarrierType) {
		this.serviceCarrierType = serviceCarrierType;
	}
	public String getServiceCarrierType( ) {
		return this.serviceCarrierType;
	}

	public void setServiceCarrierUrl(String serviceCarrierUrl) {
		this.serviceCarrierUrl = serviceCarrierUrl;
	}
	public String getServiceCarrierUrl( ) {
		return this.serviceCarrierUrl;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setServiceGranularityType(String serviceGranularityType) {
		this.serviceGranularityType = serviceGranularityType;
	}
	public String getServiceGranularityType( ) {
		return this.serviceGranularityType;
	}

	public void setServiceLogo(String serviceLogo) {
		this.serviceLogo = serviceLogo;
	}
	public String getServiceLogo( ) {
		return this.serviceLogo;
	}

	public void setServiceMajorStatus(String serviceMajorStatus) {
		this.serviceMajorStatus = serviceMajorStatus;
	}
	public String getServiceMajorStatus( ) {
		return this.serviceMajorStatus;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName( ) {
		return this.serviceName;
	}

	public void setServiceSimpleDesc(String serviceSimpleDesc) {
		this.serviceSimpleDesc = serviceSimpleDesc;
	}
	public String getServiceSimpleDesc( ) {
		return this.serviceSimpleDesc;
	}

	public void setServiceSpecCode(String serviceSpecCode) {
		this.serviceSpecCode = serviceSpecCode;
	}
	public String getServiceSpecCode( ) {
		return this.serviceSpecCode;
	}

}
