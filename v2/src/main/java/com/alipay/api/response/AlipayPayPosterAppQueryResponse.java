package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NfcPointRefreshData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.poster.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class AlipayPayPosterAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6318458935542646868L;

	/** 
	 * 立减进度条渲染结果
	 */
	@ApiField("data")
	private NfcPointRefreshData data;

	public void setData(NfcPointRefreshData data) {
		this.data = data;
	}
	public NfcPointRefreshData getData( ) {
		return this.data;
	}

}
