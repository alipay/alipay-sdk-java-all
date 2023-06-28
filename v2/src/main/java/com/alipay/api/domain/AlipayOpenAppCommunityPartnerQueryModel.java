package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区关系查询
 *
 * @author auto create
 * @since 1.0, 2020-06-22 16:26:29
 */
public class AlipayOpenAppCommunityPartnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4426723938161636294L;

	/**
	 * 关系类型
	 */
	@ApiField("rela_type")
	private String relaType;

	/**
	 * 源对象id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 对象类型id（例如支付宝user_id）
	 */
	@ApiField("target_id")
	private String targetId;

	public String getRelaType() {
		return this.relaType;
	}
	public void setRelaType(String relaType) {
		this.relaType = relaType;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
