package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2023-08-02 17:37:42
 */
public class CertificateItem extends AlipayObject {

	private static final long serialVersionUID = 8271262189717735745L;

	/**
	 * 凭证码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 商户的凭证码
	 */
	@ApiField("out_code")
	private String outCode;

	/**
	 * 退款金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 凭证的总可用次数
	 */
	@ApiField("total_times")
	private Long totalTimes;

	/**
	 * 凭证已使用的次数
	 */
	@ApiField("used_times")
	private Long usedTimes;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOutCode() {
		return this.outCode;
	}
	public void setOutCode(String outCode) {
		this.outCode = outCode;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(Long totalTimes) {
		this.totalTimes = totalTimes;
	}

	public Long getUsedTimes() {
		return this.usedTimes;
	}
	public void setUsedTimes(Long usedTimes) {
		this.usedTimes = usedTimes;
	}

}
