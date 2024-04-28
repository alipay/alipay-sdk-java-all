package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料详情查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-24 16:03:23
 */
public class AntMerchantExpandAssetBomQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4324427753152883877L;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
