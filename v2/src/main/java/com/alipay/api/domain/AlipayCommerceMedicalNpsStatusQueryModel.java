package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nps卡片状态查询
 *
 * @author auto create
 * @since 1.0, 2025-08-11 13:27:30
 */
public class AlipayCommerceMedicalNpsStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6195562543634517754L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 场景信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
