package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JAPaymentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 14:52:28
 */
public class AlipayFundJointaccountRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5848964712573663955L;

	/** 
	 * 小荷包账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 支付宝侧唯一标识
	 */
	@ApiField("invitee_id")
	private String inviteeId;

	/** 
	 * 支付宝侧唯一标识
	 */
	@ApiField("invitee_open_id")
	private String inviteeOpenId;

	/** 
	 * 联通侧账号唯一标识
	 */
	@ApiField("invitee_out_id")
	private String inviteeOutId;

	/** 
	 * 支付宝侧用户唯一标识
	 */
	@ApiField("inviter_id")
	private String inviterId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("inviter_open_id")
	private String inviterOpenId;

	/** 
	 * 联通侧用户唯一标识
	 */
	@ApiField("inviter_out_id")
	private String inviterOutId;

	/** 
	 * 支付信息
	 */
	@ApiField("payment_info")
	private JAPaymentInfo paymentInfo;

	/** 
	 * 关系绑定id
	 */
	@ApiField("relation_id")
	private String relationId;

	/** 
	 * 绑定状态
	 */
	@ApiField("relation_status")
	private String relationStatus;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setInviteeId(String inviteeId) {
		this.inviteeId = inviteeId;
	}
	public String getInviteeId( ) {
		return this.inviteeId;
	}

	public void setInviteeOpenId(String inviteeOpenId) {
		this.inviteeOpenId = inviteeOpenId;
	}
	public String getInviteeOpenId( ) {
		return this.inviteeOpenId;
	}

	public void setInviteeOutId(String inviteeOutId) {
		this.inviteeOutId = inviteeOutId;
	}
	public String getInviteeOutId( ) {
		return this.inviteeOutId;
	}

	public void setInviterId(String inviterId) {
		this.inviterId = inviterId;
	}
	public String getInviterId( ) {
		return this.inviterId;
	}

	public void setInviterOpenId(String inviterOpenId) {
		this.inviterOpenId = inviterOpenId;
	}
	public String getInviterOpenId( ) {
		return this.inviterOpenId;
	}

	public void setInviterOutId(String inviterOutId) {
		this.inviterOutId = inviterOutId;
	}
	public String getInviterOutId( ) {
		return this.inviterOutId;
	}

	public void setPaymentInfo(JAPaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public JAPaymentInfo getPaymentInfo( ) {
		return this.paymentInfo;
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}
	public String getRelationId( ) {
		return this.relationId;
	}

	public void setRelationStatus(String relationStatus) {
		this.relationStatus = relationStatus;
	}
	public String getRelationStatus( ) {
		return this.relationStatus;
	}

}
