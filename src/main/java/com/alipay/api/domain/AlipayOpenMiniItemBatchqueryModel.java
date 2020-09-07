package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品批量查询
 *
 * @author auto create
 * @since 1.0, 2020-08-17 20:21:22
 */
public class AlipayOpenMiniItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5746949647134486442L;

	/**
	 * 操作类型，固定为：ITEM_BATCHQUERY
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 平台侧商品id列表，最多20个
	 */
	@ApiListField("platform_item_id_list")
	@ApiField("string")
	private List<String> platformItemIdList;

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<String> getPlatformItemIdList() {
		return this.platformItemIdList;
	}
	public void setPlatformItemIdList(List<String> platformItemIdList) {
		this.platformItemIdList = platformItemIdList;
	}

}
