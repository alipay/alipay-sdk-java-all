package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专项价成员签约接口
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:52:41
 */
public class AlipayFundIdentitypayMemberSignModel extends AlipayObject {

	private static final long serialVersionUID = 4218354173612523368L;

	/**
	 * 物业审核
	 */
	@ApiField("authentication_type")
	private String authenticationType;

	/**
	 * 签约场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约方账号,当identity_type为ALIPAY_USER_ID时，是2088xx，当identity_type为ALIPAY_LOGON_ID时，是支付宝登录号，当identity_type为ALIPAY_OPEN_ID时，是支付宝openId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约方类型(ALIPAY_USER_ID或ALIPAY_LOGON_ID或ALIPAY_OPEN_ID)
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 成员昵称
	 */
	@ApiField("member_name")
	private String memberName;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部成员id(全局唯一)
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 外部组织id(全局唯一)
	 */
	@ApiField("out_org_id")
	private String outOrgId;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 成员真实姓名(当identity_type为ALIPAY_LOGON_ID时，real_name不能为空且传入真实姓名，进行一致性校验。当identity_type为ALIPAY_USER_ID秋娥real_name不为空时，请传入真实姓名，进行一致性校验)
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthenticationType() {
		return this.authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getOutOrgId() {
		return this.outOrgId;
	}
	public void setOutOrgId(String outOrgId) {
		this.outOrgId = outOrgId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
