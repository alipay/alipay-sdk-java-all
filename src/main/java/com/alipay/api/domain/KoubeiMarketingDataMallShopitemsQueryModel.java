package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈门店以及门店下面优惠券商品信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 10:43:59
 */
public class KoubeiMarketingDataMallShopitemsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2235846685353551127L;

	/**
	 * 查询内容范围
	 */
	@ApiField("collect_type")
	private String collectType;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 最多优惠券个数
	 */
	@ApiField("max_coupons_num")
	private String maxCouponsNum;

	/**
	 * 最多商品个数
	 */
	@ApiField("max_items_num")
	private String maxItemsNum;

	/**
	 * 分页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页个数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 设备号
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 设备版本号
	 */
	@ApiField("product_version")
	private String productVersion;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCollectType() {
		return this.collectType;
	}
	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMaxCouponsNum() {
		return this.maxCouponsNum;
	}
	public void setMaxCouponsNum(String maxCouponsNum) {
		this.maxCouponsNum = maxCouponsNum;
	}

	public String getMaxItemsNum() {
		return this.maxItemsNum;
	}
	public void setMaxItemsNum(String maxItemsNum) {
		this.maxItemsNum = maxItemsNum;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
