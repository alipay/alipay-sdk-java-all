package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Lingsanerjiu;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.lingsanerjiu.lingsanerjiu.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppLingsanerjiuLingsanerjiuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4118534313393536452L;

	/** 
	 * 1
	 */
	@ApiField("liusanerjiu")
	private Lingsanerjiu liusanerjiu;

	public void setLiusanerjiu(Lingsanerjiu liusanerjiu) {
		this.liusanerjiu = liusanerjiu;
	}
	public Lingsanerjiu getLiusanerjiu( ) {
		return this.liusanerjiu;
	}

}
