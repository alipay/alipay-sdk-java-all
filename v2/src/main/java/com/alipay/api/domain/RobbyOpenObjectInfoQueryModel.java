package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务对象信息分页查询
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:17:53
 */
public class RobbyOpenObjectInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7137458149163841346L;

	/**
	 * 业务对象名称（如药品名），模糊匹配
	 */
	@ApiField("biz_object_name")
	private String bizObjectName;

	/**
	 * 业务对象编号（如69码），精确匹配
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	/**
	 * 对象库ID
	 */
	@ApiField("object_library_id")
	private String objectLibraryId;

	/**
	 * 当前页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBizObjectName() {
		return this.bizObjectName;
	}
	public void setBizObjectName(String bizObjectName) {
		this.bizObjectName = bizObjectName;
	}

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

	public String getObjectLibraryId() {
		return this.objectLibraryId;
	}
	public void setObjectLibraryId(String objectLibraryId) {
		this.objectLibraryId = objectLibraryId;
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

}
