package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁消息通知扩展信息VO
 *
 * @author auto create
 * @since 1.0, 2026-04-24 10:23:36
 */
public class RentOrderChangedExtendInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6119541541446885345L;

	/**
	 * 租赁派单ID，唯一标识一次派单请求
	 */
	@ApiField("rent_dispatch_id")
	private String rentDispatchId;

	public String getRentDispatchId() {
		return this.rentDispatchId;
	}
	public void setRentDispatchId(String rentDispatchId) {
		this.rentDispatchId = rentDispatchId;
	}

}
