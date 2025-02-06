package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单子活动履约撤销
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:49:28
 */
public class AlipayOfflineProviderNsalesSubactivityfulfillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5355824584354284157L;

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
