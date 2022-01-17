package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠业务用户与商户的关系
 *
 * @author auto create
 * @since 1.0, 2020-02-10 17:58:49
 */
public class PayForPrivilegeUserRelation extends AlipayObject {

	private static final long serialVersionUID = 5264429678359855281L;

	/**
	 * 关系建立时间
	 */
	@ApiField("join_time")
	private Date joinTime;

	/**
	 * 关系解除时间，如果当前关系已解除该字段一定存在
	 */
	@ApiField("leave_time")
	private Date leaveTime;

	/**
	 * 充享惠业务用户与商户关系ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 会员所属商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 当前关系状态，VALID(有效), DELETED(删除)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getJoinTime() {
		return this.joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Date getLeaveTime() {
		return this.leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
