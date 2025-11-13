package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskRankStatistic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.rankstatistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 10:12:01
 */
public class AlipayCommerceYuntaskRankstatisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7527571689289647228L;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 云店排名统计信息
	 */
	@ApiListField("rank_statistic")
	@ApiField("yun_task_rank_statistic")
	private List<YunTaskRankStatistic> rankStatistic;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRankStatistic(List<YunTaskRankStatistic> rankStatistic) {
		this.rankStatistic = rankStatistic;
	}
	public List<YunTaskRankStatistic> getRankStatistic( ) {
		return this.rankStatistic;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
