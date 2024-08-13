package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:27:13
 */
public class AlipayCloudFundAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7698436673999221268L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号），如果传了该参数，其他参数会被忽略。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

}
