package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目预测信息收集接口
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:39:22
 */
public class AlipayOpenAppItemCategoryConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6824888333419418787L;

	/**
	 * 商品的图片ID；获取方式：商品主图&子图&详情图
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * [{"value": "1","name": "售卖类（实物）"},{"value": "2","name": "租赁类（实物）"},{"value": "3","name": "付费充值/兑换类（虚拟）"}]
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * 需要录入的商品的标题
	 */
	@ApiField("title")
	private String title;

	public String getImgId() {
		return this.imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
