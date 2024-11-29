package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意删除失败详情
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:36:40
 */
public class CreativeDeleteFailDetail extends AlipayObject {

	private static final long serialVersionUID = 7371542238719385546L;

	/**
	 * 外部平台导入广告库，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	/**
	 * 详细的失败信息
	 */
	@ApiField("fail_reason")
	private String failReason;

	public String getCreativeOuterId() {
		return this.creativeOuterId;
	}
	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
