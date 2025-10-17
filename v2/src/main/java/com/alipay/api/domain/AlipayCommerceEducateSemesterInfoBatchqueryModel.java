package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询学期
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:07
 */
public class AlipayCommerceEducateSemesterInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4812947365977878187L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 分页页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 学期名称
	 */
	@ApiField("semester_name")
	private String semesterName;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

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

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return this.semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

}
