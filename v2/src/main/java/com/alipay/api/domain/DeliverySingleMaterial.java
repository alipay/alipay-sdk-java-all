package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放单素材资源
 *
 * @author auto create
 * @since 1.0, 2023-05-19 10:59:37
 */
public class DeliverySingleMaterial extends AlipayObject {

	private static final long serialVersionUID = 3833649591636624257L;

	/**
	 * 投放计划图片素材。通过接口alipay.marketing.material.image.upload上传图片返回的resource_id。
	 */
	@ApiField("delivery_image")
	private String deliveryImage;

	public String getDeliveryImage() {
		return this.deliveryImage;
	}
	public void setDeliveryImage(String deliveryImage) {
		this.deliveryImage = deliveryImage;
	}

}
