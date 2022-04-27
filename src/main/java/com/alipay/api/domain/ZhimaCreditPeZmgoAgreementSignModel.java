package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO协议签约
 *
 * @author auto create
 * @since 1.0, 2021-10-15 17:34:15
 */
public class ZhimaCreditPeZmgoAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 1897222422116546257L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO预创单号
	 */
	@ApiField("preorder_no")
	private String preorderNo;

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

	public String getPreorderNo() {
		return this.preorderNo;
	}
	public void setPreorderNo(String preorderNo) {
		this.preorderNo = preorderNo;
	}

}
