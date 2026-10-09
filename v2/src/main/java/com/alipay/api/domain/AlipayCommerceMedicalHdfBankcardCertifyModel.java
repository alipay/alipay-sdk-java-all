package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡三要素认证
 *
 * @author auto create
 * @since 1.0, 2026-09-28 14:33:32
 */
public class AlipayCommerceMedicalHdfBankcardCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 2392365594536229733L;

	/**
	 * 银行卡号码
	 */
	@ApiField("bank_card")
	private String bankCard;

	/**
	 * 18位有效身份证，字母统一大写
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getBankCard() {
		return this.bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
