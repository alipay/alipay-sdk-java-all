package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议鉴权申请接口
 *
 * @author auto create
 * @since 1.0, 2017-10-25 14:00:54
 */
public class AlipayUserAgreementAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8231986812838686138L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付宝给用户下发短信校验码;
用户在商户提供页面中回填该校验码，商户调支付宝的鉴权确认接口，完全最终的鉴权确认
	 */
	@ApiField("auth_confirm_type")
	private String authConfirmType;

	/**
	 * 鉴权申请的场景，目前可传入的值：AUTH/PAY
	 */
	@ApiField("auth_scene")
	private String authScene;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAuthConfirmType() {
		return this.authConfirmType;
	}
	public void setAuthConfirmType(String authConfirmType) {
		this.authConfirmType = authConfirmType;
	}

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

}
