package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据分类查询商品列表查询
 *
 * @author auto create
 * @since 1.0, 2025-04-11 15:38:40
 */
public class AlipayOfflineSmddCategoryItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1131657646863613554L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 商品类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
