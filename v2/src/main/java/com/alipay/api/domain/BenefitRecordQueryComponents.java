package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行为组件集
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRecordQueryComponents extends AlipayObject {

	private static final long serialVersionUID = 6587568381543892265L;

	/**
	 * 权益流水查询组件
	 */
	@ApiField("luck_draw_record_query_component")
	private BenefitRecordQueryComponent luckDrawRecordQueryComponent;

	public BenefitRecordQueryComponent getLuckDrawRecordQueryComponent() {
		return this.luckDrawRecordQueryComponent;
	}
	public void setLuckDrawRecordQueryComponent(BenefitRecordQueryComponent luckDrawRecordQueryComponent) {
		this.luckDrawRecordQueryComponent = luckDrawRecordQueryComponent;
	}

}
