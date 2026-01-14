package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片目录vo
 *
 * @author auto create
 * @since 1.0, 2024-08-05 19:25:25
 */
public class ImageDirectoryVO extends AlipayObject {

	private static final long serialVersionUID = 1843796914326653936L;

	/**
	 * 目录创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 目录id
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 目录名
	 */
	@ApiField("image_directory_name")
	private String imageDirectoryName;

	/**
	 * 目录更新时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 父目录id
	 */
	@ApiField("parent_directory_id")
	private String parentDirectoryId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

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

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getParentDirectoryId() {
		return this.parentDirectoryId;
	}
	public void setParentDirectoryId(String parentDirectoryId) {
		this.parentDirectoryId = parentDirectoryId;
	}

}
