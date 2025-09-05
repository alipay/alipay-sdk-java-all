package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版创建
 *
 * @author auto create
 * @since 1.0, 2025-09-04 10:32:40
 */
public class AlipayCommerceMerchantcardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6241211413322467291L;

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
