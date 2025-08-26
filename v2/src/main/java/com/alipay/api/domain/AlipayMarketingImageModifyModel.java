package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片更新接口
 *
 * @author auto create
 * @since 1.0, 2025-05-21 15:40:51
 */
public class AlipayMarketingImageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7628593456431153439L;

	/**
	 * 修改后图片新文件名。仅在需要修改文件名时传入，如果不修改则此字段不传。
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 修改后新目录id。仅在需要修改图片归属目录归属关系时传入。如果不修改则此字段不传。
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 需要修改的图索引id。
	 */
	@ApiField("image_index_id")
	private String imageIndexId;

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

}
