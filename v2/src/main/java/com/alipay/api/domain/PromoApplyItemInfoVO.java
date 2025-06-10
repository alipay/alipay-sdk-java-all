package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销申领商品信息
 *
 * @author auto create
 * @since 1.0, 2024-02-28 15:27:14
 */
public class PromoApplyItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2644223354248333255L;

	/**
	 * 支付宝平台侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品申领明细列表
	 */
	@ApiListField("promo_apply_item_detail_infos")
	@ApiField("promo_apply_item_detail_info_v_o")
	private List<PromoApplyItemDetailInfoVO> promoApplyItemDetailInfos;

	/**
	 * 支付宝侧商品skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<PromoApplyItemDetailInfoVO> getPromoApplyItemDetailInfos() {
		return this.promoApplyItemDetailInfos;
	}
	public void setPromoApplyItemDetailInfos(List<PromoApplyItemDetailInfoVO> promoApplyItemDetailInfos) {
		this.promoApplyItemDetailInfos = promoApplyItemDetailInfos;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
