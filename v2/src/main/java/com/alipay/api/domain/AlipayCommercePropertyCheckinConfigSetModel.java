package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业签到作业配置接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:07:31
 */
public class AlipayCommercePropertyCheckinConfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 1727341712721595193L;

	/**
	 * 打卡链接
	 */
	@ApiField("clock_url")
	private String clockUrl;

	/**
	 * 岗位id
	 */
	@ApiField("job_id")
	private String jobId;

	public String getClockUrl() {
		return this.clockUrl;
	}
	public void setClockUrl(String clockUrl) {
		this.clockUrl = clockUrl;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}
