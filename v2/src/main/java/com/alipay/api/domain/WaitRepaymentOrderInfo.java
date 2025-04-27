package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待还订单信息
 *
 * @author auto create
 * @since 1.0, 2022-11-18 14:14:17
 */
public class WaitRepaymentOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2379725826832356661L;

	/**
	 * 垫资单id
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 通常为商户签约的收单产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 原始的业务单号，通常为支付宝交易号
	 */
	@ApiField("orig_biz_order_id")
	private String origBizOrderId;

	/**
	 * 垫资金额
	 */
	@ApiField("wait_repayment_amount")
	private Long waitRepaymentAmount;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrigBizOrderId() {
		return this.origBizOrderId;
	}
	public void setOrigBizOrderId(String origBizOrderId) {
		this.origBizOrderId = origBizOrderId;
	}

	public Long getWaitRepaymentAmount() {
		return this.waitRepaymentAmount;
	}
	public void setWaitRepaymentAmount(Long waitRepaymentAmount) {
		this.waitRepaymentAmount = waitRepaymentAmount;
	}

}
