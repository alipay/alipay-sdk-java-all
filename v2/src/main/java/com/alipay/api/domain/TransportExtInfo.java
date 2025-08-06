package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行相关扩展信息展示
 *
 * @author auto create
 * @since 1.0, 2025-05-29 15:07:45
 */
public class TransportExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3329439547121524931L;

	/**
	 * 扩展信息里的具体字段描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 补充信息的展示，例如城市名称
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
