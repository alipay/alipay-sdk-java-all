package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金协议升级
 *
 * @author auto create
 * @since 1.0, 2022-01-19 10:11:59
 */
public class AlipayFundBailAgreementUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 3517278798183245188L;

	/**
	 * 待升级保证金协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 托管模式
	 */
	@ApiField("trusteeship_mode")
	private String trusteeshipMode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getTrusteeshipMode() {
		return this.trusteeshipMode;
	}
	public void setTrusteeshipMode(String trusteeshipMode) {
		this.trusteeshipMode = trusteeshipMode;
	}

}
