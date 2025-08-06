package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 顶部运营位状态修改
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:28:53
 */
public class AlipayMerchantGroupActivityStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3656826983984821579L;

	/**
	 * 商家群活动id
	 */
	@ApiField("group_activity_id")
	private String groupActivityId;

	/**
	 * 顶部运营位更新状态 1、STOPPED(提前结束)，提前结束操作只能在上线状态VALID才能操作             状态流转如下：VALID(生效)->STOPPED(提前结束)
	 */
	@ApiField("status")
	private String status;

	public String getGroupActivityId() {
		return this.groupActivityId;
	}
	public void setGroupActivityId(String groupActivityId) {
		this.groupActivityId = groupActivityId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
