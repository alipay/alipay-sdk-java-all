package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除
 *
 * @author auto create
 * @since 1.0, 2019-09-06 14:25:59
 */
public class AntMerchantExpandItemSecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6736722274728652657L;

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
