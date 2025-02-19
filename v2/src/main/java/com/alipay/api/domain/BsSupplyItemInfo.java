package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-供给-权益商品信息
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsSupplyItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3463445594131954469L;

	/**
	 * 权益商品方面图
	 */
	@ApiField("item_cover_pic")
	private String itemCoverPic;

	/**
	 * 权益商品描述
	 */
	@ApiField("item_description")
	private String itemDescription;

	/**
	 * 权益商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	public String getItemCoverPic() {
		return this.itemCoverPic;
	}
	public void setItemCoverPic(String itemCoverPic) {
		this.itemCoverPic = itemCoverPic;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
