package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过bizToken获取用户简历授权登录信息
 *
 * @author auto create
 * @since 1.0, 2025-08-27 20:17:36
 */
public class AlipayEbppIndustryJobResumeauthlogininfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 1482417549616874316L;

	/**
	 * 业务token
	 */
	@ApiField("biz_token")
	private String bizToken;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

}
