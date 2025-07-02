package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心招工平台消息发送
 *
 * @author auto create
 * @since 1.0, 2025-02-12 17:42:24
 */
public class AlipayEbppIndustryRecruitMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 3383372263944916752L;

	/**
	 * 场景，上班打卡提醒=CLOCK_IN_REMINDER
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * null
	 */
	@ApiListField("out_apply_id_list")
	@ApiField("string")
	private List<String> outApplyIdList;

	/**
	 * 外部岗位id
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * B端的岗位详情URL
	 */
	@ApiField("server_job_url")
	private String serverJobUrl;

	/**
	 * 上班开始剩余时间，枚举：15min、1H
	 */
	@ApiField("surplus_time")
	private String surplusTime;

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public List<String> getOutApplyIdList() {
		return this.outApplyIdList;
	}
	public void setOutApplyIdList(List<String> outApplyIdList) {
		this.outApplyIdList = outApplyIdList;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

	public String getServerJobUrl() {
		return this.serverJobUrl;
	}
	public void setServerJobUrl(String serverJobUrl) {
		this.serverJobUrl = serverJobUrl;
	}

	public String getSurplusTime() {
		return this.surplusTime;
	}
	public void setSurplusTime(String surplusTime) {
		this.surplusTime = surplusTime;
	}

}
