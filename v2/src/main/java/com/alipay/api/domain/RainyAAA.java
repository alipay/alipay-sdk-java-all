package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:42:23
 */
public class RainyAAA extends AlipayObject {

	private static final long serialVersionUID = 4736815614531356593L;

	/**
	 * 是个啥呢
	 */
	@ApiField("object_havnt_name")
	private RainyAa objectHavntName;

	public RainyAa getObjectHavntName() {
		return this.objectHavntName;
	}
	public void setObjectHavntName(RainyAa objectHavntName) {
		this.objectHavntName = objectHavntName;
	}

}
