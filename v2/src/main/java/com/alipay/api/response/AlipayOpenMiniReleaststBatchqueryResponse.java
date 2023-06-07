package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.releastst.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:24:07
 */
public class AlipayOpenMiniReleaststBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889727191565956358L;

	/** 
	 * 21
	 */
	@ApiField("des")
	private GavintestNewLeveaOne des;

	/** 
	 * 10
	 */
	@ApiField("out")
	private String out;

	public void setDes(GavintestNewLeveaOne des) {
		this.des = des;
	}
	public GavintestNewLeveaOne getDes( ) {
		return this.des;
	}

	public void setOut(String out) {
		this.out = out;
	}
	public String getOut( ) {
		return this.out;
	}

}
