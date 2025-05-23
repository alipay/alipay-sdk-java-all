package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherActivityResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.voucher.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 10:43:53
 */
public class AlipayCommerceEcVoucherActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5819388487865689342L;

	/** 
	 * 券活动
	 */
	@ApiListField("activity_list")
	@ApiField("voucher_activity_response")
	private List<VoucherActivityResponse> activityList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setActivityList(List<VoucherActivityResponse> activityList) {
		this.activityList = activityList;
	}
	public List<VoucherActivityResponse> getActivityList( ) {
		return this.activityList;
	}

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

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
