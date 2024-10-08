package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员新人权限咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-21 18:09:30
 */
public class AlipayUserAccountNewbieBenefitConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7162727817676283359L;

	/**
	 * 扩展信息，json格式字符串。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 手机号码。和user_id二选一必填。
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 模式，用于决策当前请求包含哪些人君。
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 商户支付宝ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID。和mobile二选一必填。
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
