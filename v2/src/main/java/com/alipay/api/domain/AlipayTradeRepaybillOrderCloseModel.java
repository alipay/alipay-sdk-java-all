package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易还款账单付款单关闭
 *
 * @author auto create
 * @since 1.0, 2020-10-09 11:26:19
 */
public class AlipayTradeRepaybillOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6484259214641687389L;

	/**
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 还款的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
