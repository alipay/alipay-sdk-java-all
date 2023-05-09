package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-23 17:57:55
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8716857843783966888L;

	/**
	 * 预约上门取件的时间点,时间格式为 yyyy-MM-dd HH:mm:ss
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
