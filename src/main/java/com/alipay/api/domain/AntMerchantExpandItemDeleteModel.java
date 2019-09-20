package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除接口
 *
 * @author auto create
 * @since 1.0, 2019-09-16 19:45:51
 */
public class AntMerchantExpandItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8382967447235141746L;

	/**
	 * 商品id
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
