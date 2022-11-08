package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用分页模型
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:46:16
 */
public class GreenPaginator extends AlipayObject {

	private static final long serialVersionUID = 2115692667278283578L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
