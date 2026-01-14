package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝就业三方服务商岗位邀约发送接口
 *
 * @author auto create
 * @since 1.0, 2024-06-20 14:22:40
 */
public class AlipayEbppIndustryJobInvitationSendModel extends AlipayObject {

	private static final long serialVersionUID = 4836988655193632475L;

	/**
	 * 邀约描述
	 */
	@ApiField("invite_text")
	private String inviteText;

	/**
	 * 用户求职意向列表
	 */
	@ApiListField("job_intention_list")
	@ApiField("job_intention_detail")
	private List<JobIntentionDetail> jobIntentionList;

	/**
	 * 用户手机号对称加密字符串，加密方式请与相关技术或业务同学了解
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部邀约id是表示当前邀约请求的唯一业务单据号
	 */
	@ApiField("out_invitation_id")
	private String outInvitationId;

	/**
	 * 服务商的岗位id
	 */
	@ApiField("out_job_id")
	private String outJobId;

	public String getInviteText() {
		return this.inviteText;
	}
	public void setInviteText(String inviteText) {
		this.inviteText = inviteText;
	}

	public List<JobIntentionDetail> getJobIntentionList() {
		return this.jobIntentionList;
	}
	public void setJobIntentionList(List<JobIntentionDetail> jobIntentionList) {
		this.jobIntentionList = jobIntentionList;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutInvitationId() {
		return this.outInvitationId;
	}
	public void setOutInvitationId(String outInvitationId) {
		this.outInvitationId = outInvitationId;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

}
