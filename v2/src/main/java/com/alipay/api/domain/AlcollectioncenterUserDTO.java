package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人员
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class AlcollectioncenterUserDTO extends AlipayObject {

	private static final long serialVersionUID = 5858871189152932879L;

	/**
	 * 案件id
	 */
	@ApiField("affair_id")
	private String affairId;

	/**
	 * 部门
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 部门编号
	 */
	@ApiField("dept_no")
	private String deptNo;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getAffairId() {
		return this.affairId;
	}
	public void setAffairId(String affairId) {
		this.affairId = affairId;
	}

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return this.deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
