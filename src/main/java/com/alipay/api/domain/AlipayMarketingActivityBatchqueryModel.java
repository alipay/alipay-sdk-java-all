package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条件查询活动列表
 *
 * @author auto create
 * @since 1.0, 2021-11-17 10:14:52
 */
public class AlipayMarketingActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777855441489732316L;

	/**
	 * 分页查询页码。必须为大于0的整数， 1表示第一页，2表示第2页，依次类推
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。必须为大于0的整数，最大值为30
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
