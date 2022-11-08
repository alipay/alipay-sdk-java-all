package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序核验服务结果确认接口
 *
 * @author auto create
 * @since 1.0, 2022-09-19 14:24:26
 */
public class AlipaySecurityRiskVerifyidentityMiniappConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6483365678359988344L;

	/**
	 * 业务的业务流水号，例如订单id
	 */
	@ApiField("challenge")
	private String challenge;

	/**
	 * 蚂蚁统一会员ID，验证时会与做身份认证时候会话中的userId做比对，如不相符核验结果不通过
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核身校验id，是一次核身校验服务中唯一性的id
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getChallenge() {
		return this.challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
