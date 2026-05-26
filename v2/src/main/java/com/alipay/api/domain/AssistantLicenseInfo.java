package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-02 11:48:34
 */
public class AssistantLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 4862938989686879844L;

	/**
	 * 许可证开始生效时间，为一个时间字段，在这个时间点后（包含当前时间点）可使用
	 */
	@ApiField("begin_time")
	private Date beginTime;

	/**
	 * 许可证失效时间，表示在这个时间(不包括当前时间)之后，当前凭证不可使用，
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 许可证信息，用户使用这个许可证绑定后可使用相应的权益
	 */
	@ApiField("license")
	private String license;

	public Date getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLicense() {
		return this.license;
	}
	public void setLicense(String license) {
		this.license = license;
	}

}
