package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定商品营销活动信息
 *
 * @author auto create
 * @since 1.0, 2024-06-05 11:02:11
 */
public class AlipayOpenAppItempromoactivityTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2823613645453397635L;

	/**
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

}
