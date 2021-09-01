package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容商品批量查询
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:40:33
 */
public class AlipayOpenAppAppcontentItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8336341132186277754L;

	/**
	 * 商品ID列表；最多20个ID
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

}
