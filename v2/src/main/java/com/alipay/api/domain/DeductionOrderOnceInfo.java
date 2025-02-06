package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销订单单次信息
 *
 * @author auto create
 * @since 1.0, 2024-10-12 19:28:17
 */
public class DeductionOrderOnceInfo extends AlipayObject {

	private static final long serialVersionUID = 6637575553333717454L;

	/**
	 * 凭证序列号
	 */
	@ApiField("certificate_serial")
	private String certificateSerial;

	/**
	 * 扣款金额，单位：分
	 */
	@ApiField("deduction_amount")
	private Long deductionAmount;

	/**
	 * 核销现金价值，单位：分
	 */
	@ApiField("deduction_cash")
	private Long deductionCash;

	/**
	 * 期数
	 */
	@ApiField("period")
	private Long period;

	public String getCertificateSerial() {
		return this.certificateSerial;
	}
	public void setCertificateSerial(String certificateSerial) {
		this.certificateSerial = certificateSerial;
	}

	public Long getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(Long deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public Long getDeductionCash() {
		return this.deductionCash;
	}
	public void setDeductionCash(Long deductionCash) {
		this.deductionCash = deductionCash;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

}
