package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-24 18:05:18
 */
public class AlipayTradeBatchRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3868131724424891919L;

	/** 
	 * 请求的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

}
