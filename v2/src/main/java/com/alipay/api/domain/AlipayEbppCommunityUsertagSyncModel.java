package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区用户标签同步
 *
 * @author auto create
 * @since 1.0, 2023-04-23 14:30:44
 */
public class AlipayEbppCommunityUsertagSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2247539112488581482L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 认证状态-
NO_AUDIT：未审核
AUDITED：已审核
AUDIT_FAIL：未通过审核
AUDITING：审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 支付宝小区编码，由支付宝分配
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部小区id
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 用户身份标签-
OWNER：业主
FAMILY：家属
TENANT：租客
FRIEND：朋友
	 */
	@ApiField("user_tag")
	private String userTag;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getUserTag() {
		return this.userTag;
	}
	public void setUserTag(String userTag) {
		this.userTag = userTag;
	}

}
