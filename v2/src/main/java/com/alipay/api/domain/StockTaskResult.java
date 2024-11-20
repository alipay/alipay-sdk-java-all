package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 库存任务查询结果
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class StockTaskResult extends AlipayObject {

	private static final long serialVersionUID = 4566272598949329945L;

	/**
	 * 售价方式：CPP（按人次保量）、CPT（按时长售卖）
	 */
	@ApiField("charge_type")
	private Long chargeType;

	/**
	 * 库存任务创建时间
	 */
	@ApiField("query_time")
	private String queryTime;

	/**
	 * 售卖方式，枚举值1:GD（保量）、2:RTB（竞价）
	 */
	@ApiField("sell_mode")
	private Long sellMode;

	/**
	 * 库存查询量
	 */
	@ApiListField("stock_quantity")
	@ApiField("stock_quantity")
	private List<StockQuantity> stockQuantity;

	/**
	 * 库存任务查询条件
	 */
	@ApiField("stock_query_condition")
	private StockQueryCondition stockQueryCondition;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private Long taskId;

	/**
	 * 单价：CPP模式下 分/千人次， CPT模式下 分/秒）
	 */
	@ApiField("unit_price")
	private Long unitPrice;

	public Long getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(Long chargeType) {
		this.chargeType = chargeType;
	}

	public String getQueryTime() {
		return this.queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public Long getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(Long sellMode) {
		this.sellMode = sellMode;
	}

	public List<StockQuantity> getStockQuantity() {
		return this.stockQuantity;
	}
	public void setStockQuantity(List<StockQuantity> stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public StockQueryCondition getStockQueryCondition() {
		return this.stockQueryCondition;
	}
	public void setStockQueryCondition(StockQueryCondition stockQueryCondition) {
		this.stockQueryCondition = stockQueryCondition;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

}
