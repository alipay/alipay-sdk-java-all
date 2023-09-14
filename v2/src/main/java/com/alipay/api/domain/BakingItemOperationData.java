package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 烘焙商品操作数据模型
 *
 * @author auto create
 * @since 1.0, 2020-01-06 16:54:36
 */
public class BakingItemOperationData extends AlipayObject {

	private static final long serialVersionUID = 5471134225949942537L;

	/**
	 * 累计库存
	 */
	@ApiField("accumulate_inventory")
	private String accumulateInventory;

	/**
	 * 操作后库存
	 */
	@ApiField("ending_inventory")
	private String endingInventory;

	/**
	 * 操作后位置，传中文或id均可
	 */
	@ApiField("ending_position")
	private String endingPosition;

	/**
	 * 商品毛利率，百分比毛利率*100
	 */
	@ApiField("gross_profit_margin")
	private String grossProfitMargin;

	/**
	 * 操作前库存
	 */
	@ApiField("opening_inventory")
	private String openingInventory;

	/**
	 * 操作名称；如果是示例值中的操作请按示例值英文传递，其他操作自行传递有意义的英文
	 */
	@ApiField("operation_name")
	private String operationName;

	/**
	 * 操作数量
	 */
	@ApiField("operation_num")
	private String operationNum;

	/**
	 * 操作时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 操作人，传中文或id均可
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 商品批次
	 */
	@ApiField("sku_batch")
	private String skuBatch;

	/**
	 * 商品id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * 商品制作时长，单位为秒
	 */
	@ApiField("sku_production_time")
	private Long skuProductionTime;

	/**
	 * 商品售卖价格
	 */
	@ApiField("sku_selling_price")
	private String skuSellingPrice;

	/**
	 * 操作前位置，传中文或id均可
	 */
	@ApiField("starting_position")
	private String startingPosition;

	public String getAccumulateInventory() {
		return this.accumulateInventory;
	}
	public void setAccumulateInventory(String accumulateInventory) {
		this.accumulateInventory = accumulateInventory;
	}

	public String getEndingInventory() {
		return this.endingInventory;
	}
	public void setEndingInventory(String endingInventory) {
		this.endingInventory = endingInventory;
	}

	public String getEndingPosition() {
		return this.endingPosition;
	}
	public void setEndingPosition(String endingPosition) {
		this.endingPosition = endingPosition;
	}

	public String getGrossProfitMargin() {
		return this.grossProfitMargin;
	}
	public void setGrossProfitMargin(String grossProfitMargin) {
		this.grossProfitMargin = grossProfitMargin;
	}

	public String getOpeningInventory() {
		return this.openingInventory;
	}
	public void setOpeningInventory(String openingInventory) {
		this.openingInventory = openingInventory;
	}

	public String getOperationName() {
		return this.operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationNum() {
		return this.operationNum;
	}
	public void setOperationNum(String operationNum) {
		this.operationNum = operationNum;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSkuBatch() {
		return this.skuBatch;
	}
	public void setSkuBatch(String skuBatch) {
		this.skuBatch = skuBatch;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Long getSkuProductionTime() {
		return this.skuProductionTime;
	}
	public void setSkuProductionTime(Long skuProductionTime) {
		this.skuProductionTime = skuProductionTime;
	}

	public String getSkuSellingPrice() {
		return this.skuSellingPrice;
	}
	public void setSkuSellingPrice(String skuSellingPrice) {
		this.skuSellingPrice = skuSellingPrice;
	}

	public String getStartingPosition() {
		return this.startingPosition;
	}
	public void setStartingPosition(String startingPosition) {
		this.startingPosition = startingPosition;
	}

}
