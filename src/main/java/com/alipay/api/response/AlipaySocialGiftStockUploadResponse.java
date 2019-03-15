package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.stock.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialGiftStockUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2844157723568511362L;

	/** 
	 * 重复条数
	 */
	@ApiField("duplicate_count")
	private Long duplicateCount;

	/** 
	 * 失败条数
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 成功条数
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setDuplicateCount(Long duplicateCount) {
		this.duplicateCount = duplicateCount;
	}
	public Long getDuplicateCount( ) {
		return this.duplicateCount;
	}

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
