package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证退款明细，描述某一笔次序号对应金额的退款进度。
 *
 * @author auto create
 * @since 1.0, 2026-08-14 10:41:30
 */
public class CertificateRefundDetailVO extends AlipayObject {

	private static final long serialVersionUID = 4333126163761458651L;

	/**
	 * 支付宝平台侧凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 退款金额，单位：元
	 */
	@ApiField("refund_cash")
	private String refundCash;

	/**
	 * 描述当前次序号对应的这笔退款的执行情况
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 支付宝平台侧凭证次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(String refundCash) {
		this.refundCash = refundCash;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
