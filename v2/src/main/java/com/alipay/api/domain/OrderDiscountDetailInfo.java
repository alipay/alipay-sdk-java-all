package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class OrderDiscountDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1334438687942443928L;

	/**
	 * 订单咨询返回的consultId，需透传到下单链路，下单会基于这个id做结果一致性校验
	 */
	@ApiField("activity_consult_id")
	private String activityConsultId;

	/**
	 * sku优惠列表
	 */
	@ApiListField("item_consult_detail_info_list")
	@ApiField("promo_item_consult_detail_info")
	private List<PromoItemConsultDetailInfo> itemConsultDetailInfoList;

	/**
	 * 渠道优惠汇总列表
	 */
	@ApiListField("promo_amount_info_list")
	@ApiField("promo_sum_info")
	private List<PromoSumInfo> promoAmountInfoList;

	public String getActivityConsultId() {
		return this.activityConsultId;
	}
	public void setActivityConsultId(String activityConsultId) {
		this.activityConsultId = activityConsultId;
	}

	public List<PromoItemConsultDetailInfo> getItemConsultDetailInfoList() {
		return this.itemConsultDetailInfoList;
	}
	public void setItemConsultDetailInfoList(List<PromoItemConsultDetailInfo> itemConsultDetailInfoList) {
		this.itemConsultDetailInfoList = itemConsultDetailInfoList;
	}

	public List<PromoSumInfo> getPromoAmountInfoList() {
		return this.promoAmountInfoList;
	}
	public void setPromoAmountInfoList(List<PromoSumInfo> promoAmountInfoList) {
		this.promoAmountInfoList = promoAmountInfoList;
	}

}
