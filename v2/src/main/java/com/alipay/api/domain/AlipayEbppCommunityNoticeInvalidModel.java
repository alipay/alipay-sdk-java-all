package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知公告删除
 *
 * @author auto create
 * @since 1.0, 2023-04-23 14:30:35
 */
public class AlipayEbppCommunityNoticeInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 5864939948738949981L;

	/**
	 * 支付宝通知公告id
	 */
	@ApiField("alipay_notice_id")
	private String alipayNoticeId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

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

	public String getAlipayNoticeId() {
		return this.alipayNoticeId;
	}
	public void setAlipayNoticeId(String alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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

}
