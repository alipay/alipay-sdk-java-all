package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发起卡管理方转移接口
 *
 * @author auto create
 * @since 1.0, 2024-12-11 13:59:05
 */
public class AlipayCommerceMerchantcardManageTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3757361546644426547L;

	/**
	 * 待转移的卡id集合，即将这些卡转移到自己名下。当前仅支持安心付标准版卡转移
	 */
	@ApiListField("card_template_ids")
	@ApiField("string")
	private List<String> cardTemplateIds;

	public List<String> getCardTemplateIds() {
		return this.cardTemplateIds;
	}
	public void setCardTemplateIds(List<String> cardTemplateIds) {
		this.cardTemplateIds = cardTemplateIds;
	}

}
