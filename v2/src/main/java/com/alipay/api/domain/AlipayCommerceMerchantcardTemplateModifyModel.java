package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版修改
 *
 * @author auto create
 * @since 1.0, 2024-05-29 11:30:55
 */
public class AlipayCommerceMerchantcardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3736871597557556512L;

	/**
	 * 商品信息
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
