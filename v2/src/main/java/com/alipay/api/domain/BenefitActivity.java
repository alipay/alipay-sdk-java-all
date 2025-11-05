package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券权益以外的权益实体
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:02
 */
public class BenefitActivity extends AlipayObject {

	private static final long serialVersionUID = 1491415223891991374L;

	/**
	 * 群等权益的id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 入群有礼
	 */
	@ApiField("type")
	private String type;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
