package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流详情
 *
 * @author auto create
 * @since 1.0, 2024-04-11 15:30:52
 */
public class WaybillStep extends AlipayObject {

	private static final long serialVersionUID = 6833298925618484812L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 时间
	 */
	@ApiField("time")
	private Date time;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
