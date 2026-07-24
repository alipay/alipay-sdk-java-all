package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身结果查询
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:42:55
 */
public class AlipayCommerceMedicalServiceuserFacecertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8289397612278238923L;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 外部用户类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 有效期（秒）
	 */
	@ApiField("valid_seconds")
	private String validSeconds;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getValidSeconds() {
		return this.validSeconds;
	}
	public void setValidSeconds(String validSeconds) {
		this.validSeconds = validSeconds;
	}

}
