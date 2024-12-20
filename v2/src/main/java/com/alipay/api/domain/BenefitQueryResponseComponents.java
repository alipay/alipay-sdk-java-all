package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益召回响应组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitQueryResponseComponents extends AlipayObject {

	private static final long serialVersionUID = 7699322799834982761L;

	/**
	 * 权益召回组件
	 */
	@ApiField("luck_draw_query_component")
	private BenefitQueryResponseComponent luckDrawQueryComponent;

	public BenefitQueryResponseComponent getLuckDrawQueryComponent() {
		return this.luckDrawQueryComponent;
	}
	public void setLuckDrawQueryComponent(BenefitQueryResponseComponent luckDrawQueryComponent) {
		this.luckDrawQueryComponent = luckDrawQueryComponent;
	}

}
