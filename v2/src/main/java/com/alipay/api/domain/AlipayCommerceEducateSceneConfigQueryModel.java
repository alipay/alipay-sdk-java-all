package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一脸通行服务配置查询
 *
 * @author auto create
 * @since 1.0, 2025-05-29 15:58:07
 */
public class AlipayCommerceEducateSceneConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6467534322331461138L;

	/**
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校外标（不可能跟内标同时为空，都传入时已内标为准）
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

}
