package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车型库品牌列表查询
 *
 * @author auto create
 * @since 1.0, 2026-07-02 16:40:06
 */
public class AlipayEcoMycarVehlibBrandQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2354863137184915357L;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，1~100
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
