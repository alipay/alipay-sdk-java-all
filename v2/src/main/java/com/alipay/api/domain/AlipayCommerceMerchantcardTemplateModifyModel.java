package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版修改
 *
 * @author auto create
 * @since 1.0, 2025-09-15 11:05:09
 */
public class AlipayCommerceMerchantcardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7416474673658235998L;

	/**
	 * 卡信息
	 */
	@ApiField("card_template")
	private MerchantCardTemplate cardTemplate;

	public MerchantCardTemplate getCardTemplate() {
		return this.cardTemplate;
	}
	public void setCardTemplate(MerchantCardTemplate cardTemplate) {
		this.cardTemplate = cardTemplate;
	}

}
