package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单子活动履约撤销
 *
 * @author auto create
 * @since 1.0, 2025-02-10 21:27:17
 */
public class AlipayOfflineProviderNsalesSubactivityfulfillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5278875427553873411L;

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
