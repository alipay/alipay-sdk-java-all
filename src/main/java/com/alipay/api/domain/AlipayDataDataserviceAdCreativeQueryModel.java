package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询创意详情
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:27:37
 */
public class AlipayDataDataserviceAdCreativeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2175368324467834244L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 外部平台导入广告库后，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getCreativeOuterId() {
		return this.creativeOuterId;
	}
	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
	}

}
