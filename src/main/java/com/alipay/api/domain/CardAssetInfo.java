package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡激活凭证
 *
 * @author auto create
 * @since 1.0, 2022-10-14 14:51:07
 */
public class CardAssetInfo extends AlipayObject {

	private static final long serialVersionUID = 8696669368643865932L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡密
	 */
	@ApiField("card_pwd")
	private String cardPwd;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPwd() {
		return this.cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}

}
