package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片分页查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-21 15:40:20
 */
public class AlipayMarketingImageListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8648266411957941616L;

	/**
	 * 图文件名，支持模糊检索。
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 图片所归属的目录id。
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 图片空间中图片索引id。
	 */
	@ApiField("image_index_id")
	private String imageIndexId;

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

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getImageDirectoryId() {
		return this.imageDirectoryId;
	}
	public void setImageDirectoryId(String imageDirectoryId) {
		this.imageDirectoryId = imageDirectoryId;
	}

	public String getImageIndexId() {
		return this.imageIndexId;
	}
	public void setImageIndexId(String imageIndexId) {
		this.imageIndexId = imageIndexId;
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
