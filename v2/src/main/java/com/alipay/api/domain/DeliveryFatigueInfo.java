package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 疲劳度信息：展位&创意疲劳度、策略组疲劳度、内容疲劳度
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:32
 */
public class DeliveryFatigueInfo extends AlipayObject {

	private static final long serialVersionUID = 1814879748937853398L;

	/**
	 * 内容疲劳度
	 */
	@ApiField("content_fatigue")
	private DeliveryFatigueContent contentFatigue;

	/**
	 * 展位内容埋点配置信息,无任何用户信息
	 */
	@ApiField("scm")
	private String scm;

	/**
	 * 策略组疲劳度
	 */
	@ApiListField("strategy_group_fatigue")
	@ApiField("strategy_group_fatigue")
	private List<StrategyGroupFatigue> strategyGroupFatigue;

	/**
	 * 展位和创意疲劳度
	 */
	@ApiField("ucdp_fatigue_info")
	private String ucdpFatigueInfo;

	public DeliveryFatigueContent getContentFatigue() {
		return this.contentFatigue;
	}
	public void setContentFatigue(DeliveryFatigueContent contentFatigue) {
		this.contentFatigue = contentFatigue;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

	public List<StrategyGroupFatigue> getStrategyGroupFatigue() {
		return this.strategyGroupFatigue;
	}
	public void setStrategyGroupFatigue(List<StrategyGroupFatigue> strategyGroupFatigue) {
		this.strategyGroupFatigue = strategyGroupFatigue;
	}

	public String getUcdpFatigueInfo() {
		return this.ucdpFatigueInfo;
	}
	public void setUcdpFatigueInfo(String ucdpFatigueInfo) {
		this.ucdpFatigueInfo = ucdpFatigueInfo;
	}

}
