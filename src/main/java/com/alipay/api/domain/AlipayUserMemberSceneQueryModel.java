package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户在指定场景下的认证状态信息
 *
 * @author auto create
 * @since 1.0, 2019-04-15 17:34:57
 */
public class AlipayUserMemberSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7392123738594875972L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 场景名称。
支持的场景：
COLLEGE_LIFE（大学生活）
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
