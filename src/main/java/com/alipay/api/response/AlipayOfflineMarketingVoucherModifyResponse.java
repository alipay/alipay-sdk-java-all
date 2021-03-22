package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketingVoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1598233444858765336L;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态,EFFECTIVE=生效，INVALID=失效
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	public String getVoucherStatus( ) {
		return this.voucherStatus;
	}

}
