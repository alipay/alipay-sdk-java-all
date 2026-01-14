package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益流水查询组件集
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRecordQueryResponseComponents extends AlipayObject {

	private static final long serialVersionUID = 4834633589349149642L;

	/**
	 * 权益流水查询组件
	 */
	@ApiField("luck_draw_record_query_component")
	private BenefitRecordQueryResponseComponent luckDrawRecordQueryComponent;

	public BenefitRecordQueryResponseComponent getLuckDrawRecordQueryComponent() {
		return this.luckDrawRecordQueryComponent;
	}
	public void setLuckDrawRecordQueryComponent(BenefitRecordQueryResponseComponent luckDrawRecordQueryComponent) {
		this.luckDrawRecordQueryComponent = luckDrawRecordQueryComponent;
	}

}
