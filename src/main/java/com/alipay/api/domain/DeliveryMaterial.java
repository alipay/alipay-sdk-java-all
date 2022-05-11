package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放素材信息
 *
 * @author auto create
 * @since 1.0, 2022-05-07 17:53:41
 */
public class DeliveryMaterial extends AlipayObject {

	private static final long serialVersionUID = 3579731714153396582L;

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
