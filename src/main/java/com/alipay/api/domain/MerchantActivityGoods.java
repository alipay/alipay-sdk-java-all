package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消百万小店项目，商家活动单品数据
 *
 * @author auto create
 * @since 1.0, 2022-04-28 10:27:58
 */
public class MerchantActivityGoods extends AlipayObject {

	private static final long serialVersionUID = 5767169534591619371L;

	/**
	 * 活动单品信息
	 */
	@ApiListField("activity_goods_benefit")
	@ApiField("activity_goods")
	private List<ActivityGoods> activityGoodsBenefit;

	/**
	 * 商家活动状态
INIT("INIT","初始化"),
ENROLLING("ENROLLING", "报名中"),
GOING("GOING", "进行中"),
STOP("STOP", "中止")
	 */
	@ApiField("merchant_activity_status")
	private String merchantActivityStatus;

	/**
	 * 商户pid，唯一标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public List<ActivityGoods> getActivityGoodsBenefit() {
		return this.activityGoodsBenefit;
	}
	public void setActivityGoodsBenefit(List<ActivityGoods> activityGoodsBenefit) {
		this.activityGoodsBenefit = activityGoodsBenefit;
	}

	public String getMerchantActivityStatus() {
		return this.merchantActivityStatus;
	}
	public void setMerchantActivityStatus(String merchantActivityStatus) {
		this.merchantActivityStatus = merchantActivityStatus;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
