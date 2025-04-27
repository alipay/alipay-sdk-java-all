package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询医保单信息
 *
 * @author auto create
 * @since 1.0, 2025-04-17 20:53:02
 */
public class AlipayCommerceMedicalMisetorderOrdernoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8856276971331335313L;

	/**
	 * 默认值为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 默认每页显示20条，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 日期格式，yyyy-MM-dd
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
