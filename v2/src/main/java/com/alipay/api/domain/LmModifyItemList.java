package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * linkedmall中修改商品后，推送的变更商品对象
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:44:33
 */
public class LmModifyItemList extends AlipayObject {

	private static final long serialVersionUID = 8195221944445495166L;

	/**
	 * 是否可售卖
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 修改时间，毫秒级时间戳
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
	 * 商品sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("lm_modify_sku_list")
	private List<LmModifySkuList> skuList;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

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

	public List<LmModifySkuList> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<LmModifySkuList> skuList) {
		this.skuList = skuList;
	}

}
