package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单补录信息
 *
 * @author auto create
 * @since 1.0, 2025-11-28 14:16:46
 */
public class RentSupplementaryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4791761943554479999L;

	/**
	 * 用户实际下单时间
	 */
	@ApiField("real_create_time")
	private Date realCreateTime;

	public Date getRealCreateTime() {
		return this.realCreateTime;
	}
	public void setRealCreateTime(Date realCreateTime) {
		this.realCreateTime = realCreateTime;
	}

}
