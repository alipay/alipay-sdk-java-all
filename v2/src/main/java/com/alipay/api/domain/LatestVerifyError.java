package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最近的验证异常信息
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:28:51
 */
public class LatestVerifyError extends AlipayObject {

	private static final long serialVersionUID = 3575218869536793867L;

	/**
	 * 支付宝账号未实名认证
	 */
	@ApiField("code")
	private String code;

	/**
	 * 异常描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 异常时间
	 */
	@ApiField("time")
	private Date time;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
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
