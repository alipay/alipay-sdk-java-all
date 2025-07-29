package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商品类目信息
 *
 * @author auto create
 * @since 1.0, 2025-07-24 16:36:13
 */
public class AlipayOpenAppItemTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1529916365622158674L;

	/**
	 * 商品业务模式，租赁业务模式包含（短租：0；长租：1）
	 */
	@ApiField("business_model")
	private String businessModel;

	/**
	 * 平台类目，填写的类目必须在类目表列出，只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类型，默认为实物商品
	 */
	@ApiField("item_type")
	private String itemType;

	public String getBusinessModel() {
		return this.businessModel;
	}
	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
