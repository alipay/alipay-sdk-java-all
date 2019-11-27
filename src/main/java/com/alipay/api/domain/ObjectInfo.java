package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交动态被评论对象实体
 *
 * @author auto create
 * @since 1.0, 2016-10-19 17:43:38
 */
public class ObjectInfo extends AlipayObject {

	private static final long serialVersionUID = 4561529318554314439L;

	/**
	 * 被评论对象的ID
	 */
	@ApiField("object_id")
	private String objectId;

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

}
