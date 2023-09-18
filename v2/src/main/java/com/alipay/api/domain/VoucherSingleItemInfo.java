package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品券信息
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:25:26
 */
public class VoucherSingleItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4665232367858813483L;

	/**
	 * 单品封面图
	 */
	@ApiField("item_cover_pic")
	private String itemCoverPic;

	/**
	 * 单品描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 单品详情图列表
	 */
	@ApiListField("item_detail_pic_list")
	@ApiField("string")
	private List<String> itemDetailPicList;

	/**
	 * 单品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单品id列表
	 */
	@ApiListField("item_sku_id_list")
	@ApiField("string")
	private List<String> itemSkuIdList;

	public String getItemCoverPic() {
		return this.itemCoverPic;
	}
	public void setItemCoverPic(String itemCoverPic) {
		this.itemCoverPic = itemCoverPic;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public List<String> getItemDetailPicList() {
		return this.itemDetailPicList;
	}
	public void setItemDetailPicList(List<String> itemDetailPicList) {
		this.itemDetailPicList = itemDetailPicList;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<String> getItemSkuIdList() {
		return this.itemSkuIdList;
	}
	public void setItemSkuIdList(List<String> itemSkuIdList) {
		this.itemSkuIdList = itemSkuIdList;
	}

}
