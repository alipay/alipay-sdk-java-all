package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改蚂蚁操作员信息
 *
 * @author auto create
 * @since 1.0, 2022-10-27 17:38:08
 */
public class AlipayOpenAuthOperatorInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7861842412791987153L;

	/**
	 * 操作员信息修改内容
	 */
	@ApiField("modify_vo")
	private OperatorModifyVO modifyVo;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 指定租户ID，新增值需联系蚂蚁操作员operator团队人工处理
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public OperatorModifyVO getModifyVo() {
		return this.modifyVo;
	}
	public void setModifyVo(OperatorModifyVO modifyVo) {
		this.modifyVo = modifyVo;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
