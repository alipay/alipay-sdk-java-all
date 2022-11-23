package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已签约卡信息
 *
 * @author auto create
 * @since 1.0, 2021-01-05 16:55:14
 */
public class SignCardInfo extends AlipayObject {

	private static final long serialVersionUID = 1312489183981185353L;

	/**
	 * 完整卡号的SHA256摘要并对结果进行16进制编码
	 */
	@ApiField("card_no_en")
	private String cardNoEn;

	/**
	 * 卡号前八位
	 */
	@ApiField("first_eight_card_no")
	private String firstEightCardNo;

	public String getCardNoEn() {
		return this.cardNoEn;
	}
	public void setCardNoEn(String cardNoEn) {
		this.cardNoEn = cardNoEn;
	}

	public String getFirstEightCardNo() {
		return this.firstEightCardNo;
	}
	public void setFirstEightCardNo(String firstEightCardNo) {
		this.firstEightCardNo = firstEightCardNo;
	}

}
