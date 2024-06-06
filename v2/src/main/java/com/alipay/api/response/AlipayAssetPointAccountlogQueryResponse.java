package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointAccountLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.accountlog.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 14:01:26
 */
public class AlipayAssetPointAccountlogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8357513245416716147L;

	/** 
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 集分宝账户流水详情列表
	 */
	@ApiListField("point_account_logs")
	@ApiField("point_account_log")
	private List<PointAccountLog> pointAccountLogs;

	/** 
	 * 集分宝流水总条数,返回满足条件的集分宝流水的总条数。
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数，根据totalcount和pagesize计算出来
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPointAccountLogs(List<PointAccountLog> pointAccountLogs) {
		this.pointAccountLogs = pointAccountLogs;
	}
	public List<PointAccountLog> getPointAccountLogs( ) {
		return this.pointAccountLogs;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
