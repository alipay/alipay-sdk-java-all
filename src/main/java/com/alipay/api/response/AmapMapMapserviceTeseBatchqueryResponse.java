package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: amap.map.mapservice.tese.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 17:25:01
 */
public class AmapMapMapserviceTeseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1495673167121851836L;

	/** 
	 * 1
	 */
	@ApiField("es")
	private String es;

	public void setEs(String es) {
		this.es = es;
	}
	public String getEs( ) {
		return this.es;
	}

}
