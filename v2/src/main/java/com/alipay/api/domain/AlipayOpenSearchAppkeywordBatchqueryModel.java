package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序已配置关键词
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:20:50
 */
public class AlipayOpenSearchAppkeywordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1413448941163826613L;

	/**
	 * 当前页
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}
