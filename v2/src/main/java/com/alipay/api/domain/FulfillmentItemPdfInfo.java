package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV履约单状态同步商品id与pdf关系字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class FulfillmentItemPdfInfo extends AlipayObject {

	private static final long serialVersionUID = 4699357877558832412L;

	/**
	 * 商品ID集合
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * pdf文件链接
	 */
	@ApiField("link")
	private String link;

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
