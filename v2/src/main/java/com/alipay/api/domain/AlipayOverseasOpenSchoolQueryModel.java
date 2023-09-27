package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv学校查询
 *
 * @author auto create
 * @since 1.0, 2022-07-13 12:15:51
 */
public class AlipayOverseasOpenSchoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7144916157215458458L;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
