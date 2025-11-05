package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部三方商家回流订单评价数据
 *
 * @author auto create
 * @since 1.0, 2023-10-30 10:31:23
 */
public class AlipayEcoCityserviceExtCommentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4284452271895276329L;

	/**
	 * 当传递该字段时候、查询指定日期天所在的订单评价数据、若不传递该字段则默认查询调用接口所在时刻的前一天的订单评价数据
	 */
	@ApiField("cmt_create_time")
	private Date cmtCreateTime;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页查询的单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getCmtCreateTime() {
		return this.cmtCreateTime;
	}
	public void setCmtCreateTime(Date cmtCreateTime) {
		this.cmtCreateTime = cmtCreateTime;
	}

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

}
