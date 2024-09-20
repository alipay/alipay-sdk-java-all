package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品售卖信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:01:18
 */
public class CardTemplateSale extends AlipayObject {

	private static final long serialVersionUID = 6784633356861245637L;

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
