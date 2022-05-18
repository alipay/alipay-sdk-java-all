package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票账单明细列表
 *
 * @author auto create
 * @since 1.0, 2022-01-16 09:51:09
 */
public class SummaryInvoiceBillOpenDTO extends AlipayObject {

	private static final long serialVersionUID = 5674149389985757492L;

	/**
	 * 账单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单持有人uid
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 支付类型，可选值：支付-PAY；退款-REFUND
	 */
	@ApiField("pay_type")
	private String payType;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

}
