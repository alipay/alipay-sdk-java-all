package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改设备产品
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:38
 */
public class AlipayOpenMiniAmpeProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7447434173661832982L;

	/**
	 * 产品id，必填
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 设备产品名称, 必填，最大长度32，单oid下唯一
	 */
	@ApiField("product_name")
	private String productName;

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

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
