package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 目录分页查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-21 15:40:10
 */
public class AlipayMarketingImagedirectoryListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7848489681523243181L;

	/**
	 * 目录id。
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 目录名，支持模糊检索。
	 */
	@ApiField("image_directory_name")
	private String imageDirectoryName;

	/**
	 * 页码。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 单页条数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 父目录ID，查询一级目录时填"0"，查询全部目录的时候不填。
	 */
	@ApiField("parent_directory_id")
	private String parentDirectoryId;

	public String getImageDirectoryId() {
		return this.imageDirectoryId;
	}
	public void setImageDirectoryId(String imageDirectoryId) {
		this.imageDirectoryId = imageDirectoryId;
	}

	public String getImageDirectoryName() {
		return this.imageDirectoryName;
	}
	public void setImageDirectoryName(String imageDirectoryName) {
		this.imageDirectoryName = imageDirectoryName;
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

	public String getParentDirectoryId() {
		return this.parentDirectoryId;
	}
	public void setParentDirectoryId(String parentDirectoryId) {
		this.parentDirectoryId = parentDirectoryId;
	}

}
