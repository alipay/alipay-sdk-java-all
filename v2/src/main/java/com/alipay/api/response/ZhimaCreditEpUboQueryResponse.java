package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpUboResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ubo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-28 11:07:58
 */
public class ZhimaCreditEpUboQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2732324228169666872L;

	/** 
	 * 数据明细
	 */
	@ApiField("data")
	private EpUboResult data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpUboResult data) {
		this.data = data;
	}
	public EpUboResult getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
