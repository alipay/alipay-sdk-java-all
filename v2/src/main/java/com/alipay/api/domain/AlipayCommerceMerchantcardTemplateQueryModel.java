package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版查询
 *
 * @author auto create
 * @since 1.0, 2024-11-06 14:50:52
 */
public class AlipayCommerceMerchantcardTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5474747547635882163L;

	/**
	 * 卡ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

}
