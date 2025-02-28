package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ContractTemplateOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6261853848591693895L;

	/** 
	 * 合同模板查询列表返回值，注意如果是列表返回的是用于展示的精简值，详情请查询详情接口。
	 */
	@ApiListField("data_list")
	@ApiField("contract_template_open_v_o")
	private List<ContractTemplateOpenVO> dataList;

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
	 * 列表记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDataList(List<ContractTemplateOpenVO> dataList) {
		this.dataList = dataList;
	}
	public List<ContractTemplateOpenVO> getDataList( ) {
		return this.dataList;
	}

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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
