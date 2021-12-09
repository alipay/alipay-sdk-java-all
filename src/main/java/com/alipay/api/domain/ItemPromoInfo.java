package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品券商品优惠信息
 *
 * @author auto create
 * @since 1.0, 2021-02-18 15:15:35
 */
public class ItemPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 2141597712397196332L;

	/**
	 * 商品咨询列表
	 */
	@ApiListField("item_consult_list")
	@ApiField("item_consult_info")
	private List<ItemConsultInfo> itemConsultList;

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

	public List<ItemConsultInfo> getItemConsultList() {
		return this.itemConsultList;
	}
	public void setItemConsultList(List<ItemConsultInfo> itemConsultList) {
		this.itemConsultList = itemConsultList;
	}

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

}
