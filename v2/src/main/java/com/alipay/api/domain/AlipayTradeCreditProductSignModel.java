package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约统一入口
 *
 * @author auto create
 * @since 1.0, 2022-12-30 14:20:14
 */
public class AlipayTradeCreditProductSignModel extends AlipayObject {

	private static final long serialVersionUID = 7261854681636474418L;

	/**
	 * 扩展值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 生效模型策略
	 */
	@ApiField("valid_strategy")
	private OpenApiValidStrategy validStrategy;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public OpenApiValidStrategy getValidStrategy() {
		return this.validStrategy;
	}
	public void setValidStrategy(OpenApiValidStrategy validStrategy) {
		this.validStrategy = validStrategy;
	}

}
