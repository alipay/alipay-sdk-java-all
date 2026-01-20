package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下线报名
 *
 * @author auto create
 * @since 1.0, 2023-10-08 09:57:50
 */
public class AlipayMarketingRecruitEnrollCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8259444693793893889L;

	/**
	 * 活动报名ID
	 */
	@ApiField("enroll_id")
	private String enrollId;

	public String getEnrollId() {
		return this.enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}

}
