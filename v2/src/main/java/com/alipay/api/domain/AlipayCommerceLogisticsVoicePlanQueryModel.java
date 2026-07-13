package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询语音投放计划
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:32:56
 */
public class AlipayCommerceLogisticsVoicePlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7628171254764863893L;

	/**
	 * 投放计划ID
	 */
	@ApiField("logistics_voice_plan_id")
	private String logisticsVoicePlanId;

	public String getLogisticsVoicePlanId() {
		return this.logisticsVoicePlanId;
	}
	public void setLogisticsVoicePlanId(String logisticsVoicePlanId) {
		this.logisticsVoicePlanId = logisticsVoicePlanId;
	}

}
