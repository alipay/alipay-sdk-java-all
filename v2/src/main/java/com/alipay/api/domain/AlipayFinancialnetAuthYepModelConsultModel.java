package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额+模式咨询
 *
 * @author auto create
 * @since 1.0, 2023-02-08 14:31:41
 */
public class AlipayFinancialnetAuthYepModelConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8684179745581354476L;

	/**
	 * 开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 淘特物流
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
