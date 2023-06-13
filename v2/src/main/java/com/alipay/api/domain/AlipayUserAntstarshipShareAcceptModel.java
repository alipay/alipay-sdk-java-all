package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分享裂变接受邀请
 *
 * @author auto create
 * @since 1.0, 2023-03-03 15:56:31
 */
public class AlipayUserAntstarshipShareAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 4181713433512889582L;

	/**
	 * 活动id 唯一
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 邀请日期
	 */
	@ApiField("invite_date")
	private Date inviteDate;

	/**
	 * 邀请ID
	 */
	@ApiField("inviter_id")
	private String inviterId;

	/**
	 * 单品id
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getInviteDate() {
		return this.inviteDate;
	}
	public void setInviteDate(Date inviteDate) {
		this.inviteDate = inviteDate;
	}

	public String getInviterId() {
		return this.inviterId;
	}
	public void setInviterId(String inviterId) {
		this.inviterId = inviterId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
