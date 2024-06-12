package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联对象model
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:47:10
 */
public class ContentObjectRelationForOpenapi extends AlipayObject {

	private static final long serialVersionUID = 4566672718673332553L;

	/**
	 * 对象id,如关联店铺则是shopId
	 */
	@ApiField("object_id")
	private String objectId;

	/**
	 * 对象类型，内容的关联对象类型。
SHOP代表店铺，
ITEM代表商品
	 */
	@ApiField("object_type")
	private String objectType;

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectType() {
		return this.objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

}
