package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票账单明细列表
 *
 * @author auto create
 * @since 1.0, 2022-07-14 13:53:05
 */
public class SummaryInvoiceBillOpenDTO extends AlipayObject {

	private static final long serialVersionUID = 8721194469549754412L;

	/**
	 * 账单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 商户在统一收单链路中透传到支付宝的商户订单号，仅作为透传，非必要
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

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

	/**
	 * 退款场景时对应的正向支付单号，当pay_type为REFUND时可取该值，非必须
	 */
	@ApiField("related_pay_no")
	private String relatedPayNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizOutNo() {
		return this.bizOutNo;
	}
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
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

	public String getRelatedPayNo() {
		return this.relatedPayNo;
	}
	public void setRelatedPayNo(String relatedPayNo) {
		this.relatedPayNo = relatedPayNo;
	}

}
