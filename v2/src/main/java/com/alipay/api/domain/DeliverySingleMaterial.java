package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放单素材资源
 *
 * @author auto create
 * @since 1.0, 2024-06-26 10:59:20
 */
public class DeliverySingleMaterial extends AlipayObject {

	private static final long serialVersionUID = 4366866838512598387L;

	/**
	 * 投放计划图片素材。通过接口<a href ="https://opendocs.alipay.com/open/049d64?pathHash=a411214d&scene=928cd58dc06f4466b9ad657776327a06">alipay.marketing.material.image.upload</a>上传图片返回的resource_id。
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
