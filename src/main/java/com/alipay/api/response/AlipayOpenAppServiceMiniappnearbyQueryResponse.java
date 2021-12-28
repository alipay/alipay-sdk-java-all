package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.miniappnearby.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-01 20:45:01
 */
public class AlipayOpenAppServiceMiniappnearbyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7212657176219761562L;

	/** 
	 * 服务载体编码
	 */
	@ApiField("carrier_code")
	private String carrierCode;

	/** 
	 * 载体url
	 */
	@ApiField("carrier_url")
	private String carrierUrl;

	/** 
	 * 服务详述
	 */
	@ApiField("detail_desc")
	private String detailDesc;

	/** 
	 * 前台类目id
	 */
	@ApiField("forward_catalog_id")
	private String forwardCatalogId;

	/** 
	 * 服务关键词
	 */
	@ApiField("key_word_list")
	private String keyWordList;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 服务logo
	 */
	@ApiField("service_logo")
	private String serviceLogo;

	/** 
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/** 
	 * 服务简述
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getCarrierCode( ) {
		return this.carrierCode;
	}

	public void setCarrierUrl(String carrierUrl) {
		this.carrierUrl = carrierUrl;
	}
	public String getCarrierUrl( ) {
		return this.carrierUrl;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}
	public String getDetailDesc( ) {
		return this.detailDesc;
	}

	public void setForwardCatalogId(String forwardCatalogId) {
		this.forwardCatalogId = forwardCatalogId;
	}
	public String getForwardCatalogId( ) {
		return this.forwardCatalogId;
	}

	public void setKeyWordList(String keyWordList) {
		this.keyWordList = keyWordList;
	}
	public String getKeyWordList( ) {
		return this.keyWordList;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setServiceLogo(String serviceLogo) {
		this.serviceLogo = serviceLogo;
	}
	public String getServiceLogo( ) {
		return this.serviceLogo;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName( ) {
		return this.serviceName;
	}

	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}
	public String getSimpleDesc( ) {
		return this.simpleDesc;
	}

}
