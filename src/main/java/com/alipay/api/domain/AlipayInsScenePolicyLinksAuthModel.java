package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取已授权的保单地址列表
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:24:32
 */
public class AlipayInsScenePolicyLinksAuthModel extends AlipayObject {

	private static final long serialVersionUID = 1519224234614872393L;

	/**
	 * 登录用户id
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * 订单ID
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * session过期时间
	 */
	@ApiField("out_session_expiration")
	private Date outSessionExpiration;

	/**
	 * session_id
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 指定保单号，选填
	 */
	@ApiListField("policy_nos")
	@ApiField("string")
	private List<String> policyNos;

	/**
	 * 客户端渠道 ios / android / pc / wx_applet(微信小程序)
	 */
	@ApiField("user_client")
	private String userClient;

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getOutSessionExpiration() {
		return this.outSessionExpiration;
	}
	public void setOutSessionExpiration(Date outSessionExpiration) {
		this.outSessionExpiration = outSessionExpiration;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public List<String> getPolicyNos() {
		return this.policyNos;
	}
	public void setPolicyNos(List<String> policyNos) {
		this.policyNos = policyNos;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
