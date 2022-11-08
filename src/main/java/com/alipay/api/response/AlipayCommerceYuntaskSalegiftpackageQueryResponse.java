package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskVoucherPackageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.salegiftpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 19:50:46
 */
public class AlipayCommerceYuntaskSalegiftpackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8565771125754436966L;

	/** 
	 * 分页页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 券包信息
	 */
	@ApiListField("voucher_package_infos")
	@ApiField("yun_task_voucher_package_info")
	private List<YunTaskVoucherPackageInfo> voucherPackageInfos;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
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

	public void setVoucherPackageInfos(List<YunTaskVoucherPackageInfo> voucherPackageInfos) {
		this.voucherPackageInfos = voucherPackageInfos;
	}
	public List<YunTaskVoucherPackageInfo> getVoucherPackageInfos( ) {
		return this.voucherPackageInfos;
	}

}
