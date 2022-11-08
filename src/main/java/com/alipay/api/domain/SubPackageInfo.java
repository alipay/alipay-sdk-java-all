package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分包模型
 *
 * @author auto create
 * @since 1.0, 2021-12-15 14:34:34
 */
public class SubPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 8243484333969254392L;

	/**
	 * 构建好的结果地址
	 */
	@ApiField("builded_package_url")
	private String buildedPackageUrl;

	/**
	 * 构建好的分包地址
	 */
	@ApiField("new_builded_package_url")
	private String newBuildedPackageUrl;

	/**
	 * 2.0分包大小，单位字节
	 */
	@ApiField("new_size")
	private String newSize;

	/**
	 * 分包路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 分包大小，单位字节
	 */
	@ApiField("size")
	private String size;

	/**
	 * 源码地址
	 */
	@ApiField("source_url")
	private String sourceUrl;

	/**
	 * 分包类型： MAIN ｜ SUB
	 */
	@ApiField("type")
	private String type;

	public String getBuildedPackageUrl() {
		return this.buildedPackageUrl;
	}
	public void setBuildedPackageUrl(String buildedPackageUrl) {
		this.buildedPackageUrl = buildedPackageUrl;
	}

	public String getNewBuildedPackageUrl() {
		return this.newBuildedPackageUrl;
	}
	public void setNewBuildedPackageUrl(String newBuildedPackageUrl) {
		this.newBuildedPackageUrl = newBuildedPackageUrl;
	}

	public String getNewSize() {
		return this.newSize;
	}
	public void setNewSize(String newSize) {
		this.newSize = newSize;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getSourceUrl() {
		return this.sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
