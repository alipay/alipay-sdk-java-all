package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.promo.voucher.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-28 15:42:53
 */
public class XingheLendassistPromoVoucherNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1292992232131492416L;

	/** 
	 * 业务是否成功：
true 业务成功；
false 业务失败，需结合 retry 判断
	 */
	@ApiField("biz_success")
	private String bizSuccess;

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

	public void setBizSuccess(String bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public String getBizSuccess( ) {
		return this.bizSuccess;
	}

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
