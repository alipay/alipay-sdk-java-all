package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv学校查询
 *
 * @author auto create
 * @since 1.0, 2020-05-26 16:12:34
 */
public class AlipayOverseasOpenSchoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4764261891899835366L;

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
