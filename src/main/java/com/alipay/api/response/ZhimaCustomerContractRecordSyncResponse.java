package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-29 16:55:00
 */
public class ZhimaCustomerContractRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3321713317473788333L;

	/** 
	 * 本次存证记录的唯一标识
	 */
	@ApiField("record_no")
	private String recordNo;

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}
	public String getRecordNo( ) {
		return this.recordNo;
	}

}
