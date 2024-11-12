package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放咨询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-22 15:26:10
 */
public class PublishConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 3229447629958382515L;

	/**
	 * 权益数额，如果是金额类型则单位是分，如果是数量类型则单位是个
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 实体id，如类目id、券id、模板id等
	 */
	@ApiField("entity_id")
	private String entityId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

}
