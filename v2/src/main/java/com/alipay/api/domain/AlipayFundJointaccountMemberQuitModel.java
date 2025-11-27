package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 将用户从共同账户移除
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:18:41
 */
public class AlipayFundJointaccountMemberQuitModel extends AlipayObject {

	private static final long serialVersionUID = 1364425868998932132L;

	/**
	 * 小荷包群id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 产品码下的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 被解绑用户唯一标识，即联通侧设备id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 被解绑用户唯一标识类型
	 */
	@ApiField("member_type")
	private String memberType;

	/**
	 * 业务场景标识JOINT_ACCOUNT
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 绑定流程id
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("request_open_id")
	private String requestOpenId;

	/**
	 * 操作人支付宝侧唯一标识
	 */
	@ApiField("request_user_id")
	private String requestUserId;

	/**
	 * 支付宝侧用户唯一标识类型
	 */
	@ApiField("request_user_type")
	private String requestUserType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getRequestOpenId() {
		return this.requestOpenId;
	}
	public void setRequestOpenId(String requestOpenId) {
		this.requestOpenId = requestOpenId;
	}

	public String getRequestUserId() {
		return this.requestUserId;
	}
	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getRequestUserType() {
		return this.requestUserType;
	}
	public void setRequestUserType(String requestUserType) {
		this.requestUserType = requestUserType;
	}

}
