package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触达策略
 *
 * @author auto create
 * @since 1.0, 2025-01-10 14:37:54
 */
public class ContactStrategy extends AlipayObject {

	private static final long serialVersionUID = 7883282885897475443L;

	/**
	 * 期望拨打时间
	 */
	@ApiField("expect_call_time")
	private Date expectCallTime;

	/**
	 * 最后拨打时间
	 */
	@ApiField("latest_call_time")
	private Date latestCallTime;

	/**
	 * 手机号类型
	 */
	@ApiField("param_type")
	private String paramType;

	public Date getExpectCallTime() {
		return this.expectCallTime;
	}
	public void setExpectCallTime(Date expectCallTime) {
		this.expectCallTime = expectCallTime;
	}

	public Date getLatestCallTime() {
		return this.latestCallTime;
	}
	public void setLatestCallTime(Date latestCallTime) {
		this.latestCallTime = latestCallTime;
	}

	public String getParamType() {
		return this.paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

}
