package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前台类目查询
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:58:01
 */
public class AntMerchantExpandFrontcategorySecurityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7668955433458538533L;

	/**
	 * 场景码（具体值请参见产品文档）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 前台类目归属主体ID
例：前台类目归属主体类型为店铺，则前台类目归属主体ID为店铺ID；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 前台类目归属主体类型:
5（店铺）
	 */
	@ApiField("target_type")
	private String targetType;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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
