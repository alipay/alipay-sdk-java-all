package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家特权激活信息返回
 *
 * @author auto create
 * @since 1.0, 2021-08-27 17:09:42
 */
public class AlipayUserPartnerPrivilegeMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6286154627697786837L;

	/**
	 * 当前用户注册成为合作商家会员（成为会员后可享有相应的特权）的时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 当前用户在合作商家体系中的会员等级英文编码，如 gloden（黄金会员)，primary（大众会员），如果商家没有会员等级概念，则默认为“member”
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 当前用户在商家侧的状态：1.激活会员-ACTIVE；2.关闭会员-CLOSE
	 */
	@ApiField("status")
	private String status;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
