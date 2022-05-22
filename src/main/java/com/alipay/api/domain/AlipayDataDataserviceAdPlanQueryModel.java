package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单元
 *
 * @author auto create
 * @since 1.0, 2021-04-29 20:02:25
 */
public class AlipayDataDataserviceAdPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1852389516739669619L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 外部唯一计划编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}

}
