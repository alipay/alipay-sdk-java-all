package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板批量查询
 *
 * @author auto create
 * @since 1.0, 2019-03-06 14:42:33
 */
public class AlipayMarketingCardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1559317736955114281L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认20条，最大支持20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
