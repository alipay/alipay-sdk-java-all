package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花芝业务信息确认接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 10:07:41
 */
public class AlipayPcreditHuabeiAuthBusinessConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7193531964969289655L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户业务信息确认时带入的业务信息
	 */
	@ApiField("biz_params")
	private BizExtParams bizParams;

	/**
	 * 用于描述商户需要回执的业务类型。如签约：SIGN
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户业务确认说明描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除英文、数字以外的字符，需要保证在商户端不重复。
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

	public BizExtParams getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(BizExtParams bizParams) {
		this.bizParams = bizParams;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
