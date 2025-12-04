package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心招工平台雇主信息添加
 *
 * @author auto create
 * @since 1.0, 2025-03-06 10:49:23
 */
public class AlipayEbppIndustryRecruitEmployerAddModel extends AlipayObject {

	private static final long serialVersionUID = 6126669328494664883L;

	/**
	 * 雇主是否通过快招渠道在服务商侧新注册，true=通过快招渠道新注册用户，false=非快招渠道注册的用户
	 */
	@ApiField("new_register")
	private Boolean newRegister;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 雇主在服务商侧的主键id
	 */
	@ApiField("out_hire_user_id")
	private String outHireUserId;

	/**
	 * 雇主在服务商侧的注册时间
	 */
	@ApiField("register_time")
	private Date registerTime;

	/**
	 * 是否在服务商侧已完成发布岗位，true=已完成，false=未完成
	 */
	@ApiField("release_job")
	private Boolean releaseJob;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getNewRegister() {
		return this.newRegister;
	}
	public void setNewRegister(Boolean newRegister) {
		this.newRegister = newRegister;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutHireUserId() {
		return this.outHireUserId;
	}
	public void setOutHireUserId(String outHireUserId) {
		this.outHireUserId = outHireUserId;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Boolean getReleaseJob() {
		return this.releaseJob;
	}
	public void setReleaseJob(Boolean releaseJob) {
		this.releaseJob = releaseJob;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
