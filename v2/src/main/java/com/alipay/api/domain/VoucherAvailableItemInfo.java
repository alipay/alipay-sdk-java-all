package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用商品信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:46:12
 */
public class VoucherAvailableItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6264845546424182331L;

	/**
	 * 内部商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部商品信息
	 */
	@ApiListField("out_item_info")
	@ApiField("voucher_available_out_item_info")
	private List<VoucherAvailableOutItemInfo> outItemInfo;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<VoucherAvailableOutItemInfo> getOutItemInfo() {
		return this.outItemInfo;
	}
	public void setOutItemInfo(List<VoucherAvailableOutItemInfo> outItemInfo) {
		this.outItemInfo = outItemInfo;
	}

}
