package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitPlanLight;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.recruit.planlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 22:01:55
 */
public class AlipayMarketingRecruitPlanlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8634459114369887545L;

	/** 
	 * 方案列表
	 */
	@ApiListField("data")
	@ApiField("recruit_plan_light")
	private List<RecruitPlanLight> data;

	/** 
	 * 第几页，默认1（从1开始计数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setData(List<RecruitPlanLight> data) {
		this.data = data;
	}
	public List<RecruitPlanLight> getData( ) {
		return this.data;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
