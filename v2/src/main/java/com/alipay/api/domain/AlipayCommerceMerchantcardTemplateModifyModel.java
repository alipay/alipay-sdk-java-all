package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版修改
 *
 * @author auto create
 * @since 1.0, 2025-07-04 17:17:55
 */
public class AlipayCommerceMerchantcardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4664613886842438237L;

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
