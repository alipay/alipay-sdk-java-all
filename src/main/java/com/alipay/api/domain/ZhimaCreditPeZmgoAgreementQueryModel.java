package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻Go协议查询接口
 *
 * @author auto create
 * @since 1.0, 2021-03-11 15:08:44
 */
public class ZhimaCreditPeZmgoAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2417651644491933671L;

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

}
