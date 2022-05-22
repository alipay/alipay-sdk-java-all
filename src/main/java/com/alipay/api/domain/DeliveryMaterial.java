package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放素材信息
 *
 * @author auto create
 * @since 1.0, 2022-05-16 10:10:42
 */
public class DeliveryMaterial extends AlipayObject {

	private static final long serialVersionUID = 8796351528646172126L;

	/**
	 * 单素材对象
	 */
	@ApiField("delivery_single_material")
	private DeliverySingleMaterial deliverySingleMaterial;

	public DeliverySingleMaterial getDeliverySingleMaterial() {
		return this.deliverySingleMaterial;
	}
	public void setDeliverySingleMaterial(DeliverySingleMaterial deliverySingleMaterial) {
		this.deliverySingleMaterial = deliverySingleMaterial;
	}

}
