package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下达产线信息回传
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:19:21
 */
public class AntMerchantExpandProductionOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6836867694233559967L;

	/**
	 * 总数（该项目单下达到产线的总数）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 幂等批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 下产线的物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 项目单号（供应商下产线的维度）
	 */
	@ApiField("project_no")
	private String projectNo;

	/**
	 * 区域仓code
	 */
	@ApiField("regional_warehouse")
	private String regionalWarehouse;

	/**
	 * 项目单下的指令明细信息,长度限制为3000, 传100个指令ID，格式按照附录6.13约定.
	 */
	@ApiField("value")
	private String value;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProjectNo() {
		return this.projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getRegionalWarehouse() {
		return this.regionalWarehouse;
	}
	public void setRegionalWarehouse(String regionalWarehouse) {
		this.regionalWarehouse = regionalWarehouse;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
