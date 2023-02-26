package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 唯一信息
 *
 * @author auto create
 * @since 1.0, 2022-11-24 16:25:58
 */
public class VcpUniqueInfo extends AlipayObject {

	private static final long serialVersionUID = 2491552489762291333L;

	/**
	 * 根据unique_type决定入参类型
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 唯一ID类型
	 */
	@ApiField("unique_type")
	private String uniqueType;

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUniqueType() {
		return this.uniqueType;
	}
	public void setUniqueType(String uniqueType) {
		this.uniqueType = uniqueType;
	}

}
