package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证岗位收集
 *
 * @author auto create
 * @since 1.0, 2023-01-06 14:31:49
 */
public class ZhimaCustomerJobworthPositionAddModel extends AlipayObject {

	private static final long serialVersionUID = 2159964554444971586L;

	/**
	 * 职位信息
	 */
	@ApiField("jobworth_position_info")
	private JobWorthPositionInfo jobworthPositionInfo;

	public JobWorthPositionInfo getJobworthPositionInfo() {
		return this.jobworthPositionInfo;
	}
	public void setJobworthPositionInfo(JobWorthPositionInfo jobworthPositionInfo) {
		this.jobworthPositionInfo = jobworthPositionInfo;
	}

}
