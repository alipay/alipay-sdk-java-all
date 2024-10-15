package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询商品接口
 *
 * @author auto create
 * @since 1.0, 2024-10-10 14:22:07
 */
public class AntMerchantExpandItemOpenBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1279184329681344413L;

	/**
	 * 商品ID列表
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

}
