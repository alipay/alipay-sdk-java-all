package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福医生端外部用户数据同步
 *
 * @author auto create
 * @since 1.0, 2026-06-05 15:42:56
 */
public class AlipayCommerceMedicalServiceuserOutuserSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5258146351971936867L;

	/**
	 * 动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务唯一id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 外部用户唯一id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 外部用户类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
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

}
