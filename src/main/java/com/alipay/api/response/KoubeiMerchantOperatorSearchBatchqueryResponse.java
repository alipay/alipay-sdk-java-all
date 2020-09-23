package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.search.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantOperatorSearchBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8658893931668629962L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 操作员信息列表
	 */
	@ApiListField("operator_info_models")
	@ApiField("operator_info_model")
	private List<OperatorInfoModel> operatorInfoModels;

	/** 
	 * 总数据量
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setOperatorInfoModels(List<OperatorInfoModel> operatorInfoModels) {
		this.operatorInfoModels = operatorInfoModels;
	}
	public List<OperatorInfoModel> getOperatorInfoModels( ) {
		return this.operatorInfoModels;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
