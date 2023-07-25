package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询三方应用的商家小程序授权列表
 *
 * @author auto create
 * @since 1.0, 2023-05-30 17:38:30
 */
public class AlipayOpenMiniAppauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7354636217265465731L;

	/**
	 * 请求分页页面
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 请求分页条数
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
