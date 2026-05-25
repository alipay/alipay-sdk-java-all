package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 千问场景话费推荐OPENAPI
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:24:45
 */
public class AlipayCommerceAcommunicationMcpPhoneRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 2456766851684785621L;

	/**
	 * null
	 */
	@ApiListField("faces")
	@ApiField("string")
	private List<String> faces;

	/**
	 * 手机号格式
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景标识
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 子来源标识
	 */
	@ApiField("sub_source")
	private String subSource;

	public List<String> getFaces() {
		return this.faces;
	}
	public void setFaces(List<String> faces) {
		this.faces = faces;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSubSource() {
		return this.subSource;
	}
	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

}
