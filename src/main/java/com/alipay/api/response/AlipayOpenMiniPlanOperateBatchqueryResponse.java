package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaymentSuccessPagePlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.plan.operate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-26 22:35:43
 */
public class AlipayOpenMiniPlanOperateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8168416456682772739L;

	/** 
	 * 支付后推荐方案详情列表
	 */
	@ApiListField("page_data")
	@ApiField("payment_success_page_plan_info")
	private List<PaymentSuccessPagePlanInfo> pageData;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 支付后推荐方案记录总数
	 */
	@ApiField("total_number")
	private Long totalNumber;

	public void setPageData(List<PaymentSuccessPagePlanInfo> pageData) {
		this.pageData = pageData;
	}
	public List<PaymentSuccessPagePlanInfo> getPageData( ) {
		return this.pageData;
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

	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}
	public Long getTotalNumber( ) {
		return this.totalNumber;
	}

}
