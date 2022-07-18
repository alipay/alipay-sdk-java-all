package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.user.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 11:51:45
 */
public class AlipayMerchantUserUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6197736426553678986L;

	/** 
	 * 上传批次号
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
