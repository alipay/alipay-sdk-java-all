package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蓝卡用户岗位申请状态同步
 *
 * @author auto create
 * @since 1.0, 2022-01-26 17:32:25
 */
public class AlipayUserJobcardApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3833918872922153729L;

	/**
	 * 待同步状态的申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 状态发生变更时的业务时间，如apply_status=APPLYING时，biz_time即申请时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 岗位申请来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 岗位ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 外部申请ID，唯一标识一次外部申请
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
