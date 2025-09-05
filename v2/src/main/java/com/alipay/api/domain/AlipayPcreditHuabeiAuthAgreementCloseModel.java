package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享会员协议关闭接口
 *
 * @author auto create
 * @since 1.0, 2022-11-16 19:32:13
 */
public class AlipayPcreditHuabeiAuthAgreementCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5566365425186917162L;

	/**
	 * 花芝协议号，支付宝系统中用以唯一标识用户签约记录的编号，即花芝协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态
	 */
	@ApiField("quit_type")
	private String quitType;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

}
