package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class OrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5171916815637361971L;

	/**
	 * 预约时间，字段名称:预约上门取件时间
字段说明:预约上门取件的时间点,时间格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("door_time")
	private String doorTime;

	public String getDoorTime() {
		return this.doorTime;
	}
	public void setDoorTime(String doorTime) {
		this.doorTime = doorTime;
	}

}
