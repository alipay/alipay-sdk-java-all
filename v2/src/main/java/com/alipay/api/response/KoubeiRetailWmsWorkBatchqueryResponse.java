package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkListVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.work.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:22:01
 */
public class KoubeiRetailWmsWorkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5351178125891121918L;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询条件下作业总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 作业列表
	 */
	@ApiListField("work_list")
	@ApiField("work_list_v_o")
	private List<WorkListVO> workList;

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWorkList(List<WorkListVO> workList) {
		this.workList = workList;
	}
	public List<WorkListVO> getWorkList( ) {
		return this.workList;
	}

}
