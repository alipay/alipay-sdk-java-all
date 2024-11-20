package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品免审快速修改
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:03:54
 */
public class AlipayCommerceMerchantcardTemplatequickModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8769243485765474131L;

	/**
	 * 卡id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 售卖信息
	 */
	@ApiField("sale_info")
	private CardTemplateSale saleInfo;

	/**
	 * 新的库存数量，单位个
	 */
	@ApiField("saleable_count")
	private Long saleableCount;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public CardTemplateSale getSaleInfo() {
		return this.saleInfo;
	}
	public void setSaleInfo(CardTemplateSale saleInfo) {
		this.saleInfo = saleInfo;
	}

	public Long getSaleableCount() {
		return this.saleableCount;
	}
	public void setSaleableCount(Long saleableCount) {
		this.saleableCount = saleableCount;
	}

}
