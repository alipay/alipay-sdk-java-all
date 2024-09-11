package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房小区信息详情
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:34:21
 */
public class AlipayOpenAppRentroomAreaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3753485843195572237L;

	/**
	 * 小区ID，通过租房小区信息提报接口返参获取
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
