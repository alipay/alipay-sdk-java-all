package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧列表查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:59:02
 */
public class AlipaySocialBaseLifecreationShortplaylistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3737322945278275325L;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页条目数 最大值：100
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
