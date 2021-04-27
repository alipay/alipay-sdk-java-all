package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分奖品分页查询
 *
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:12
 */
public class AntfortuneEquityInstpointPrizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6837811758638587116L;

	/**
	 * 当前页数，取值[1,50]整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，取值[1,20]整数
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
