package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议关键字
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:29:50
 */
public class CarfinKeyWord extends AlipayObject {

	private static final long serialVersionUID = 8112249534364275763L;

	/**
	 * 用于在PDF中检索签名位置使用的关键字
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 关键字所在的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

}
