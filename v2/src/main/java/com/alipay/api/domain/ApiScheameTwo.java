package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApiScheameTwo测试
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:13:35
 */
public class ApiScheameTwo extends AlipayObject {

	private static final long serialVersionUID = 6313494951881171491L;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}
