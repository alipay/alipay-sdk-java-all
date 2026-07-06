package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易时间段模型
 *
 * @author auto create
 * @since 1.0, 2026-07-01 11:50:47
 */
public class TradingPeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 7647142285395974562L;

	/**
	 * 归属日期
	 */
	@ApiField("belong_day")
	private String belongDay;

	/**
	 * 交易状态描述
	 */
	@ApiListField("stages")
	@ApiField("trading_stage_d_t_o")
	private List<TradingStageDTO> stages;

	public String getBelongDay() {
		return this.belongDay;
	}
	public void setBelongDay(String belongDay) {
		this.belongDay = belongDay;
	}

	public List<TradingStageDTO> getStages() {
		return this.stages;
	}
	public void setStages(List<TradingStageDTO> stages) {
		this.stages = stages;
	}

}
