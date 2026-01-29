package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品信息
 *
 * @author auto create
 * @since 1.0, 2025-10-13 19:45:50
 */
public class DrugDTO extends AlipayObject {

	private static final long serialVersionUID = 7224866266769211235L;

	/**
	 * 药品数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 药品id
	 */
	@ApiField("item_id")
	private String itemId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
