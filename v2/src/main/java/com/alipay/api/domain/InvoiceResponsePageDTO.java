package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票
 *
 * @author auto create
 * @since 1.0, 2022-09-21 15:44:36
 */
public class InvoiceResponsePageDTO extends AlipayObject {

	private static final long serialVersionUID = 3557452163958891284L;

	/**
	 * 当前数据页码
	 */
	@ApiField("current_page")
	private String currentPage;

	/**
	 * 发票
	 */
	@ApiListField("datas")
	@ApiField("invoice_all_response_d_t_o")
	private List<InvoiceAllResponseDTO> datas;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 数据总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public String getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public List<InvoiceAllResponseDTO> getDatas() {
		return this.datas;
	}
	public void setDatas(List<InvoiceAllResponseDTO> datas) {
		this.datas = datas;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
