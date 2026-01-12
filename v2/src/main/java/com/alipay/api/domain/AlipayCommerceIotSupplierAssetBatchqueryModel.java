package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商设备信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-18 14:59:46
 */
public class AlipayCommerceIotSupplierAssetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6285856334158647658L;

	/**
	 * 当前页码
	 */
	@ApiField("cur_page_num")
	private Long curPageNum;

	/**
	 * 搜索关键字，设备型号、设备名称等
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 查询分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 供应商pid
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	public Long getCurPageNum() {
		return this.curPageNum;
	}
	public void setCurPageNum(Long curPageNum) {
		this.curPageNum = curPageNum;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSupplierPid() {
		return this.supplierPid;
	}
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
	}

}
