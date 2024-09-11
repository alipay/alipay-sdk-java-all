package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房小区信息删除
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:33:04
 */
public class AlipayOpenAppRentroomAreaDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2148459943281371986L;

	/**
	 * 要删除的小区ID
	 */
	@ApiField("area_id")
	private String areaId;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

}
