package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户积分
 *
 * @author auto create
 * @since 1.0, 2023-07-14 09:29:07
 */
public class AlipayCommerceOperationUserPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1619745871454436377L;

	/**
	 * 蚂蚁统一open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景代码，由行业运营平台分配，提供枚举值。
user_id + scene_code 确定返回内容。
bigTrip-出行
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源渠道，行业运营平台分配，例如：linkedmall
	 */
	@ApiField("source")
	private String source;

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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
