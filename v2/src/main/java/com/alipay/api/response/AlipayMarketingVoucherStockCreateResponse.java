package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:52:35
 */
public class AlipayMarketingVoucherStockCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8452442861844231977L;

	/** 
	 * 本次重复导入数量
	 */
	@ApiField("duplicate_count")
	private Long duplicateCount;

	/** 
	 * 本次导入失败数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 库存ID, 用于后续追加和查询库存
	 */
	@ApiField("stock_id")
	private String stockId;

	/** 
	 * 本次导入成功数量
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

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockId( ) {
		return this.stockId;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
