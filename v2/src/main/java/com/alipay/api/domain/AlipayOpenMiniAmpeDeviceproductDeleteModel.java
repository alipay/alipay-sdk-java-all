package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作废产品
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:57:56
 */
public class AlipayOpenMiniAmpeDeviceproductDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2718494453951624358L;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 场景码，申请后平台分配，必填
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
