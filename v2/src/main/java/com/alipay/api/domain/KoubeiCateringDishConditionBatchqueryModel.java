package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据商户id分页查询菜品信息
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:41:01
 */
public class KoubeiCateringDishConditionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5525544574365229445L;

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
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜名
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 查询页码，表示第几页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不超过50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
