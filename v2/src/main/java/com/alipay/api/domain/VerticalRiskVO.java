package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 【注意事项】此字段返回需要满足以下条件
1.3C租赁场景需签约租安盾产品
 2.订单需要完成代扣或免押签约后，才会返回值。
 3.租安盾产品订单——免押场景下需要配置租安盾策略且拉起免押受理台的策略是租安盾策略；
4.使用的风控策略类型为芝麻租赁租安盾长租策略: risk_policy_value=zhimazulin_zuandun
5.接口查询参数请求中?consult_risk_types=VERTICAL_RENT_RISK
其他信息可参考租安盾产品接入指南。
 *
 * @author auto create
 * @since 1.0, 2026-04-23 15:37:45
 */
public class VerticalRiskVO extends AlipayObject {

	private static final long serialVersionUID = 1353829448962764331L;

	/**
	 * 预测用户在未来租赁周期内的履约能力，从0到5履约能力变高，风险更低
	 */
	@ApiField("fulfillment_capacity_level")
	private String fulfillmentCapacityLevel;

	/**
	 * 刻画租赁订单与中介关联程度的风险等级
	 */
	@ApiField("mediary_risk_level")
	private String mediaryRiskLevel;

	/**
	 * 刻画用户当前的实际在租笔数，评估用户租赁需求程度及履约压力
	 */
	@ApiField("ongoing_rent_level")
	private String ongoingRentLevel;

	public String getFulfillmentCapacityLevel() {
		return this.fulfillmentCapacityLevel;
	}
	public void setFulfillmentCapacityLevel(String fulfillmentCapacityLevel) {
		this.fulfillmentCapacityLevel = fulfillmentCapacityLevel;
	}

	public String getMediaryRiskLevel() {
		return this.mediaryRiskLevel;
	}
	public void setMediaryRiskLevel(String mediaryRiskLevel) {
		this.mediaryRiskLevel = mediaryRiskLevel;
	}

	public String getOngoingRentLevel() {
		return this.ongoingRentLevel;
	}
	public void setOngoingRentLevel(String ongoingRentLevel) {
		this.ongoingRentLevel = ongoingRentLevel;
	}

}
