package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单配置查询
 *
 * @author auto create
 * @since 1.0, 2025-06-03 16:17:40
 */
public class AlipayCommerceEcApprovalConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1743169182669786827L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 一级场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级场景
	 */
	@ApiField("scene_sub_category")
	private String sceneSubCategory;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSceneSubCategory() {
		return this.sceneSubCategory;
	}
	public void setSceneSubCategory(String sceneSubCategory) {
		this.sceneSubCategory = sceneSubCategory;
	}

}
