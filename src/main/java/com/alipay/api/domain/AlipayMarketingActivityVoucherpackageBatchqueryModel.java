package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包批量查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 22:26:13
 */
public class AlipayMarketingActivityVoucherpackageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4873819485654652281L;

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
	 * 券包状态：不指定可查全部状态，指定时只支持查单个状态
枚举值：
CREATED：已创建,
ENABLE：已发布（包含过期）,
PAUSED：已暂停,
DISABLE：已停止;
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
