package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我淘支付宝大卡片（老CARD）信息查询
 *
 * @author auto create
 * @since 1.0, 2020-06-17 15:02:06
 */
public class AlipayUserMemberAlipaybigcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8841982922741944711L;

	/**
	 * 缓存是否可用，手淘在请求前先查uid的缓存，新用户请求未落缓存或者上次缓存已经被清空时为false
	 */
	@ApiField("available_cache")
	private Boolean availableCache;

	/**
	 * 手淘CARD的渠道类型，新的渠道用TAOBAO_CARD，老的渠道不会传
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 手淘请求之前带上的当前时间戳
	 */
	@ApiField("request_time_mills")
	private String requestTimeMills;

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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getRequestTimeMills() {
		return this.requestTimeMills;
	}
	public void setRequestTimeMills(String requestTimeMills) {
		this.requestTimeMills = requestTimeMills;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
