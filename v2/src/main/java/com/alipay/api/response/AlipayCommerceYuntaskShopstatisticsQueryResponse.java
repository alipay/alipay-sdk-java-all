package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskShopStatisticInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.shopstatistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 17:26:13
 */
public class AlipayCommerceYuntaskShopstatisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5132627915512799541L;

	/** 
	 * 分页
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 统计数据
	 */
	@ApiListField("task_shop_statistic_info")
	@ApiField("yun_task_shop_statistic_info")
	private List<YunTaskShopStatisticInfo> taskShopStatisticInfo;

	/** 
	 * 结果总数
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

	public void setTaskShopStatisticInfo(List<YunTaskShopStatisticInfo> taskShopStatisticInfo) {
		this.taskShopStatisticInfo = taskShopStatisticInfo;
	}
	public List<YunTaskShopStatisticInfo> getTaskShopStatisticInfo( ) {
		return this.taskShopStatisticInfo;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
