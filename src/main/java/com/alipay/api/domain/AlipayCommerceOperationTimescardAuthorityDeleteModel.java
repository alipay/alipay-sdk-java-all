package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权删除
 *
 * @author auto create
 * @since 1.0, 2022-04-21 16:35:17
 */
public class AlipayCommerceOperationTimescardAuthorityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8454236828314777635L;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 店员支付宝账户
	 */
	@ApiField("user_id")
	private String userId;

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
