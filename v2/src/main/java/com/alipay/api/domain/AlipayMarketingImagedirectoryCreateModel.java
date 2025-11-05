package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片目录创建接口
 *
 * @author auto create
 * @since 1.0, 2025-05-21 15:41:01
 */
public class AlipayMarketingImagedirectoryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4731686163297915999L;

	/**
	 * 新增目录名。
	 */
	@ApiField("image_directory_name")
	private String imageDirectoryName;

	/**
	 * 新增目录归属父目录id。如果新增目录需要归属到根目录，则该字段填"0"。
	 */
	@ApiField("parent_directory_id")
	private String parentDirectoryId;

	public String getImageDirectoryName() {
		return this.imageDirectoryName;
	}
	public void setImageDirectoryName(String imageDirectoryName) {
		this.imageDirectoryName = imageDirectoryName;
	}

	public String getParentDirectoryId() {
		return this.parentDirectoryId;
	}
	public void setParentDirectoryId(String parentDirectoryId) {
		this.parentDirectoryId = parentDirectoryId;
	}

}
