package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherPackageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucherpackage.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 10:31:42
 */
public class AlipayMarketingActivityVoucherpackageBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1782187563784365667L;

	/** 
	 * 分页参数，当前所在的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页参数，每页记录数，最大不可超过30
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 券包总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 券包信息
	 */
	@ApiListField("voucher_package_info")
	@ApiField("voucher_package_info")
	private List<VoucherPackageInfo> voucherPackageInfo;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setVoucherPackageInfo(List<VoucherPackageInfo> voucherPackageInfo) {
		this.voucherPackageInfo = voucherPackageInfo;
	}
	public List<VoucherPackageInfo> getVoucherPackageInfo( ) {
		return this.voucherPackageInfo;
	}

}
