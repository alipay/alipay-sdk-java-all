package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证券信息
 *
 * @author auto create
 * @since 1.0, 2024-06-14 10:17:10
 */
public class CertificateVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 7656721464711519122L;

	/**
	 * 用户领取的券码code,支付宝商家券活动才会返回券码，其他优惠券活动该值为空
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 支付宝券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
