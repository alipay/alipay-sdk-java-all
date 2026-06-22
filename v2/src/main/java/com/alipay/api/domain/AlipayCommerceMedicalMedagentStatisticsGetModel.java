package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生智能体统计数据接口
 *
 * @author auto create
 * @since 1.0, 2026-05-22 17:12:50
 */
public class AlipayCommerceMedicalMedagentStatisticsGetModel extends AlipayObject {

	private static final long serialVersionUID = 3426359111622523844L;

	/**
	 * 智能体ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
