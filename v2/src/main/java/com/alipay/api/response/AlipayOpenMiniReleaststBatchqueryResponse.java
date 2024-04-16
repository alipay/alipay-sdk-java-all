package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.releastst.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:40:56
 */
public class AlipayOpenMiniReleaststBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3225342879963683258L;

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
