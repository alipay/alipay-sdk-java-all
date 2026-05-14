package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-10 14:22:44
 */
public class ExceptionInfo extends AlipayObject {

	private static final long serialVersionUID = 5283172337763977282L;

	/**
	 * 任务执行过程中设备出现的异常
	 */
	@ApiField("exp_code")
	private String expCode;

	/**
	 * 任务执行过程中设备异常发生的时间
	 */
	@ApiField("exp_time")
	private Date expTime;

	public String getExpCode() {
		return this.expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}

	public Date getExpTime() {
		return this.expTime;
	}
	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}

}
