package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息(如：学生信息)
 *
 * @author auto create
 * @since 1.0, 2020-01-09 17:56:03
 */
public class UserIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 3413284756155657817L;

	/**
	 * 校园码身份信息
	 */
	@ApiField("h_school_info")
	private HSchoolInfo hSchoolInfo;

	public HSchoolInfo gethSchoolInfo() {
		return this.hSchoolInfo;
	}
	public void sethSchoolInfo(HSchoolInfo hSchoolInfo) {
		this.hSchoolInfo = hSchoolInfo;
	}

}
