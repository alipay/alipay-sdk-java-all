package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:33:25
 */
public class ZhimaCustomerContractRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534432998337229679L;

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
