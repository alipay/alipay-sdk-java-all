package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商品信息
 *
 * @author auto create
 * @since 1.0, 2016-05-01 18:58:31
 */
public class ItemInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3752762989525171947L;

	/**
	 * 单品图片
	 */
	@ApiField("item_head_img")
	private String itemHeadImg;

	/**
	 * 单品限制集
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 单品图片集
	 */
	@ApiListField("item_imgs")
	@ApiField("string")
	private List<String> itemImgs;

	/**
	 * 单品跳转链接
	 */
	@ApiField("item_link")
	private String itemLink;

	/**
	 * 单品说明
	 */
	@ApiField("item_text")
	private String itemText;

	/**
	 * 最高优惠商品件数
	 */
	@ApiField("max_discount_num")
	private String maxDiscountNum;

	/**
	 * 最低购买商品件数
	 */
	@ApiField("min_consume_num")
	private String minConsumeNum;

	/**
	 * 单品价格
	 */
	@ApiField("original_price")
	private String originalPrice;

	public String getItemHeadImg() {
		return this.itemHeadImg;
	}
	public void setItemHeadImg(String itemHeadImg) {
		this.itemHeadImg = itemHeadImg;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public List<String> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public String getItemLink() {
		return this.itemLink;
	}
	public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
	}

	public String getItemText() {
		return this.itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	public String getMaxDiscountNum() {
		return this.maxDiscountNum;
	}
	public void setMaxDiscountNum(String maxDiscountNum) {
		this.maxDiscountNum = maxDiscountNum;
	}

	public String getMinConsumeNum() {
		return this.minConsumeNum;
	}
	public void setMinConsumeNum(String minConsumeNum) {
		this.minConsumeNum = minConsumeNum;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

}
