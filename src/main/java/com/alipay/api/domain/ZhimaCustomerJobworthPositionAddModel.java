package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证岗位收集
 *
 * @author auto create
 * @since 1.0, 2021-12-13 17:00:24
 */
public class ZhimaCustomerJobworthPositionAddModel extends AlipayObject {

	private static final long serialVersionUID = 1351942293474948848L;

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
