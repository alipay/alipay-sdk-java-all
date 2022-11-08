package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 汇总账单分页信息
 *
 * @author auto create
 * @since 1.0, 2022-11-01 15:31:09
 */
public class SummaryBillPageOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 7697352197361112255L;

	/**
	 * 当前页数
	 */
	@ApiField("current_page")
	private String currentPage;

	/**
	 * 汇总账单信息openapi
	 */
	@ApiListField("datas")
	@ApiField("summary_bill_open_api_d_t_o")
	private List<SummaryBillOpenApiDTO> datas;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 数据总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	public String getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public List<SummaryBillOpenApiDTO> getDatas() {
		return this.datas;
	}
	public void setDatas(List<SummaryBillOpenApiDTO> datas) {
		this.datas = datas;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

}
