package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选址查询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-17 11:30:53
 */
public class AlipayDataAiserviceHellobikeSiteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1581658766781497975L;

	/**
	 * 任务id.  （当空时，返回最近3个月的所有任务及状态）
	 */
	@ApiField("plan_id")
	private String planId;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
