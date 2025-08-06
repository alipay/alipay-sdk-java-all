package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定账户到共同账户
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:18:42
 */
public class AlipayFundJointaccountMemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 2375818995376433727L;

	/**
	 * 产品码下的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 关系绑定操作超时时间，单位s
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 被邀请账号唯一标识，商户侧背绑定账号id
	 */
	@ApiField("invitee_id")
	private String inviteeId;

	/**
	 * 被邀请账号类型
	 */
	@ApiField("invitee_type")
	private String inviteeType;

	/**
	 * 邀请账号唯一标识，商户侧发起绑定账号id，代表商户侧该用户唯一标识
	 */
	@ApiField("inviter_id")
	private String inviterId;

	/**
	 * 邀请账号类型
	 */
	@ApiField("inviter_type")
	private String inviterType;

	/**
	 * 关系绑定唯一单号，需要保证唯一，不同用户绑定不会出现相同单号，同用户多次绑定不会出现相同单号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务场景标识JOINT_ACCOUNT
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getInviteeId() {
		return this.inviteeId;
	}
	public void setInviteeId(String inviteeId) {
		this.inviteeId = inviteeId;
	}

	public String getInviteeType() {
		return this.inviteeType;
	}
	public void setInviteeType(String inviteeType) {
		this.inviteeType = inviteeType;
	}

	public String getInviterId() {
		return this.inviterId;
	}
	public void setInviterId(String inviterId) {
		this.inviterId = inviterId;
	}

	public String getInviterType() {
		return this.inviterType;
	}
	public void setInviterType(String inviterType) {
		this.inviterType = inviterType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
