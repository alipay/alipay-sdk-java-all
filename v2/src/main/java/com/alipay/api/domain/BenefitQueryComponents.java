package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益召回组件集
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:54
 */
public class BenefitQueryComponents extends AlipayObject {

	private static final long serialVersionUID = 5842812571244346576L;

	/**
	 * 权益召回组件
	 */
	@ApiField("luck_draw_query_component")
	private BenefitQueryComponent luckDrawQueryComponent;

	public BenefitQueryComponent getLuckDrawQueryComponent() {
		return this.luckDrawQueryComponent;
	}
	public void setLuckDrawQueryComponent(BenefitQueryComponent luckDrawQueryComponent) {
		this.luckDrawQueryComponent = luckDrawQueryComponent;
	}

}
