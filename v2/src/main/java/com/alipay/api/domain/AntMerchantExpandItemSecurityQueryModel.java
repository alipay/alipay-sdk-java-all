package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品查询
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:59:25
 */
public class AntMerchantExpandItemSecurityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5713789618895849111L;

	/**
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 场景码（具体值请参见产品文档）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商品状态：EFFECT（有效）、INVALID（无效）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品归属主体ID
例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型：
5（店铺）
	 */
	@ApiField("target_type")
	private String targetType;

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
