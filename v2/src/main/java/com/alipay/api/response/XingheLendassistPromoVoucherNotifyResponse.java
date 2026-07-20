package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.promo.voucher.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-03 11:37:55
 */
public class XingheLendassistPromoVoucherNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8251699561587944686L;

	/** 
	 * 机构券ID（星河侧用于幂等使用）
	 */
	@ApiField("inst_voucher_id")
	private String instVoucherId;

	/** 
	 * 请求流水号（幂等使用）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 星河券Id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setInstVoucherId(String instVoucherId) {
		this.instVoucherId = instVoucherId;
	}
	public String getInstVoucherId( ) {
		return this.instVoucherId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
