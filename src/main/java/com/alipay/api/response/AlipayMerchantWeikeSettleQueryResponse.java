package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserTaskView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.weike.settle.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-30 12:10:01
 */
public class AlipayMerchantWeikeSettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8633432516722442326L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 分页查询页号，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页查询页大小，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 用户任务列表
	 */
	@ApiListField("user_task_views")
	@ApiField("user_task_view")
	private List<UserTaskView> userTaskViews;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
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

	public void setUserTaskViews(List<UserTaskView> userTaskViews) {
		this.userTaskViews = userTaskViews;
	}
	public List<UserTaskView> getUserTaskViews( ) {
		return this.userTaskViews;
	}

}
