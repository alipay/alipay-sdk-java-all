package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可报名的方案列表
 *
 * @author auto create
 * @since 1.0, 2022-01-25 11:44:57
 */
public class AlipayMarketingRecruitPlanlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6648298843718714877L;

	/**
	 * 第几页，默认1（需要在1和999之间）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，默认20，需要在1和100之间
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
