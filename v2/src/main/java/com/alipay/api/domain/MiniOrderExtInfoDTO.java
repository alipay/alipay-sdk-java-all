package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2023-10-19 10:06:28
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2452552855147125661L;

	/**
	 * 预约上门取件的时间,格式为  yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("door_time")
	private Date doorTime;

	/**
	 * 芝麻免押冻结资金签名串，调用
<a href="https://opendocs.alipay.com/open/e2e70da4_alipay.fund.auth.order.app.freeze?pathHash=1002681c&ref=api">alipay.fund.auth.order.app.freeze</a>生成，用于租赁场景冻结授权资金
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
