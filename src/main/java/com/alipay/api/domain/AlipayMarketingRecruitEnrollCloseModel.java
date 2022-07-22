package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下线报名
 *
 * @author auto create
 * @since 1.0, 2022-05-06 20:33:52
 */
public class AlipayMarketingRecruitEnrollCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1489643273287199853L;

	/**
	 * 报名ID
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
