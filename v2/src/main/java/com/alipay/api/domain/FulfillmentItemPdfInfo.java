package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV履约单状态同步商品id与pdf关系字段
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:44:42
 */
public class FulfillmentItemPdfInfo extends AlipayObject {

	private static final long serialVersionUID = 7174759612315256697L;

	/**
	 * 文件id，文件流OSS上传接口返回的fileId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 商品ID集合
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 商品信息
	 */
	@ApiListField("item_infos")
	@ApiField("item_info_for_fulfillment_list")
	private List<ItemInfoForFulfillmentList> itemInfos;

	/**
	 * pdf文件链接
	 */
	@ApiField("link")
	private String link;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public List<ItemInfoForFulfillmentList> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<ItemInfoForFulfillmentList> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
