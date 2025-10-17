package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 列出所有的租户实例（数据权限）
 *
 * @author auto create
 * @since 1.0, 2023-08-21 15:09:22
 */
public class AlipayIserviceCcmInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2115412667151742674L;

	/**
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询时设置的每页记录数，最大值 100 行，默认为 10
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
