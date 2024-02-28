package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CmtContentBackFlow;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.ext.comment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 10:31:23
 */
public class AlipayEcoCityserviceExtCommentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4884487443542278474L;

	/** 
	 * 评价列表
	 */
	@ApiListField("comment_list")
	@ApiField("cmt_content_back_flow")
	private List<CmtContentBackFlow> commentList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 某appid下的订单评价数据总条数
	 */
	@ApiField("total")
	private Long total;

	public void setCommentList(List<CmtContentBackFlow> commentList) {
		this.commentList = commentList;
	}
	public List<CmtContentBackFlow> getCommentList( ) {
		return this.commentList;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
