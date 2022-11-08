package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附近有啥-供给门店信息线上回流表_亚运专用-酒店状态
 *
 * @author auto create
 * @since 1.0, 2022-05-19 20:18:42
 */
public class HotelStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 2569632594383629946L;

	/**
	 * 口碑门店id/飞猪景点id/飞猪酒店id
	 */
	@ApiField("target_id")
	private String targetId;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
