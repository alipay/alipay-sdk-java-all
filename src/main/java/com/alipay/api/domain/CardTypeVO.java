package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡类型对象
 *
 * @author auto create
 * @since 1.0, 2015-09-22 11:04:47
 */
public class CardTypeVO extends AlipayObject {

	private static final long serialVersionUID = 7187583598439294279L;

	/**
	 * 卡类型标识符，取值范围如下：
DC("借记卡")
CC("贷记卡")
SCC("准贷记卡")
DCC("存贷合一卡")
PC("预付卡")
STPB("标准存折")
STFA("标准对公账户")
NSTFA("非标准对公账户")
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡类型描述，参考cardType的描述字段中括号里的值。
	 */
	@ApiField("description")
	private String description;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
