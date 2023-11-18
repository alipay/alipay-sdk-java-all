package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销申领信息
 *
 * @author auto create
 * @since 1.0, 2023-08-04 13:53:35
 */
public class PromoApplyInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7579782194791218893L;

	/**
	 * 营销申领商品明细列表
	 */
	@ApiListField("promo_apply_item_infos")
	@ApiField("promo_apply_item_info_v_o")
	private List<PromoApplyItemInfoVO> promoApplyItemInfos;

	/**
	 * 营销申领汇总列表
	 */
	@ApiListField("promo_apply_summary_infos")
	@ApiField("promo_apply_summary_info_v_o")
	private List<PromoApplySummaryInfoVO> promoApplySummaryInfos;

	public List<PromoApplyItemInfoVO> getPromoApplyItemInfos() {
		return this.promoApplyItemInfos;
	}
	public void setPromoApplyItemInfos(List<PromoApplyItemInfoVO> promoApplyItemInfos) {
		this.promoApplyItemInfos = promoApplyItemInfos;
	}

	public List<PromoApplySummaryInfoVO> getPromoApplySummaryInfos() {
		return this.promoApplySummaryInfos;
	}
	public void setPromoApplySummaryInfos(List<PromoApplySummaryInfoVO> promoApplySummaryInfos) {
		this.promoApplySummaryInfos = promoApplySummaryInfos;
	}

}
