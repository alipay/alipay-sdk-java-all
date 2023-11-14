package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交付项目下的制品信息
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:26:57
 */
public class DeliveryProjectArtifactDTO extends AlipayObject {

	private static final long serialVersionUID = 8492987866185186171L;

	/**
	 * 制品全称
	 */
	@ApiField("fullname")
	private String fullname;

	/**
	 * 主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 制品来源
	 */
	@ApiField("source")
	private String source;

	public String getFullname() {
		return this.fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
