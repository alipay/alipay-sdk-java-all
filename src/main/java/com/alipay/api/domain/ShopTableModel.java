package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑店铺桌位模型
 *
 * @author auto create
 * @since 1.0, 2017-06-12 10:37:38
 */
public class ShopTableModel extends AlipayObject {

	private static final long serialVersionUID = 3534936912474658325L;

	/**
	 * 最大容纳人数 ，  
 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的max。
	 */
	@ApiField("max")
	private Long max;

	/**
	 * 最小容纳人数，  当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的min。
	 */
	@ApiField("min")
	private Long min;

	/**
	 * 当前值来自于alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的outer_shop_do对象里面的 type字段。
平台类型 (二维火、Mike)
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 桌位状态 ， 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的status。
0 空闲  1 占用  2 不可知 -1 删除
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 外部桌号ID
当前值来自于
alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的tableId字段值。
	 */
	@ApiField("table_id")
	private String tableId;

	/**
	 * 餐桌名称， 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的tableName。
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 桌位编号 ， 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的tableNum。
	 */
	@ApiField("table_num")
	private String tableNum;

	/**
	 * 餐桌类型 0 普通 1 包厢
 ， 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入桌位 的action_detail对象里的tableType。
	 */
	@ApiField("table_type")
	private Long tableType;

	public Long getMax() {
		return this.max;
	}
	public void setMax(Long max) {
		this.max = max;
	}

	public Long getMin() {
		return this.min;
	}
	public void setMin(Long min) {
		this.min = min;
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

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTableId() {
		return this.tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

	public Long getTableType() {
		return this.tableType;
	}
	public void setTableType(Long tableType) {
		this.tableType = tableType;
	}

}
