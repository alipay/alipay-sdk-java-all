package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:46:57
 */
public class AlipayTradeBatchRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1547296376878469674L;

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
