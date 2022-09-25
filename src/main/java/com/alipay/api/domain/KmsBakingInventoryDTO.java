package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * kms烘焙业务库存数据结构
 *
 * @author auto create
 * @since 1.0, 2020-04-10 11:57:16
 */
public class KmsBakingInventoryDTO extends AlipayObject {

	private static final long serialVersionUID = 3843743489398751815L;

	/**
	 * 累计库存；本字段不能为负数
	 */
	@ApiField("accumulate_inventory")
	private String accumulateInventory;

	/**
	 * 表示这条数据的唯一id，主要用于后续同步了重复数据以后去重，或者用于修复之前同步的问题数据。
建议生成规则：根据shop_id+sku_batch+operate_name+operate_time生成hash值
	 */
	@ApiField("data_id")
	private String dataId;

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
	 * 操作前库存
	 */
	@ApiField("opening_inventory")
	private String openingInventory;

	/**
	 * 操作名称；若为示例中包含的操作类型请按示例值传递，否则可以传递自定义的值但必须与示例值不同
	 */
	@ApiField("operation_name")
	private String operationName;

	/**
	 * 操作数量，可以为整数或者小数但不能为负数
	 */
	@ApiField("operation_num")
	private String operationNum;

	/**
	 * 操作时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operation_time")
	private String operationTime;

	/**
	 * 操作员，传中文或id均可
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * sku批次
	 */
	@ApiField("sku_batch")
	private String skuBatch;

	/**
	 * 口碑skuId，需要通过口碑菜品同步获取
	 */
	@ApiField("sku_id")
	private String skuId;

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

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
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

	public String getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(String operationTime) {
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

	public String getStartingPosition() {
		return this.startingPosition;
	}
	public void setStartingPosition(String startingPosition) {
		this.startingPosition = startingPosition;
	}

}
