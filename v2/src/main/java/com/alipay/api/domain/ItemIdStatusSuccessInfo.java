package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过商品平台id更改上下架状态, 执行成功信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:45
 */
public class ItemIdStatusSuccessInfo extends AlipayObject {

	private static final long serialVersionUID = 7323125427899116768L;

	/**
	 * 平台方商品id
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
