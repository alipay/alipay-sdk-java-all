package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包批量查询
 *
 * @author auto create
 * @since 1.0, 2023-06-29 14:47:51
 */
public class AlipayMarketingActivityVoucherpackageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5227147141969884784L;

	/**
	 * 分页参数，需要查询的页码，起始页是1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页参数，每页记录数，最大不可超过30
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 券包购买开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("voucher_package_purchase_start_time")
	private Date voucherPackagePurchaseStartTime;

	/**
	 * 券包状态
	 */
	@ApiField("voucher_package_status")
	private String voucherPackageStatus;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getVoucherPackagePurchaseStartTime() {
		return this.voucherPackagePurchaseStartTime;
	}
	public void setVoucherPackagePurchaseStartTime(Date voucherPackagePurchaseStartTime) {
		this.voucherPackagePurchaseStartTime = voucherPackagePurchaseStartTime;
	}

	public String getVoucherPackageStatus() {
		return this.voucherPackageStatus;
	}
	public void setVoucherPackageStatus(String voucherPackageStatus) {
		this.voucherPackageStatus = voucherPackageStatus;
	}

}
