package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务自定义结构化数据，不同 action 可携带不同业务数据
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:17:56
 */
public class DataInfo extends AlipayObject {

	private static final long serialVersionUID = 4724699882985528776L;

	/**
	 * 后续安排说明
	 */
	@ApiField("arrangement")
	private String arrangement;

	/**
	 * 商户联系用户的时间
	 */
	@ApiField("contact_time")
	private Date contactTime;

	/**
	 * 失败详细描述
	 */
	@ApiField("fail_detail")
	private String failDetail;

	/**
	 * 失败原因编码
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 后续跟进计划
	 */
	@ApiField("follow_up_plan")
	private String followUpPlan;

	/**
	 * 拒绝详细描述
	 */
	@ApiField("reject_detail")
	private String rejectDetail;

	/**
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getArrangement() {
		return this.arrangement;
	}
	public void setArrangement(String arrangement) {
		this.arrangement = arrangement;
	}

	public Date getContactTime() {
		return this.contactTime;
	}
	public void setContactTime(Date contactTime) {
		this.contactTime = contactTime;
	}

	public String getFailDetail() {
		return this.failDetail;
	}
	public void setFailDetail(String failDetail) {
		this.failDetail = failDetail;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getFollowUpPlan() {
		return this.followUpPlan;
	}
	public void setFollowUpPlan(String followUpPlan) {
		this.followUpPlan = followUpPlan;
	}

	public String getRejectDetail() {
		return this.rejectDetail;
	}
	public void setRejectDetail(String rejectDetail) {
		this.rejectDetail = rejectDetail;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
