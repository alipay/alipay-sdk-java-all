package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku可售状态
 *
 * @author auto create
 * @since 1.0, 2025-08-01 09:52:03
 */
public class SkuStateDetail extends AlipayObject {

	private static final long serialVersionUID = 8533941949768872982L;

	/**
	 * 库存（如果不可售传入值0。单位：件）
	 */
	@ApiField("account")
	private Long account;

	/**
	 * 加料列表
	 */
	@ApiListField("attach_list")
	@ApiField("attach_good")
	private List<AttachGood> attachList;

	/**
	 * 可以多选
	 */
	@ApiField("attach_multiple")
	private Boolean attachMultiple;

	/**
	 * 规格标签
	 */
	@ApiListField("attributes")
	@ApiField("a_i_chat_attribute")
	private List<AIChatAttribute> attributes;

	/**
	 * itemid
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 果茶
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 16元
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 推荐
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 口味做法
	 */
	@ApiListField("taste_methods")
	@ApiField("taste_method")
	private List<TasteMethod> tasteMethods;

	public Long getAccount() {
		return this.account;
	}
	public void setAccount(Long account) {
		this.account = account;
	}

	public List<AttachGood> getAttachList() {
		return this.attachList;
	}
	public void setAttachList(List<AttachGood> attachList) {
		this.attachList = attachList;
	}

	public Boolean getAttachMultiple() {
		return this.attachMultiple;
	}
	public void setAttachMultiple(Boolean attachMultiple) {
		this.attachMultiple = attachMultiple;
	}

	public List<AIChatAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<AIChatAttribute> attributes) {
		this.attributes = attributes;
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

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public List<TasteMethod> getTasteMethods() {
		return this.tasteMethods;
	}
	public void setTasteMethods(List<TasteMethod> tasteMethods) {
		this.tasteMethods = tasteMethods;
	}

}
