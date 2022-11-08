package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2022-09-19 14:25:38
 */
public class Operator extends AlipayObject {

	private static final long serialVersionUID = 5629514692885125836L;

	/**
	 * 工号
示例--蚂蚁内部：258900      外包：WB813544
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 花名
示例--蚂蚁内部：克礼     外包：汪彬
	 */
	@ApiField("nick_name")
	private String nickName;

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
