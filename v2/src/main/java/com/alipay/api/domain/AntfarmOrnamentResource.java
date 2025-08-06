package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁庄园装扮资源
 *
 * @author auto create
 * @since 1.0, 2024-04-24 09:56:52
 */
public class AntfarmOrnamentResource extends AlipayObject {

	private static final long serialVersionUID = 6342384752425443785L;

	/**
	 * 3d装扮资源信息
	 */
	@ApiField("resource_for_3_d")
	private String resourceFor3D;

	/**
	 * 2d装扮资源信息
	 */
	@ApiField("resource_for_spine")
	private String resourceForSpine;

	/**
	 * 2d装扮静态图资源
	 */
	@ApiField("resource_for_static_image")
	private String resourceForStaticImage;

	/**
	 * 蚂蚁庄园装扮资源key
	 */
	@ApiField("resource_key")
	private String resourceKey;

	public String getResourceFor3D() {
		return this.resourceFor3D;
	}
	public void setResourceFor3D(String resourceFor3D) {
		this.resourceFor3D = resourceFor3D;
	}

	public String getResourceForSpine() {
		return this.resourceForSpine;
	}
	public void setResourceForSpine(String resourceForSpine) {
		this.resourceForSpine = resourceForSpine;
	}

	public String getResourceForStaticImage() {
		return this.resourceForStaticImage;
	}
	public void setResourceForStaticImage(String resourceForStaticImage) {
		this.resourceForStaticImage = resourceForStaticImage;
	}

	public String getResourceKey() {
		return this.resourceKey;
	}
	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
	}

}
