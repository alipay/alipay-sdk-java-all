package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * linkedmall中删除商品后，推送的变更商品对象
 *
 * @author auto create
 * @since 1.0, 2023-01-12 11:19:22
 */
public class LmDeleteItemList extends AlipayObject {

	private static final long serialVersionUID = 1122257757888332917L;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Long gmtModified;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * Lm商品id
	 */
	@ApiField("lm_item_id")
	private String lmItemId;

	/**
	 * 商品的sku列表
	 */
	@ApiListField("sku_id_list")
	@ApiField("number")
	private List<Long> skuIdList;

	public Long getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLmItemId() {
		return this.lmItemId;
	}
	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
	}

	public List<Long> getSkuIdList() {
		return this.skuIdList;
	}
	public void setSkuIdList(List<Long> skuIdList) {
		this.skuIdList = skuIdList;
	}

}
