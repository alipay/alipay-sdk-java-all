package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意下线
 *
 * @author auto create
 * @since 1.0, 2023-11-08 14:12:54
 */
public class AlipayCommerceTransportAdCreativeOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 3877551211414797917L;

	/**
	 * 广告主id  + 下线创意时，需要校验该创意是否属于该用户
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 创意id + 根据创意id操作对应的创意下线
	 */
	@ApiField("creative_id")
	private Long creativeId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

}
