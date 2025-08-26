package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分享头像信息
 *
 * @author auto create
 * @since 1.0, 2023-03-02 11:13:59
 */
public class OpenApiUserDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2291866276982357164L;

	/**
	 * 给被邀请人派奖是:Y 否:N
	 */
	@ApiField("award_invitee")
	private String awardInvitee;

	/**
	 * 给邀请人派奖 是:Y 否:N
	 */
	@ApiField("award_inviter")
	private String awardInviter;

	/**
	 * 用户头像
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 被邀请人序列
	 */
	@ApiField("index")
	private String index;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户id
	 */
	@ApiField("uid")
	private String uid;

	public String getAwardInvitee() {
		return this.awardInvitee;
	}
	public void setAwardInvitee(String awardInvitee) {
		this.awardInvitee = awardInvitee;
	}

	public String getAwardInviter() {
		return this.awardInviter;
	}
	public void setAwardInviter(String awardInviter) {
		this.awardInviter = awardInviter;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
