package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询产品机型列表
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:54:02
 */
public class AlipayOpenMiniAmpeDevicemodelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6523223946868572864L;

	/**
	 * 产品ID，必填
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
