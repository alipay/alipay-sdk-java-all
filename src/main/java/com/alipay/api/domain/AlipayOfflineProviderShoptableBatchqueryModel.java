package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分页查询店铺桌位数据
 *
 * @author auto create
 * @since 1.0, 2018-09-17 14:51:43
 */
public class AlipayOfflineProviderShoptableBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2887338545435768273L;

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
	@ApiListField("platform")
	@ApiField("string")
	private List<String> platform;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部的桌号ID  table_id ，查询店铺桌位数据
	 */
	@ApiListField("table_id")
	@ApiField("string")
	private List<String> tableId;

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

	public List<String> getPlatform() {
		return this.platform;
	}
	public void setPlatform(List<String> platform) {
		this.platform = platform;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getTableId() {
		return this.tableId;
	}
	public void setTableId(List<String> tableId) {
		this.tableId = tableId;
	}

}
