package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户会员权益同步
 *
 * @author auto create
 * @since 1.0, 2026-06-30 13:52:55
 */
public class AlipayPcreditHuabeiMerchantPrivilegeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8542848338258617783L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 当前用户在商家侧的英文等级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 当前等级的过期时间
	 */
	@ApiField("grade_expired_time")
	private Date gradeExpiredTime;

	/**
	 * 权益名称信息
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 用户Id信息
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用作幂等控制，注意同步不同的状态时，外部业务号必须不同，否则会被幂等掉，无法正确同步数据。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 注册渠道编码
	 */
	@ApiField("register_channel")
	private String registerChannel;

	/**
	 * 当前用户消费商家特权的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户Id信息
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 当pid无法区分商家时，合作商家需要传递此字段
	 */
	@ApiField("vendor")
	private String vendor;

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

	public Date getGradeExpiredTime() {
		return this.gradeExpiredTime;
	}
	public void setGradeExpiredTime(Date gradeExpiredTime) {
		this.gradeExpiredTime = gradeExpiredTime;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRegisterChannel() {
		return this.registerChannel;
	}
	public void setRegisterChannel(String registerChannel) {
		this.registerChannel = registerChannel;
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

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
