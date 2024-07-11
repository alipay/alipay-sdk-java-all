package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人员信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:16:57
 */
public class PersonDTO extends AlipayObject {

	private static final long serialVersionUID = 3214851667451113135L;

	/**
	 * 是否离职
	 */
	@ApiField("resign")
	private Boolean resign;

	/**
	 * 员工名字
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 员工工号
	 */
	@ApiField("work_no")
	private String workNo;

	public Boolean getResign() {
		return this.resign;
	}
	public void setResign(Boolean resign) {
		this.resign = resign;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
