package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于描述需要进行取消续租的信息
 *
 * @author auto create
 * @since 1.0, 2025-12-17 14:21:15
 */
public class RentPlanCancelInfo extends AlipayObject {

	private static final long serialVersionUID = 6829778631538822551L;

	/**
	 * 取消当前分期以及之后的所有分期
	 */
	@ApiField("cancel_start_installment_no")
	private Long cancelStartInstallmentNo;

	/**
	 * 取消原因编码
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 取消原因描述
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	public Long getCancelStartInstallmentNo() {
		return this.cancelStartInstallmentNo;
	}
	public void setCancelStartInstallmentNo(Long cancelStartInstallmentNo) {
		this.cancelStartInstallmentNo = cancelStartInstallmentNo;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

}
