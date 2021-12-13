package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品热度查询
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:32
 */
public class AlipayOfflineProviderDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2163841798162575547L;

	/**
	 * 数据是根据alipay.offline.provider.shopaction.record的插入菜品接口获取，对应字段是：dishTypeName。
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * order_by：1，菜品热度升序查询，order_by：2，菜品热度降序查询。不设置时默认为2(菜品热度降序查询)
	 */
	@ApiField("order_by")
	private String orderBy;

	/**
	 * ISV自己的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口中插入菜品与alipay.offline.provider.useraction.record上传用户点菜菜单作为元数据，通过分析得到的数据。当前的ID就是插入菜品中的outerDishId，同时也是上传用户点菜中的action_type是order_dishes里面的dish对象的goodsId
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 需要查询的第几页信息。非必填。默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页查询每页的条数，默认为20条，每次最大拉去条数100,超过限制直接返回错误
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDishTypeName() {
		return this.dishTypeName;
	}
	public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

	public String getOrderBy() {
		return this.orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
