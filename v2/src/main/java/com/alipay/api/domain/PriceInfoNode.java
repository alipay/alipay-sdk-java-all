package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格信息节点
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:27
 */
public class PriceInfoNode extends AlipayObject {

	private static final long serialVersionUID = 3829438977622182671L;

	/**
	 * 节点结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 价格信息，单位（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 节点开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
