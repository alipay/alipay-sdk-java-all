package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票账单明细列表
 *
 * @author auto create
 * @since 1.0, 2021-12-17 17:42:07
 */
public class SummaryInvoiceBillOpenDTO extends AlipayObject {

	private static final long serialVersionUID = 2235587523872749755L;

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

}
