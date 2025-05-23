package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointLogInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.point.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-03 11:14:59
 */
public class AlipayCommerceOperationPointHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2256137182645973347L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 分页数
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 积分明细
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/** 
	 * 详细数据
	 */
	@ApiListField("point_log_list")
	@ApiField("point_log_info")
	private List<PointLogInfo> pointLogList;

	/** 
	 * 总分页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
	}

	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}
	public Long getPointAmount( ) {
		return this.pointAmount;
	}

	public void setPointLogList(List<PointLogInfo> pointLogList) {
		this.pointLogList = pointLogList;
	}
	public List<PointLogInfo> getPointLogList( ) {
		return this.pointLogList;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
