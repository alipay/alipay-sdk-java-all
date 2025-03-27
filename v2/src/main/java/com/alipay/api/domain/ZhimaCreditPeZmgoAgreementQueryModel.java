package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻Go协议查询接口
 *
 * @author auto create
 * @since 1.0, 2024-10-16 11:29:31
 */
public class ZhimaCreditPeZmgoAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3697567895989837785L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。
	 */
	@ApiField("agreement_id")
	private String agreementId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
