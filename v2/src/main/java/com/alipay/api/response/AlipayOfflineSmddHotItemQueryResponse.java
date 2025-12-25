package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountActivityBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.hot.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:22:36
 */
public class AlipayOfflineSmddHotItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8491358939173539583L;

	/** 
	 * 商品对象
	 */
	@ApiListField("activity_list")
	@ApiField("discount_activity_bean")
	private List<DiscountActivityBean> activityList;

	public void setActivityList(List<DiscountActivityBean> activityList) {
		this.activityList = activityList;
	}
	public List<DiscountActivityBean> getActivityList( ) {
		return this.activityList;
	}

}
