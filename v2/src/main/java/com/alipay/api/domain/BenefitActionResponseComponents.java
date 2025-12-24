package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖行为组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:54
 */
public class BenefitActionResponseComponents extends AlipayObject {

	private static final long serialVersionUID = 7618737477726441896L;

	/**
	 * 权益发奖行为组件
	 */
	@ApiField("luck_draw_action_component")
	private BenefitActionResponseComponent luckDrawActionComponent;

	public BenefitActionResponseComponent getLuckDrawActionComponent() {
		return this.luckDrawActionComponent;
	}
	public void setLuckDrawActionComponent(BenefitActionResponseComponent luckDrawActionComponent) {
		this.luckDrawActionComponent = luckDrawActionComponent;
	}

}
