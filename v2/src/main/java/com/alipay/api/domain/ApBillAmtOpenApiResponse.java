package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单+关联金额
 *
 * @author auto create
 * @since 1.0, 2020-01-13 10:51:57
 */
public class ApBillAmtOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 4148376472293732925L;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 分摊金额
	 */
	@ApiField("share_amt")
	private MultiCurrencyMoneyOpenApi shareAmt;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public MultiCurrencyMoneyOpenApi getShareAmt() {
		return this.shareAmt;
	}
	public void setShareAmt(MultiCurrencyMoneyOpenApi shareAmt) {
		this.shareAmt = shareAmt;
	}

}
