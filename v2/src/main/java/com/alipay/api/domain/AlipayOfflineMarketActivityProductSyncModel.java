package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家商品活动同步
 *
 * @author auto create
 * @since 1.0, 2026-08-18 15:27:48
 */
public class AlipayOfflineMarketActivityProductSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2736176747336535189L;

	/**
	 * null
	 */
	@ApiListField("activities")
	@ApiField("activity_sync_item")
	private List<ActivitySyncItem> activities;

	public List<ActivitySyncItem> getActivities() {
		return this.activities;
	}
	public void setActivities(List<ActivitySyncItem> activities) {
		this.activities = activities;
	}

}
