package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizBudgetDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.atsbudget.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:51:45
 */
public class MyxiaojinFinanceAtsbudgetBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2484995988469688596L;

	/** 
	 * 页码数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 预算业务申请信息
	 */
	@ApiListField("result_data")
	@ApiField("biz_budget_d_t_o")
	private List<BizBudgetDTO> resultData;

	/** 
	 * 错误码对应的详细错误信息，助于排查问题
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setResultData(List<BizBudgetDTO> resultData) {
		this.resultData = resultData;
	}
	public List<BizBudgetDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
