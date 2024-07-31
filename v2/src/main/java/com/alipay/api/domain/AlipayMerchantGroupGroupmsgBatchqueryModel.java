package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询商家群内群发消息记录
 *
 * @author auto create
 * @since 1.0, 2024-05-27 20:03:28
 */
public class AlipayMerchantGroupGroupmsgBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8837385619796618299L;

	/**
	 * 当前第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示条数，最大展示50条
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
