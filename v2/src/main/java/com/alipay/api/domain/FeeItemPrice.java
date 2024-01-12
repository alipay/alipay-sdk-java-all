package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 各计费项单价
 *
 * @author auto create
 * @since 1.0, 2023-10-17 16:58:33
 */
public class FeeItemPrice extends AlipayObject {

	private static final long serialVersionUID = 4153676875525322571L;

	/**
	 * 单价(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 计费产品码
	 */
	@ApiField("cloud_product_code")
	private String cloudProductCode;

	/**
	 * 计费产品码
	 */
	@ApiField("cloud_product_name")
	private String cloudProductName;

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
	 * 计费单位编码
	 */
	@ApiField("measuring_unit_code")
	private String measuringUnitCode;

	/**
	 * 计费单位名称
	 */
	@ApiField("measuring_unit_name")
	private String measuringUnitName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCloudProductCode() {
		return this.cloudProductCode;
	}
	public void setCloudProductCode(String cloudProductCode) {
		this.cloudProductCode = cloudProductCode;
	}

	public String getCloudProductName() {
		return this.cloudProductName;
	}
	public void setCloudProductName(String cloudProductName) {
		this.cloudProductName = cloudProductName;
	}

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

	public String getMeasuringUnitCode() {
		return this.measuringUnitCode;
	}
	public void setMeasuringUnitCode(String measuringUnitCode) {
		this.measuringUnitCode = measuringUnitCode;
	}

	public String getMeasuringUnitName() {
		return this.measuringUnitName;
	}
	public void setMeasuringUnitName(String measuringUnitName) {
		this.measuringUnitName = measuringUnitName;
	}

}
