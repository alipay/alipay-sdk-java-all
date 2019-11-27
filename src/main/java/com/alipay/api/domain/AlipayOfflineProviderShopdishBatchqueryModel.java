package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询店铺菜品数据
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:40:56
 */
public class AlipayOfflineProviderShopdishBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5618383454198117535L;

	/**
	 * 店铺自己的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口上传菜品，当前的ID就是插入菜品中的outerDishId。
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 需要查询的第几页信息。非必填。默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页查询每页的条数，默认为20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑店铺平台 platform  平台类型分为  二维火/Mike
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOuterDishId() {
		return this.outerDishId;
	}
	public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
