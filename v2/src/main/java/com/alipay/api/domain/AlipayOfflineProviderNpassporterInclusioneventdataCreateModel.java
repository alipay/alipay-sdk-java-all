package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外滩大会事件数据入库
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:39:38
 */
public class AlipayOfflineProviderNpassporterInclusioneventdataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8649476752237268492L;

	/**
	 * 注册和开闸场景传项目ID，如：HD20250730000001XKK999，其他论坛签到场景传论坛各自论坛活动ID即可
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 业务类型
开闸机注册:REGISTER
开闸机:OPEN_GATE
分会场签到:SIGN_IN
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户标签
	 */
	@ApiField("user_tag")
	private String userTag;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getUserTag() {
		return this.userTag;
	}
	public void setUserTag(String userTag) {
		this.userTag = userTag;
	}

}
