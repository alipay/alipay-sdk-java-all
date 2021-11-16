package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算单传输对象
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:50
 */
public class SettlementbillOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 4792648152229571328L;

	/**
	 * 外部的业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 结算单金额
	 */
	@ApiField("settle_amount")
	private MultiCurrencyMoneyOpenApi settleAmount;

	/**
	 * 生成的结算单号
	 */
	@ApiField("settlement_bill_no")
	private String settlementBillNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public MultiCurrencyMoneyOpenApi getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(MultiCurrencyMoneyOpenApi settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettlementBillNo() {
		return this.settlementBillNo;
	}
	public void setSettlementBillNo(String settlementBillNo) {
		this.settlementBillNo = settlementBillNo;
	}

}
