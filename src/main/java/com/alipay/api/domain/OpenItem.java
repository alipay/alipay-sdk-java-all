package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收单品
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class OpenItem extends AlipayObject {

	private static final long serialVersionUID = 6748829716979662524L;

	/**
	 * 单品编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 单品检测状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
