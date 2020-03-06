package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务结果确认接口
 *
 * @author auto create
 * @since 1.0, 2019-07-07 14:38:07
 */
public class AlipaySecurityRiskVerifyidentityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3699376681437216868L;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 附加业务信息，Json结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
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

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
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
