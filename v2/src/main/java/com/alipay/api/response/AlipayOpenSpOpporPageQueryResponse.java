package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvExpandOpporDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.oppor.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-21 17:47:57
 */
public class AlipayOpenSpOpporPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4785314212325629434L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 商机作业记录列表
	 */
	@ApiListField("oppor_list")
	@ApiField("isv_expand_oppor_d_t_o")
	private List<IsvExpandOpporDTO> opporList;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setOpporList(List<IsvExpandOpporDTO> opporList) {
		this.opporList = opporList;
	}
	public List<IsvExpandOpporDTO> getOpporList( ) {
		return this.opporList;
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

}
