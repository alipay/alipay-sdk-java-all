package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付后推荐下架方案
 *
 * @author auto create
 * @since 1.0, 2019-10-22 22:13:29
 */
public class AlipayOpenMiniPlanOperateOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 2283653775763328431L;

	/**
	 * 指定创建方案的 pid, 该字段仅白名单应用可用, 其他情况下会被忽略
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 已创建的支付后推荐方案id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
