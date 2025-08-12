package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改小程序收藏的状态
 *
 * @author auto create
 * @since 1.0, 2025-07-30 14:21:15
 */
public class AlipayOpenMiniMiniappFavoriteAddModel extends AlipayObject {

	private static final long serialVersionUID = 6438424596195466424L;

	/**
	 * 需要指定收藏的app_id，若开放平台分配的app_id与具体的小程序不同时，才需要传参
	 */
	@ApiField("designated_app_id")
	private String designatedAppId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDesignatedAppId() {
		return this.designatedAppId;
	}
	public void setDesignatedAppId(String designatedAppId) {
		this.designatedAppId = designatedAppId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
