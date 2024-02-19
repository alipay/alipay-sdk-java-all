package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗额度授权冻结接口
 *
 * @author auto create
 * @since 1.0, 2019-03-30 21:39:17
 */
public class AlipayPcreditHuabeiAuthOrderFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 4366572315421921748L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。支付宝侧用来做花呗冻结请求的幂等。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户的支付宝用户id。如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
