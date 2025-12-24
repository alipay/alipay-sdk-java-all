package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas语音推送接口
 *
 * @author auto create
 * @since 1.0, 2025-02-28 17:22:47
 */
public class AlipayCommerceTransportNdeviceResourceSendModel extends AlipayObject {

	private static final long serialVersionUID = 2582237498745619674L;

	/**
	 * n设备交互配置类型
	 */
	@ApiField("release_type")
	private String releaseType;

	/**
	 * saas平台的渠道来源
	 */
	@ApiField("resource_channel")
	private String resourceChannel;

	/**
	 * 推送资源唯一标识
	 */
	@ApiField("resource_tag")
	private String resourceTag;

	/**
	 * sn设备SN
	 */
	@ApiField("sn")
	private String sn;

	public String getReleaseType() {
		return this.releaseType;
	}
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	public String getResourceChannel() {
		return this.resourceChannel;
	}
	public void setResourceChannel(String resourceChannel) {
		this.resourceChannel = resourceChannel;
	}

	public String getResourceTag() {
		return this.resourceTag;
	}
	public void setResourceTag(String resourceTag) {
		this.resourceTag = resourceTag;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
