package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.activity.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 21:02:41
 */
public class AlipayCommerceActivityDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5319355392925265913L;

	/** 
	 * null
	 */
	@ApiListField("discount_activity_info_list")
	@ApiField("activity_discount_info")
	private List<ActivityDiscountInfo> discountActivityInfoList;

	public void setDiscountActivityInfoList(List<ActivityDiscountInfo> discountActivityInfoList) {
		this.discountActivityInfoList = discountActivityInfoList;
	}
	public List<ActivityDiscountInfo> getDiscountActivityInfoList( ) {
		return this.discountActivityInfoList;
	}

}
