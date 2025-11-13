package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信渠道创建企业
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:46:55
 */
public class AlipayCommerceEcEnterpriseReliableCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8879362615137768294L;

	/**
	 * 企业基本信息
	 */
	@ApiField("base_info")
	private ReliableEnterpriseBaseInfoDTO baseInfo;

	/**
	 * 企业管理员身份唯一标识，搭配 identity_type 传参：<br/>
1. 当identity_type=ENTERPRISE_EMAIL时，identity传企业邮箱；
<br/>
2. identity_type=ALIPAY_USER_ID时，identity传支付宝会员uid（此时可与identity_open_id二选一）；
<br/>
3. 当identity_type=ALIPAY_LOGON_ID时，identity传已注册支付宝且可以登录支付宝的手机号或邮箱
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 企业管理员身份标识openId
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 企业管理员身份类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 服务商生成的请求唯一流水号/业务幂等号；<br/>
字段作用：<br/>
1. 作为邀请注册的幂等标识，使用相同的out_biz_no 会得到相同的注册链接（若链接未使用过期，会重新生成）<br/>
2. 使用相同的身份标识（identity）传入不同的out_biz_no 可生成不同的链接，适用于一个用户注册多个企业<br/>
3. 若调用失败或超时，可以使用相同的 out_biz_no 进行幂等重试<br/>
4. 并发使用相同 out_biz_no 调用，会报错：邀请链接生成中<br/>
5. 当企业注册/认证/签约成功后，企业码系统发送的「企业状态变更通知」中，会携带out_biz_no，服务商可用于关联企业ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业个性化信息，适用于特殊场景，请按需使用
	 */
	@ApiField("profiles")
	private ReliableEnterpriseProfilesDTO profiles;

	public ReliableEnterpriseBaseInfoDTO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(ReliableEnterpriseBaseInfoDTO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ReliableEnterpriseProfilesDTO getProfiles() {
		return this.profiles;
	}
	public void setProfiles(ReliableEnterpriseProfilesDTO profiles) {
		this.profiles = profiles;
	}

}
