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
 * @since 1.0, 2025-04-08 16:22:16
 */
public class AlipayOfflineSmddHotItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1288332285332838481L;

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
