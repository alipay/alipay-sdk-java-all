package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一脸通行服务配置查询
 *
 * @author auto create
 * @since 1.0, 2022-04-27 20:19:42
 */
public class AlipayCommerceEducateSceneConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8849324889111869942L;

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
