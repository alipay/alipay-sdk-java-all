package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ManjiangTestComplexOneData;
import com.alipay.api.domain.ResourcePackage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.payoff.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AlipayTradePayoffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4158686968933198921L;

	/** 
	 * 1111
	 */
	@ApiField("man_dddd_asaa")
	private ManjiangTestComplexOneData manDdddAsaa;

	/** 
	 * asdf
	 */
	@ApiField("sadf")
	private ResourcePackage sadf;

	/** 
	 * 1
	 */
	@ApiField("sd")
	private String sd;

	public void setManDdddAsaa(ManjiangTestComplexOneData manDdddAsaa) {
		this.manDdddAsaa = manDdddAsaa;
	}
	public ManjiangTestComplexOneData getManDdddAsaa( ) {
		return this.manDdddAsaa;
	}

	public void setSadf(ResourcePackage sadf) {
		this.sadf = sadf;
	}
	public ResourcePackage getSadf( ) {
		return this.sadf;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}
	public String getSd( ) {
		return this.sd;
	}

}
