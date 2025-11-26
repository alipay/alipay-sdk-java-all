package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单退款项信息
 *
 * @author auto create
 * @since 1.0, 2025-11-05 13:42:34
 */
public class RentRefundItemVO extends AlipayObject {

	private static final long serialVersionUID = 4397429489983679151L;

	/**
	 * 第几期租金，从1开始
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 退款金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单费用类型
	 */
	@ApiField("type")
	private String type;

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
