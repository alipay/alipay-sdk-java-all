package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业特色岗位应聘记录同步
 *
 * @author auto create
 * @since 1.0, 2025-04-14 19:37:27
 */
public class AlipayEbppIndustryFeaturedjobApplyinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1441582146156184533L;

	/**
	 * 应聘信息最新更新时间，如果应聘信息有更新，通过本接口传更新后的信息以及最新更新时间。 在某些情况下更新信息在本接口无法体现，例如服务商侧的应聘状态更详尽，多种状态对应到本岗位的一个状态，（查看简历、一面中、二面均对应到“应聘中”状态），但从查看简历更新到一面中时，仍需要通过本接口同步最新更新时间，支付宝引导用户到服务商小程序查看最新信息 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_change_time")
	private Date applyChangeTime;

	/**
	 * 特色专区中报名时携带的支付宝报名id，后续报名状态变更以此id为基准同步
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 应聘链路中的状态变化枚举
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 用户发起应聘的时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 特色专区中报名时携带的支付宝内部岗位id

	 */
	@ApiField("job_id")
	private String jobId;

	public Date getApplyChangeTime() {
		return this.applyChangeTime;
	}
	public void setApplyChangeTime(Date applyChangeTime) {
		this.applyChangeTime = applyChangeTime;
	}

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}
