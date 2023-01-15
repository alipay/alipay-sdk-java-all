package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨端运营流量位删除
 *
 * @author auto create
 * @since 1.0, 2021-05-18 14:55:08
 */
public class AlipayOpenMiniResourceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8328858596358944674L;

	/**
	 * 流量位id，只能删除属于自己的流量位id
	 */
	@ApiField("resource_id")
	private String resourceId;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
