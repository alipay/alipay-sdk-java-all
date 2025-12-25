package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公司基础信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CompanyBaseVO extends AlipayObject {

	private static final long serialVersionUID = 2318873719492814152L;

	/**
	 * 公司id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * OU代码
	 */
	@ApiField("ou_code")
	private String ouCode;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

}
