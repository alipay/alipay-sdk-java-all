package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下线报名
 *
 * @author auto create
 * @since 1.0, 2022-01-25 11:44:42
 */
public class AlipayMarketingRecruitEnrollCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4345392738725631425L;

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
