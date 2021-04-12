package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享协议查询
 *
 * @author auto create
 * @since 1.0, 2020-04-23 16:16:32
 */
public class AlipayPcreditHuabeiAuthAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6877971549474611543L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

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

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public String getOutSignNo() {
		return this.outSignNo;
	}
	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}

}
