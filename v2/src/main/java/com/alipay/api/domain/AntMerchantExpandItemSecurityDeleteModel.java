package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除
 *
 * @author auto create
 * @since 1.0, 2024-10-10 09:49:41
 */
public class AntMerchantExpandItemSecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4491527875556476722L;

	/**
	 * 商品ID
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
