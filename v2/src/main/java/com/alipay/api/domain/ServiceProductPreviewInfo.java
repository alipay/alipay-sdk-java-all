package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务预览url
 *
 * @author auto create
 * @since 1.0, 2023-03-09 18:03:09
 */
public class ServiceProductPreviewInfo extends AlipayObject {

	private static final long serialVersionUID = 6882558385995525667L;

	/**
	 * 服务的拓展信息id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 预览图片地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 预览图片名称
	 */
	@ApiField("preview_url_name")
	private String previewUrlName;

	/**
	 * 服务产品id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getPreviewUrlName() {
		return this.previewUrlName;
	}
	public void setPreviewUrlName(String previewUrlName) {
		this.previewUrlName = previewUrlName;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
