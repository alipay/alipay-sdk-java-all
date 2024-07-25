package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展位及对应疲劳度信息
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:43
 */
public class PositionDeliveryFatigueInfo extends AlipayObject {

	private static final long serialVersionUID = 8369311422519142959L;

	/**
	 * 展位对应的疲劳度信息
	 */
	@ApiListField("fatigue_model_info")
	@ApiField("delivery_fatigue_info")
	private List<DeliveryFatigueInfo> fatigueModelInfo;

	/**
	 * 展位code
	 */
	@ApiField("position_code")
	private String positionCode;

	public List<DeliveryFatigueInfo> getFatigueModelInfo() {
		return this.fatigueModelInfo;
	}
	public void setFatigueModelInfo(List<DeliveryFatigueInfo> fatigueModelInfo) {
		this.fatigueModelInfo = fatigueModelInfo;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

}
