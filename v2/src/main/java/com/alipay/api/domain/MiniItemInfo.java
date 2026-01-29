package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销记录对应凭证关联的商品信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5416785541777944357L;

	/**
	 * 商品头图
	 */
	@ApiField("head_img_url")
	private String headImgUrl;

	/**
	 * 平台侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品类型描述
	 */
	@ApiField("item_type_desc")
	private String itemTypeDesc;

	/**
	 * 商家侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getHeadImgUrl() {
		return this.headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemTypeDesc() {
		return this.itemTypeDesc;
	}
	public void setItemTypeDesc(String itemTypeDesc) {
		this.itemTypeDesc = itemTypeDesc;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
