package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专项风险
 *
 * @author auto create
 * @since 1.0, 2026-10-26 09:37:55
 */
public class ShipVerticalRiskVO extends AlipayObject {

	private static final long serialVersionUID = 1895281943513776428L;

	/**
	 * 履约能力等级
	 */
	@ApiField("fulfillment_capacity_level")
	private String fulfillmentCapacityLevel;

	/**
	 * 中介风险等级
	 */
	@ApiField("mediary_risk_level")
	private String mediaryRiskLevel;

	/**
	 * 当前在租等级
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
