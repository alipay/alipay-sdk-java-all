package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包基本信息
 *
 * @author auto create
 * @since 1.0, 2022-07-19 17:38:56
 */
public class VoucherPackageBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 1548832932212125596L;

	/**
	 * 券包购买结束时间
	 */
	@ApiField("purchase_end_time")
	private Date purchaseEndTime;

	/**
	 * 券包购买开始时间
	 */
	@ApiField("purchase_start_time")
	private Date purchaseStartTime;

	/**
	 * 券包id
	 */
	@ApiField("voucher_package_id")
	private String voucherPackageId;

	/**
	 * 券包名称
	 */
	@ApiField("voucher_package_name")
	private String voucherPackageName;

	/**
	 * 券包状态。 CREATED：已创建, ENABLE： 已发布（包含进行中和已过期，已过期以voucher_package_purchase_end_time为准）, PAUSED： 已暂停, DISABLE： 已停止;
	 */
	@ApiField("voucher_package_status")
	private String voucherPackageStatus;

	/**
	 * 券包总价值（单位是元）： 券包下券的优惠总额（满减券指优惠面额，折扣券指优惠上限，特价券指原价减去特价）
	 */
	@ApiField("voucher_total_amount")
	private String voucherTotalAmount;

	public Date getPurchaseEndTime() {
		return this.purchaseEndTime;
	}
	public void setPurchaseEndTime(Date purchaseEndTime) {
		this.purchaseEndTime = purchaseEndTime;
	}

	public Date getPurchaseStartTime() {
		return this.purchaseStartTime;
	}
	public void setPurchaseStartTime(Date purchaseStartTime) {
		this.purchaseStartTime = purchaseStartTime;
	}

	public String getVoucherPackageId() {
		return this.voucherPackageId;
	}
	public void setVoucherPackageId(String voucherPackageId) {
		this.voucherPackageId = voucherPackageId;
	}

	public String getVoucherPackageName() {
		return this.voucherPackageName;
	}
	public void setVoucherPackageName(String voucherPackageName) {
		this.voucherPackageName = voucherPackageName;
	}

	public String getVoucherPackageStatus() {
		return this.voucherPackageStatus;
	}
	public void setVoucherPackageStatus(String voucherPackageStatus) {
		this.voucherPackageStatus = voucherPackageStatus;
	}

	public String getVoucherTotalAmount() {
		return this.voucherTotalAmount;
	}
	public void setVoucherTotalAmount(String voucherTotalAmount) {
		this.voucherTotalAmount = voucherTotalAmount;
	}

}
