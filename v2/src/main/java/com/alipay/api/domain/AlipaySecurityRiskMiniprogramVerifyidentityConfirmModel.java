package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云身份核验服务结果确认接口
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:53:52
 */
public class AlipaySecurityRiskMiniprogramVerifyidentityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2659214713113476391L;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 身份核验场景CODE，为接入场景的英文名称，比如登陆login, 风险校验riskVerify, 支付payment等，需保证同一商户下多种接入场景code的唯一性
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 核身校验token，是一次核身校验服务中唯一性的token
	 */
	@ApiField("verify_token")
	private String verifyToken;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}
	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

}
