package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单列表查询
 *
 * @author auto create
 * @since 1.0, 2019-11-22 14:34:54
 */
public class AlipayOverseasTaxOrderListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8677549439661214541L;

	/**
	 * 页码，当前页码，大于0的正整数。每页显示条数默认20条。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
