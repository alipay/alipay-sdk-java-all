package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上下架操作执行失败信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:45
 */
public class ItemIdStatusFailInfo extends AlipayObject {

	private static final long serialVersionUID = 1777896336547143418L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品平台id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
