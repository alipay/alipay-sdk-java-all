package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票账单明细列表
 *
 * @author auto create
 * @since 1.0, 2024-01-30 14:27:23
 */
public class SummaryInvoiceBillOpenDTO extends AlipayObject {

	private static final long serialVersionUID = 4411457276122982737L;

	/**
	 * 账单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 商户订单号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 支付宝用户用户openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 账单持有人uid
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 支付类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 支付单号
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

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
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
