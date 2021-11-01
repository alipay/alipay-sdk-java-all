package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品查询
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:20:27
 */
public class KoubeiCateringDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5578134253286732297L;

	/**
	 * 分类字典大类的id
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 小类,商家自定义配置表例如 肉，酒水，素菜
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 菜系,商家自定义
	 */
	@ApiField("dish_cuisine")
	private String dishCuisine;

	/**
	 * 口碑的菜品id,新增的时候可以为空
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("dish_status")
	private String dishStatus;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku的id 口碑生成
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getCatetoryBigId() {
		return this.catetoryBigId;
	}
	public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

	public String getCatetorySmallId() {
		return this.catetorySmallId;
	}
	public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

	public String getDishCuisine() {
		return this.dishCuisine;
	}
	public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishStatus() {
		return this.dishStatus;
	}
	public void setDishStatus(String dishStatus) {
		this.dishStatus = dishStatus;
	}

	public String getEnRememberCode() {
		return this.enRememberCode;
	}
	public void setEnRememberCode(String enRememberCode) {
		this.enRememberCode = enRememberCode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getNbRememberCode() {
		return this.nbRememberCode;
	}
	public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
