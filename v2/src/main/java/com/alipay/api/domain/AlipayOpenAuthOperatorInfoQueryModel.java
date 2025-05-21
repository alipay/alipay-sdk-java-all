package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询蚂蚁操作员信息
 *
 * @author auto create
 * @since 1.0, 2025-04-27 14:28:13
 */
public class AlipayOpenAuthOperatorInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3327642344324895845L;

	/**
	 * 操作员查询参数
	 */
	@ApiField("operator_query")
	private OperatorQuery operatorQuery;

	/**
	 * 指定租户ID，新增值需联系蚂蚁操作员operator团队人工处理
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public OperatorQuery getOperatorQuery() {
		return this.operatorQuery;
	}
	public void setOperatorQuery(OperatorQuery operatorQuery) {
		this.operatorQuery = operatorQuery;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
