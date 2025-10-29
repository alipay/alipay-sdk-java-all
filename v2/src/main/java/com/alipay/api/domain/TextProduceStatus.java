package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文字创意的创建进度
 *
 * @author auto create
 * @since 1.0, 2023-07-26 20:10:31
 */
public class TextProduceStatus extends AlipayObject {

	private static final long serialVersionUID = 4712879857958278332L;

	/**
	 * 物品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 是否已经产出 已经产出为true，否则为false
	 */
	@ApiField("status")
	private Boolean status;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
