package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算单明细列表
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:29:22
 */
public class StatementDetaileds extends AlipayObject {

	private static final long serialVersionUID = 1275695843596877875L;

	/**
	 * 调整天数
	 */
	@ApiField("adjust_days_quantity")
	private String adjustDaysQuantity;

	/**
	 * 设备资产id，设备资产登记后返回
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 账单天数
	 */
	@ApiField("bill_days_quantity")
	private String billDaysQuantity;

	/**
	 * 账单结束日期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("bill_end_date")
	private Date billEndDate;

	/**
	 * 账单开始日期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("bill_start_date")
	private Date billStartDate;

	/**
	 * 合同单价，日单价，单位元
	 */
	@ApiField("daily_contract_price")
	private String dailyContractPrice;

	/**
	 * 进场时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("enter_time")
	private Date enterTime;

	/**
	 * 退场时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("exit_time")
	private Date exitTime;

	/**
	 * 合同单价-运费，单位元
	 */
	@ApiField("freight_contract_price")
	private String freightContractPrice;

	/**
	 * 维修杂费，单位元
	 */
	@ApiField("maintenance_amount")
	private String maintenanceAmount;

	/**
	 * 合同单价-月单价，单位元
	 */
	@ApiField("month_contract_price")
	private String monthContractPrice;

	/**
	 * 实际天数
	 */
	@ApiField("real_days_quantity")
	private String realDaysQuantity;

	/**
	 * 应收运费，单位元
	 */
	@ApiField("receivable_freight")
	private String receivableFreight;

	/**
	 * 改装费，单位元
	 */
	@ApiField("refit_amount")
	private String refitAmount;

	/**
	 * 租金，单位元
	 */
	@ApiField("rent_amount")
	private String rentAmount;

	/**
	 * 本期合计金额，单位元
	 */
	@ApiField("summary_amount")
	private String summaryAmount;

	public String getAdjustDaysQuantity() {
		return this.adjustDaysQuantity;
	}
	public void setAdjustDaysQuantity(String adjustDaysQuantity) {
		this.adjustDaysQuantity = adjustDaysQuantity;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getBillDaysQuantity() {
		return this.billDaysQuantity;
	}
	public void setBillDaysQuantity(String billDaysQuantity) {
		this.billDaysQuantity = billDaysQuantity;
	}

	public Date getBillEndDate() {
		return this.billEndDate;
	}
	public void setBillEndDate(Date billEndDate) {
		this.billEndDate = billEndDate;
	}

	public Date getBillStartDate() {
		return this.billStartDate;
	}
	public void setBillStartDate(Date billStartDate) {
		this.billStartDate = billStartDate;
	}

	public String getDailyContractPrice() {
		return this.dailyContractPrice;
	}
	public void setDailyContractPrice(String dailyContractPrice) {
		this.dailyContractPrice = dailyContractPrice;
	}

	public Date getEnterTime() {
		return this.enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public Date getExitTime() {
		return this.exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	public String getFreightContractPrice() {
		return this.freightContractPrice;
	}
	public void setFreightContractPrice(String freightContractPrice) {
		this.freightContractPrice = freightContractPrice;
	}

	public String getMaintenanceAmount() {
		return this.maintenanceAmount;
	}
	public void setMaintenanceAmount(String maintenanceAmount) {
		this.maintenanceAmount = maintenanceAmount;
	}

	public String getMonthContractPrice() {
		return this.monthContractPrice;
	}
	public void setMonthContractPrice(String monthContractPrice) {
		this.monthContractPrice = monthContractPrice;
	}

	public String getRealDaysQuantity() {
		return this.realDaysQuantity;
	}
	public void setRealDaysQuantity(String realDaysQuantity) {
		this.realDaysQuantity = realDaysQuantity;
	}

	public String getReceivableFreight() {
		return this.receivableFreight;
	}
	public void setReceivableFreight(String receivableFreight) {
		this.receivableFreight = receivableFreight;
	}

	public String getRefitAmount() {
		return this.refitAmount;
	}
	public void setRefitAmount(String refitAmount) {
		this.refitAmount = refitAmount;
	}

	public String getRentAmount() {
		return this.rentAmount;
	}
	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getSummaryAmount() {
		return this.summaryAmount;
	}
	public void setSummaryAmount(String summaryAmount) {
		this.summaryAmount = summaryAmount;
	}

}
