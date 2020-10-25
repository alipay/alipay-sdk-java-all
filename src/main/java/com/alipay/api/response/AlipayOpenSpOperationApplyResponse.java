package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:25:13
 */
public class AlipayOpenSpOperationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5578761552745475262L;

	/** 
	 * 支付宝操作批次号
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
