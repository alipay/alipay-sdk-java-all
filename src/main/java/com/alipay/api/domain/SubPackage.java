package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分包信息
 *
 * @author auto create
 * @since 1.0, 2021-02-23 16:45:40
 */
public class SubPackage extends AlipayObject {

	private static final long serialVersionUID = 6562571634879852958L;

	/**
	 * 构建结果地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	/**
	 * 构建结果地址
	 */
	@ApiField("new_build_package_url")
	private String newBuildPackageUrl;

	/**
	 * 分包路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 源码地址
	 */
	@ApiField("source_url")
	private String sourceUrl;

	/**
	 * 分包的类型
	 */
	@ApiField("type")
	private String type;

	public String getBuildPackageUrl() {
		return this.buildPackageUrl;
	}
	public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}

	public String getNewBuildPackageUrl() {
		return this.newBuildPackageUrl;
	}
	public void setNewBuildPackageUrl(String newBuildPackageUrl) {
		this.newBuildPackageUrl = newBuildPackageUrl;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
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
