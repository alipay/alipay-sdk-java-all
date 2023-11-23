package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益的使用范围
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:05:09
 */
public class BenefitUsageScopeDTO extends AlipayObject {

	private static final long serialVersionUID = 4191199221425353887L;

	/**
	 * 使用范围描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * ALL ： 全场通用;CATEGORY ： 指定品类可用;ITEM ： 指定单品可用
	 */
	@ApiField("usage_scope_type")
	private String usageScopeType;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsageScopeType() {
		return this.usageScopeType;
	}
	public void setUsageScopeType(String usageScopeType) {
		this.usageScopeType = usageScopeType;
	}

}
