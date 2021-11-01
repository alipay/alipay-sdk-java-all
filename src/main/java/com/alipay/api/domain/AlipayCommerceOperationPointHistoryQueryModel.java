package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分明细
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:50
 */
public class AlipayCommerceOperationPointHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4361847295561311927L;

	/**
	 * 分页数
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 需要绑定的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 店员id，点击提交的收银员id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
