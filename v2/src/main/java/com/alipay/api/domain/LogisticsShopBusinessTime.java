package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流业务驿站门店经营时间
 *
 * @author auto create
 * @since 1.0, 2023-10-26 11:56:54
 */
public class LogisticsShopBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 5791664868576176216L;

	/**
	 * 营业开始时间，格式如示例值
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 营业结束时间，格式如示例值
	 */
	@ApiField("end_time")
	private String endTime;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
