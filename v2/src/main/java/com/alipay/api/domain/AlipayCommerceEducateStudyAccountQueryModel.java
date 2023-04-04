package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学习账号查询
 *
 * @author auto create
 * @since 1.0, 2019-03-08 00:01:23
 */
public class AlipayCommerceEducateStudyAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7216193639129855417L;

	/**
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
