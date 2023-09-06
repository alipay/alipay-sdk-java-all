package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款前向商户确认退款结果
 *
 * @author auto create
 * @since 1.0, 2023-02-28 20:23:09
 */
public class RefundConfirmCommitResult extends AlipayObject {

	private static final long serialVersionUID = 4888957663177647676L;

	/**
	 * 退款前向商户确认退款为拒绝退款后备注的退款原因
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
