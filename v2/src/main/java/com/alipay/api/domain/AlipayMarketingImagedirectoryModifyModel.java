package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 目录修改接口
 *
 * @author auto create
 * @since 1.0, 2024-08-05 19:22:52
 */
public class AlipayMarketingImagedirectoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8134687516745175234L;

	/**
	 * 需修改的目录id。
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 修改后的目录名。仅在需要修改目录名称时传入，如果不修改则此字段不传。
	 */
	@ApiField("image_directory_name")
	private String imageDirectoryName;

	/**
	 * 修改后的父目录id。仅在需要修改归属父目录id时传入，如果不修改则此字段不传。
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

	public String getParentDirectoryId() {
		return this.parentDirectoryId;
	}
	public void setParentDirectoryId(String parentDirectoryId) {
		this.parentDirectoryId = parentDirectoryId;
	}

}
