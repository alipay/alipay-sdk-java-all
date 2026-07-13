package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pobo单差错记录
 *
 * @author auto create
 * @since 1.0, 2026-06-12 11:48:06
 */
public class IndrPoboDebitRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 2152853233914946511L;

	/**
	 * 学校实际扣款金额
	 */
	@ApiField("actual_debit_amount")
	private IndrMoneyDTO actualDebitAmount;

	/**
	 * 补缴订单链接,用于多扣补缴场景
	 */
	@ApiField("back_payment_order_link")
	private String backPaymentOrderLink;

	/**
	 * 金额差错类型
	 */
	@ApiField("discrepancy_type")
	private String discrepancyType;

	public IndrMoneyDTO getActualDebitAmount() {
		return this.actualDebitAmount;
	}
	public void setActualDebitAmount(IndrMoneyDTO actualDebitAmount) {
		this.actualDebitAmount = actualDebitAmount;
	}

	public String getBackPaymentOrderLink() {
		return this.backPaymentOrderLink;
	}
	public void setBackPaymentOrderLink(String backPaymentOrderLink) {
		this.backPaymentOrderLink = backPaymentOrderLink;
	}

	public String getDiscrepancyType() {
		return this.discrepancyType;
	}
	public void setDiscrepancyType(String discrepancyType) {
		this.discrepancyType = discrepancyType;
	}

}
