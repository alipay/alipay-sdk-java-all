package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我淘支付宝大卡片（老CARD）信息查询
 *
 * @author auto create
 * @since 1.0, 2019-10-18 13:55:22
 */
public class AlipayUserMemberAlipaybigcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3777935671666287494L;

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
