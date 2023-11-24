package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版修改
 *
 * @author auto create
 * @since 1.0, 2023-10-30 15:51:42
 */
public class AlipayCommerceCardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7766788656814649278L;

	/**
	 * 卡模版信息
	 */
	@ApiField("card_template_info")
	private CardTemplateInfo cardTemplateInfo;

	public CardTemplateInfo getCardTemplateInfo() {
		return this.cardTemplateInfo;
	}
	public void setCardTemplateInfo(CardTemplateInfo cardTemplateInfo) {
		this.cardTemplateInfo = cardTemplateInfo;
	}

}
