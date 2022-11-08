package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道规则
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:39:11
 */
public class ChannelRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5886687455251771494L;

	/**
	 * 营销类型列表+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("marketing_types")
	private String marketingTypes;

	public String getMarketingTypes() {
		return this.marketingTypes;
	}
	public void setMarketingTypes(String marketingTypes) {
		this.marketingTypes = marketingTypes;
	}

}
