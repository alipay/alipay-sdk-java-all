package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户消费（领取、核销）特权数据同步（无需用户授权）
 *
 * @author auto create
 * @since 1.0, 2021-09-07 11:29:29
 */
public class AlipayUserPartnerPrivilegeauthbaseMatchModel extends AlipayObject {

	private static final long serialVersionUID = 2398465167738766996L;

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

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
