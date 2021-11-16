package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  创建绑定关系
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:19:52
 */
public class AlipayCommerceOperationPromoterRelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3838939398869254197L;

	/**
	 * 商户小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 需要绑定的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 海鼎门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店员id，点击提交的收银员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
