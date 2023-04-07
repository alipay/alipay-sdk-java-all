package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选中的营销项目信息，主要包括id、类型等信息。
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:41:32
 */
public class MarketingItemSelection extends AlipayObject {

	private static final long serialVersionUID = 4459636931452675659L;

	/**
	 * 营销项目ID
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
