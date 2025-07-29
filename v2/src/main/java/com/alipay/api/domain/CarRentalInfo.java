package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车信息
 *
 * @author auto create
 * @since 1.0, 2021-05-25 20:32:44
 */
public class CarRentalInfo extends AlipayObject {

	private static final long serialVersionUID = 3259479839176116916L;

	/**
	 * 计费开始时间
	 */
	@ApiField("billing_start_time")
	private Date billingStartTime;

	/**
	 * 已行驶时长(单位为分钟)
	 */
	@ApiField("driving_duration")
	private Long drivingDuration;

	/**
	 * 已行驶里程(单位为米)
	 */
	@ApiField("driving_mileage")
	private Long drivingMileage;

	/**
	 * 时长单价(实时单非套餐必填)
	 */
	@ApiField("duration_unit_price")
	private String durationUnitPrice;

	/**
	 * 租借预计结束时间(预约单必填)
	 */
	@ApiField("estimate_lease_end_time")
	private Date estimateLeaseEndTime;

	/**
	 * 租借预计开始时间(预约单必填)
	 */
	@ApiField("estimate_lease_start_time")
	private Date estimateLeaseStartTime;

	/**
	 * 可免费取消时长(单位为分钟)
	 */
	@ApiField("free_cancellation_time")
	private Long freeCancellationTime;

	/**
	 * 里程单价(实时单套餐必填)
	 */
	@ApiField("mileage_unit_price")
	private String mileageUnitPrice;

	/**
	 * 套餐包含时长(单位为分钟)

用于区分是否为套餐,非套餐场景时当前值为0
	 */
	@ApiField("package_duration")
	private Long packageDuration;

	/**
	 * 套餐包含里程(单位为米)
	 */
	@ApiField("package_mileage")
	private Long packageMileage;

	/**
	 * 套餐名称(实时单套餐必填)
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 租借实际结束时间
	 */
	@ApiField("real_lease_end_time")
	private Date realLeaseEndTime;

	/**
	 * 租借实际开始时间
	 */
	@ApiField("real_lease_start_time")
	private Date realLeaseStartTime;

	/**
	 * 还车门店ID(预约单必填)
	 */
	@ApiField("shopid_car_return")
	private String shopidCarReturn;

	/**
	 * 取车门店ID(预约单必填)
	 */
	@ApiField("shopid_car_taken")
	private String shopidCarTaken;

	/**
	 * 限额上限(超过部分需要先支付)
	 */
	@ApiField("upper_limit_amount")
	private String upperLimitAmount;

	public Date getBillingStartTime() {
		return this.billingStartTime;
	}
	public void setBillingStartTime(Date billingStartTime) {
		this.billingStartTime = billingStartTime;
	}

	public Long getDrivingDuration() {
		return this.drivingDuration;
	}
	public void setDrivingDuration(Long drivingDuration) {
		this.drivingDuration = drivingDuration;
	}

	public Long getDrivingMileage() {
		return this.drivingMileage;
	}
	public void setDrivingMileage(Long drivingMileage) {
		this.drivingMileage = drivingMileage;
	}

	public String getDurationUnitPrice() {
		return this.durationUnitPrice;
	}
	public void setDurationUnitPrice(String durationUnitPrice) {
		this.durationUnitPrice = durationUnitPrice;
	}

	public Date getEstimateLeaseEndTime() {
		return this.estimateLeaseEndTime;
	}
	public void setEstimateLeaseEndTime(Date estimateLeaseEndTime) {
		this.estimateLeaseEndTime = estimateLeaseEndTime;
	}

	public Date getEstimateLeaseStartTime() {
		return this.estimateLeaseStartTime;
	}
	public void setEstimateLeaseStartTime(Date estimateLeaseStartTime) {
		this.estimateLeaseStartTime = estimateLeaseStartTime;
	}

	public Long getFreeCancellationTime() {
		return this.freeCancellationTime;
	}
	public void setFreeCancellationTime(Long freeCancellationTime) {
		this.freeCancellationTime = freeCancellationTime;
	}

	public String getMileageUnitPrice() {
		return this.mileageUnitPrice;
	}
	public void setMileageUnitPrice(String mileageUnitPrice) {
		this.mileageUnitPrice = mileageUnitPrice;
	}

	public Long getPackageDuration() {
		return this.packageDuration;
	}
	public void setPackageDuration(Long packageDuration) {
		this.packageDuration = packageDuration;
	}

	public Long getPackageMileage() {
		return this.packageMileage;
	}
	public void setPackageMileage(Long packageMileage) {
		this.packageMileage = packageMileage;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Date getRealLeaseEndTime() {
		return this.realLeaseEndTime;
	}
	public void setRealLeaseEndTime(Date realLeaseEndTime) {
		this.realLeaseEndTime = realLeaseEndTime;
	}

	public Date getRealLeaseStartTime() {
		return this.realLeaseStartTime;
	}
	public void setRealLeaseStartTime(Date realLeaseStartTime) {
		this.realLeaseStartTime = realLeaseStartTime;
	}

	public String getShopidCarReturn() {
		return this.shopidCarReturn;
	}
	public void setShopidCarReturn(String shopidCarReturn) {
		this.shopidCarReturn = shopidCarReturn;
	}

	public String getShopidCarTaken() {
		return this.shopidCarTaken;
	}
	public void setShopidCarTaken(String shopidCarTaken) {
		this.shopidCarTaken = shopidCarTaken;
	}

	public String getUpperLimitAmount() {
		return this.upperLimitAmount;
	}
	public void setUpperLimitAmount(String upperLimitAmount) {
		this.upperLimitAmount = upperLimitAmount;
	}

}
