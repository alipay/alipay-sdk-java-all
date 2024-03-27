package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-节点-批量查询
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:59:13
 */
public class AlipayIserviceCcmSwTreecategoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6725336457944278888L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 知识库ID
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页数，page_size不能为空
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页显示大小，page_num不能为空
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
