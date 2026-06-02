package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 顾问数据
 *
 * @author auto create
 * @since 1.0, 2026-05-26 16:18:18
 */
public class AdvisorParam extends AlipayObject {

	private static final long serialVersionUID = 1696333254325882682L;

	/**
	 * 履约单列表
	 */
	@ApiListField("fulfillment_list")
	@ApiField("string")
	private List<String> fulfillmentList;

	public List<String> getFulfillmentList() {
		return this.fulfillmentList;
	}
	public void setFulfillmentList(List<String> fulfillmentList) {
		this.fulfillmentList = fulfillmentList;
	}

}
