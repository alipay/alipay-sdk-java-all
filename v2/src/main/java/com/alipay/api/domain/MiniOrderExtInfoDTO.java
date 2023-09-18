package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2023-08-11 15:27:55
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1764974489773315623L;

	/**
	 * 预约上门取件的时间,格式为  yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("door_time")
	private Date doorTime;

	/**
	 * 完整的支付参数拼接成的字符串，从服务端获取
	 */
	@ApiField("order_str")
	private String orderStr;

	public Date getDoorTime() {
		return this.doorTime;
	}
	public void setDoorTime(Date doorTime) {
		this.doorTime = doorTime;
	}

	public String getOrderStr() {
		return this.orderStr;
	}
	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}

}
