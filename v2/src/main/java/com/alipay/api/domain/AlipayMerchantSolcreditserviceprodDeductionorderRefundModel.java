package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单退款
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:49:53
 */
public class AlipayMerchantSolcreditserviceprodDeductionorderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5734917655311425152L;

	/**
	 * 退款金额(单位元)，最多2位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 系统生成扣款单唯一编号
	 */
	@ApiField("deduction_order_no")
	private String deductionOrderNo;

	/**
	 * 商户保证唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeductionOrderNo() {
		return this.deductionOrderNo;
	}
	public void setDeductionOrderNo(String deductionOrderNo) {
		this.deductionOrderNo = deductionOrderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
