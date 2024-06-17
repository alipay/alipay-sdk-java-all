package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约时邀请的成员信息（快照）
 *
 * @author auto create
 * @since 1.0, 2022-11-14 11:25:37
 */
public class InviteResultDTO extends AlipayObject {

	private static final long serialVersionUID = 7217842589988682976L;

	/**
	 * （被邀请人）用户唯一标识<br>
补充说明：<br>
- 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （被邀请人）账号类型，参考值如下：<br>
- OUT_USER_ID：商户侧用户唯一标识<br>
补充说明：
- 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 审批单号，不同被邀请人之间的审批单号不同（支付宝侧生成）
	 */
	@ApiField("process_id")
	private String processId;

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

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

}
