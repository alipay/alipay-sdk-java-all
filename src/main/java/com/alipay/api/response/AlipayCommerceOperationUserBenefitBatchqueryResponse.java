package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserBenefitInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.user.benefit.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 19:57:52
 */
public class AlipayCommerceOperationUserBenefitBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5488511857776918368L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总长度
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 权益列表
	 */
	@ApiField("user_benefit_info_list")
	private UserBenefitInfo userBenefitInfoList;

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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setUserBenefitInfoList(UserBenefitInfo userBenefitInfoList) {
		this.userBenefitInfoList = userBenefitInfoList;
	}
	public UserBenefitInfo getUserBenefitInfoList( ) {
		return this.userBenefitInfoList;
	}

}
