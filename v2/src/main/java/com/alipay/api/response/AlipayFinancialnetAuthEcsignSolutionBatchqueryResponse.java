package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolutionOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.solution.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignSolutionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8448536397542878377L;

	/** 
	 * 页，默认1，必须要大于0。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页面大小，默认10。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 解决方案列表
	 */
	@ApiListField("solution_list")
	@ApiField("solution_open_v_o")
	private List<SolutionOpenVO> solutionList;

	/** 
	 * 列表记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSolutionList(List<SolutionOpenVO> solutionList) {
		this.solutionList = solutionList;
	}
	public List<SolutionOpenVO> getSolutionList( ) {
		return this.solutionList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
