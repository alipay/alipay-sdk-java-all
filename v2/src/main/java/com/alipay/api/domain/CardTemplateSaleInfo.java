package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版售卖信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardTemplateSaleInfo extends AlipayObject {

	private static final long serialVersionUID = 5375375554134397276L;

	/**
	 * 售卖结束时间
	 */
	@ApiField("salable_end_time")
	private Date salableEndTime;

	/**
	 * 售卖开始时间
	 */
	@ApiField("salable_start_time")
	private Date salableStartTime;

	public Date getSalableEndTime() {
		return this.salableEndTime;
	}
	public void setSalableEndTime(Date salableEndTime) {
		this.salableEndTime = salableEndTime;
	}

	public Date getSalableStartTime() {
		return this.salableStartTime;
	}
	public void setSalableStartTime(Date salableStartTime) {
		this.salableStartTime = salableStartTime;
	}

}
