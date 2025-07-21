package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道优惠汇总列表
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class PromoSumInfo extends AlipayObject {

	private static final long serialVersionUID = 5319827286716434896L;

	/**
	 * 商品优惠类型包括：
ANT_MEMBER : 会员积分
CONSUME_GOLD：消费金
	 */
	@ApiField("sale_promo_type")
	private String salePromoType;

	/**
	 * 订单需要的总积分数
	 */
	@ApiField("total_point_amount")
	private String totalPointAmount;

	public String getSalePromoType() {
		return this.salePromoType;
	}
	public void setSalePromoType(String salePromoType) {
		this.salePromoType = salePromoType;
	}

	public String getTotalPointAmount() {
		return this.totalPointAmount;
	}
	public void setTotalPointAmount(String totalPointAmount) {
		this.totalPointAmount = totalPointAmount;
	}

}
