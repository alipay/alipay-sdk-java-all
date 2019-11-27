package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户是否已收藏调用者的小程序
 *
 * @author auto create
 * @since 1.0, 2019-08-26 21:25:20
 */
public class AlipayOpenMiniMiniappFavoriteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1575854785368213123L;

	/**
	 * 接入的时候，申请的令牌
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 废弃参数
	 */
	@ApiField("designated_app_id")
	private String designatedAppId;

	/**
	 * 查询的小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesignatedAppId() {
		return this.designatedAppId;
	}
	public void setDesignatedAppId(String designatedAppId) {
		this.designatedAppId = designatedAppId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
