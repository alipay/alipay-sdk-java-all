package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁行业商品库批量查询
 *
 * @author auto create
 * @since 1.0, 2025-11-20 19:12:42
 */
public class AlipayOpenAppRentindustryItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4331941216534572258L;

	/**
	 * null
	 */
	@ApiListField("out_item_ids")
	@ApiField("string")
	private List<String> outItemIds;

	public List<String> getOutItemIds() {
		return this.outItemIds;
	}
	public void setOutItemIds(List<String> outItemIds) {
		this.outItemIds = outItemIds;
	}

}
