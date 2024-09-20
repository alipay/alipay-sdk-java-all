package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品所属门店信息
 *
 * @author auto create
 * @since 1.0, 2020-07-02 10:57:18
 */
public class ItemStoreDTO extends AlipayObject {

	private static final long serialVersionUID = 4688947341242915678L;

	/**
	 * 门店品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 门店类目信息 英文分隔符,隔开 ； 示例：美食,火锅,川菜/重庆火锅
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 门店地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店LOGO
	 */
	@ApiField("store_logo")
	private String storeLogo;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreLogo() {
		return this.storeLogo;
	}
	public void setStoreLogo(String storeLogo) {
		this.storeLogo = storeLogo;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
