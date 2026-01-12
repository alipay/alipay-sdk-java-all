package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款前商户确认结果
 *
 * @author auto create
 * @since 1.0, 2023-02-28 20:23:19
 */
public class RefundConfirmResult extends AlipayObject {

	private static final long serialVersionUID = 2155628759287451561L;

	/**
	 * 退款备注的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 确认退款结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
