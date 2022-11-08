package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用例截图信息
 *
 * @author auto create
 * @since 1.0, 2022-09-21 14:47:25
 */
public class SlmArtifactInfo extends AlipayObject {

	private static final long serialVersionUID = 2119572286187967193L;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 图片大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 图片链接
	 */
	@ApiField("uri")
	private String uri;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
