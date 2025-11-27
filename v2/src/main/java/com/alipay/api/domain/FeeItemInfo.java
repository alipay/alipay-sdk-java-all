package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计费项详情
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:17:12
 */
public class FeeItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5642724183263894471L;

	/**
	 * 计费项编码
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 计费项名称
	 */
	@ApiField("fee_item_name")
	private String feeItemName;

	/**
	 * 已用百分比
	 */
	@ApiField("percent")
	private String percent;

	/**
	 * 总量
	 */
	@ApiField("total_value")
	private String totalValue;

	/**
	 * 计费项单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 已使用用量
	 */
	@ApiField("used_value")
	private String usedValue;

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public String getFeeItemName() {
		return this.feeItemName;
	}
	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}

	public String getPercent() {
		return this.percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}

	public String getTotalValue() {
		return this.totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUsedValue() {
		return this.usedValue;
	}
	public void setUsedValue(String usedValue) {
		this.usedValue = usedValue;
	}

}
