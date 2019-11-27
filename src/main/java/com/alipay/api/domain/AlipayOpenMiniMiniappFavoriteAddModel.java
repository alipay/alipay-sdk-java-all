package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改小程序收藏的状态
 *
 * @author auto create
 * @since 1.0, 2019-08-26 21:18:35
 */
public class AlipayOpenMiniMiniappFavoriteAddModel extends AlipayObject {

	private static final long serialVersionUID = 8859172558957187325L;

	/**
	 * 申请收藏接口接入的时候，需要像接口提供方申请，无该信息的无法调通该接口
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 需要指定收藏的app_id，若开放平台分配的app_id与具体的小程序不同时，才需要传参
	 */
	@ApiField("designated_app_id")
	private String designatedAppId;

	/**
	 * 20181428390482304
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 蚂蚁统一会员ID(该字段废弃，使用mini_app_id)
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
