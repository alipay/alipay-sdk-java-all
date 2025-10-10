package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代缴单售后操作申请请求
 *
 * @author auto create
 * @since 1.0, 2024-11-04 16:11:56
 */
public class IndrPoboManualOperationApplyRequestDTO extends AlipayObject {

	private static final long serialVersionUID = 8797153913351741699L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private TuitionMoneyDTO refundAmount;

	/**
	 * 需求操作类型
	 */
	@ApiField("required_operation_type")
	private String requiredOperationType;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public TuitionMoneyDTO getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(TuitionMoneyDTO refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRequiredOperationType() {
		return this.requiredOperationType;
	}
	public void setRequiredOperationType(String requiredOperationType) {
		this.requiredOperationType = requiredOperationType;
	}

}
