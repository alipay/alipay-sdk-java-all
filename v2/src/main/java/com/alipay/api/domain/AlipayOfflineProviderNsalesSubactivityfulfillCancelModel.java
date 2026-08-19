package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单子活动履约撤销
 *
 * @author auto create
 * @since 1.0, 2026-08-18 14:11:11
 */
public class AlipayOfflineProviderNsalesSubactivityfulfillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3164474252874199473L;

	/**
	 * 卖进订单子活动id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

}
