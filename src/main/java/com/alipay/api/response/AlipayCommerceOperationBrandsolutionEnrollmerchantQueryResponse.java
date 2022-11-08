package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantActivityGoods;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.brandsolution.enrollmerchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-24 10:56:40
 */
public class AlipayCommerceOperationBrandsolutionEnrollmerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3441656185398266416L;

	/** 
	 * 活动状态，枚举：WAIT_AUDIT（审核中）/AUDIT_FAIL（审核拒绝）/AUDIT_SUCCESS（审核通过）/PAUSE（暂停）
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 活动报名商家权益信息
	 */
	@ApiListField("merchant_activity_goods_benefit")
	@ApiField("merchant_activity_goods")
	private List<MerchantActivityGoods> merchantActivityGoodsBenefit;

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setMerchantActivityGoodsBenefit(List<MerchantActivityGoods> merchantActivityGoodsBenefit) {
		this.merchantActivityGoodsBenefit = merchantActivityGoodsBenefit;
	}
	public List<MerchantActivityGoods> getMerchantActivityGoodsBenefit( ) {
		return this.merchantActivityGoodsBenefit;
	}

}
