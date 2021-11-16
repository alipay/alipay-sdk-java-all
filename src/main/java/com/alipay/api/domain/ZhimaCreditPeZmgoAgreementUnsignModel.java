package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO协议解约
 *
 * @author auto create
 * @since 1.0, 2021-02-24 16:31:04
 */
public class ZhimaCreditPeZmgoAgreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 6743469738619816239L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT
	 */
	@ApiField("quit_type")
	private String quitType;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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
