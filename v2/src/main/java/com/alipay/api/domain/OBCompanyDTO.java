package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OB企业信息
 *
 * @author auto create
 * @since 1.0, 2024-01-02 19:48:10
 */
public class OBCompanyDTO extends AlipayObject {

	private static final long serialVersionUID = 7362461873288221179L;

	/**
	 * 合同列表
	 */
	@ApiListField("contract_list")
	@ApiField("o_b_contract_d_t_o")
	private List<OBContractDTO> contractList;

	/**
	 * 企业id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 企业实体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 维保校验状态
	 */
	@ApiField("ma_check_status")
	private Long maCheckStatus;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 工单权限
	 */
	@ApiField("work_order_permission")
	private Boolean workOrderPermission;

	public List<OBContractDTO> getContractList() {
		return this.contractList;
	}
	public void setContractList(List<OBContractDTO> contractList) {
		this.contractList = contractList;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Long getMaCheckStatus() {
		return this.maCheckStatus;
	}
	public void setMaCheckStatus(Long maCheckStatus) {
		this.maCheckStatus = maCheckStatus;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public Boolean getWorkOrderPermission() {
		return this.workOrderPermission;
	}
	public void setWorkOrderPermission(Boolean workOrderPermission) {
		this.workOrderPermission = workOrderPermission;
	}

}
