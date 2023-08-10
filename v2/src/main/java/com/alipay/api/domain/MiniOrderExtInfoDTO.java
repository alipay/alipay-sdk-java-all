package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2023-08-08 11:06:28
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4882335759934536518L;

	/**
	 * 预约上门取件的时间点,时间格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("door_time")
	private Date doorTime;

	public Date getDoorTime() {
		return this.doorTime;
	}
	public void setDoorTime(Date doorTime) {
		this.doorTime = doorTime;
	}

}
