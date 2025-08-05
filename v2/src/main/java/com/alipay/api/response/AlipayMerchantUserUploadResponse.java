package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.user.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 16:45:02
 */
public class AlipayMerchantUserUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4438547257881182981L;

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
