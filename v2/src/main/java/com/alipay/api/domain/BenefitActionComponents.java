package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖行为组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:53
 */
public class BenefitActionComponents extends AlipayObject {

	private static final long serialVersionUID = 6414791484826964133L;

	/**
	 * 权益发奖行为组件
	 */
	@ApiField("luck_draw_action_component")
	private BenefitActionComponent luckDrawActionComponent;

	public BenefitActionComponent getLuckDrawActionComponent() {
		return this.luckDrawActionComponent;
	}
	public void setLuckDrawActionComponent(BenefitActionComponent luckDrawActionComponent) {
		this.luckDrawActionComponent = luckDrawActionComponent;
	}

}
