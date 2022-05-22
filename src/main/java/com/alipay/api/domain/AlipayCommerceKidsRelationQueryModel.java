package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲子关系查询
 *
 * @author auto create
 * @since 1.0, 2020-12-04 18:01:45
 */
public class AlipayCommerceKidsRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3556625342143599628L;

	/**
	 * 家长支付宝userId，用于查询与该家长关联的孩子
	 */
	@ApiField("parent_uid")
	private String parentUid;

	/**
	 * 场景码，接入前需要进行申请,如：PHILANTHROPY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码，需要提前沟通，如：XB_SELECT
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getParentUid() {
		return this.parentUid;
	}
	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
