package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体统计数据条目
 *
 * @author auto create
 * @since 1.0, 2026-05-22 17:09:29
 */
public class AgentStatisticDataItemOpenVO extends AlipayObject {

	private static final long serialVersionUID = 8726895279832249628L;

	/**
	 * 统计数量结果
	 */
	@ApiField("statistic_num")
	private String statisticNum;

	/**
	 * 统计项名称
	 */
	@ApiField("statistic_type")
	private String statisticType;

	public String getStatisticNum() {
		return this.statisticNum;
	}
	public void setStatisticNum(String statisticNum) {
		this.statisticNum = statisticNum;
	}

	public String getStatisticType() {
		return this.statisticType;
	}
	public void setStatisticType(String statisticType) {
		this.statisticType = statisticType;
	}

}
