package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询手淘"我的"内嵌卡片的支付宝卡片信息
 *
 * @author auto create
 * @since 1.0, 2019-09-23 15:42:43
 */
public class AlipayUserMemberAlipaycardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2733833574695694381L;

	/**
	 * 缓存是否可用，手淘在请求前先查uid的缓存，新用户请求未落缓存或者上次缓存已经被清空时为false
	 */
	@ApiField("available_cache")
	private Boolean availableCache;

	/**
	 * 蚂蚁统一会员ID，根据uid判别展示权益内容。由手淘直接传给支付宝
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getAvailableCache() {
		return this.availableCache;
	}
	public void setAvailableCache(Boolean availableCache) {
		this.availableCache = availableCache;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
