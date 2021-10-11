package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证分页查询列表
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InsCertificatePaginationList extends AlipayObject {

	private static final long serialVersionUID = 6579525189369827929L;

	/**
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 结果列表
	 */
	@ApiListField("list")
	@ApiField("ins_certificate_api_d_t_o")
	private List<InsCertificateApiDTO> list;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 全部页数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public List<InsCertificateApiDTO> getList() {
		return this.list;
	}
	public void setList(List<InsCertificateApiDTO> list) {
		this.list = list;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPageNum() {
		return this.totalPageNum;
	}
	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

}
