package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁操作员状态修改
 *
 * @author auto create
 * @since 1.0, 2022-10-27 17:37:43
 */
public class AlipayOpenAuthOperatorStateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2894859548611836381L;

	/**
	 * 修改动作。取值如下：
FREEZE=冻结操作员
UNFREEZE=解冻操作员
DELETE=删除操作员
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作员ID列表。一次最多20个
	 */
	@ApiListField("operator_ids")
	@ApiField("string")
	private List<String> operatorIds;

	/**
	 * 指定租户ID，新增值需联系蚂蚁操作员operator团队人工处理
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getOperatorIds() {
		return this.operatorIds;
	}
	public void setOperatorIds(List<String> operatorIds) {
		this.operatorIds = operatorIds;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
