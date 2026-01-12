package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询订单列表
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:13:18
 */
public class AlipayOpenMiniOrderlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8635741549757454345L;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create_end")
	private Date gmtCreateEnd;

	/**
	 * 起始创建时间 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_create_start")
	private Date gmtCreateStart;

	/**
	 * 订单状态
	 */
	@ApiListField("order_status_list")
	@ApiField("string")
	private List<String> orderStatusList;

	/**
	 * 页数，大于等于1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页订单数，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 1:desc, 2:asc
	 */
	@ApiField("sort_order")
	private String sortOrder;

	public Date getGmtCreateEnd() {
		return this.gmtCreateEnd;
	}
	public void setGmtCreateEnd(Date gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
	}

	public Date getGmtCreateStart() {
		return this.gmtCreateStart;
	}
	public void setGmtCreateStart(Date gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
	}

	public List<String> getOrderStatusList() {
		return this.orderStatusList;
	}
	public void setOrderStatusList(List<String> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}
