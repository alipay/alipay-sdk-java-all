package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserSubmitModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.answers.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:56:19
 */
public class AlipayIserviceMindvAnswersBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4398675899993783892L;

	/** 
	 * 当前分页码_和入参保持一致
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 用户提交结果数据
	 */
	@ApiListField("page_data")
	@ApiField("user_submit_model")
	private List<UserSubmitModel> pageData;

	/** 
	 * 每页数量限制_和入参保持一致
	 */
	@ApiField("per_page_size")
	private Long perPageSize;

	/** 
	 * 总的数据数量_提供给业务方自行判断是否继续查询后续数据
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setPageData(List<UserSubmitModel> pageData) {
		this.pageData = pageData;
	}
	public List<UserSubmitModel> getPageData( ) {
		return this.pageData;
	}

	public void setPerPageSize(Long perPageSize) {
		this.perPageSize = perPageSize;
	}
	public Long getPerPageSize( ) {
		return this.perPageSize;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
