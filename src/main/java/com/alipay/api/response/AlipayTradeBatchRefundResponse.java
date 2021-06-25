package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-04 15:13:43
 */
public class AlipayTradeBatchRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4148331339571786917L;

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
