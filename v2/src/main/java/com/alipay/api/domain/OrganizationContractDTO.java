package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OrganizationContractDTO
 *
 * @author auto create
 * @since 1.0, 2023-09-14 14:42:37
 */
public class OrganizationContractDTO extends AlipayObject {

	private static final long serialVersionUID = 1655565127621484227L;

	/**
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合同标题
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/**
	 * 生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 维保结束时间
	 */
	@ApiField("ma_end_time")
	private Date maEndTime;

	/**
	 * 维保开始时间
	 */
	@ApiField("ma_start_time")
	private Date maStartTime;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}
	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getMaEndTime() {
		return this.maEndTime;
	}
	public void setMaEndTime(Date maEndTime) {
		this.maEndTime = maEndTime;
	}

	public Date getMaStartTime() {
		return this.maStartTime;
	}
	public void setMaStartTime(Date maStartTime) {
		this.maStartTime = maStartTime;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
