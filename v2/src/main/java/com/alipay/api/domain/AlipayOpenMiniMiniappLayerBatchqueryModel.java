package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快窗在线有礼活动查询
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:00
 */
public class AlipayOpenMiniMiniappLayerBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1659165289867761299L;

	/**
	 * 第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据长度为入参值
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
