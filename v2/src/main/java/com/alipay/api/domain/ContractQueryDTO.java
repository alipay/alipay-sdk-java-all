package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同查询结果DTO
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:31:39
 */
public class ContractQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 6851373332311722455L;

	/**
	 * 业务系统编号（置业平台合同号）
	 */
	@ApiField("bussiness_number")
	private String bussinessNumber;

	/**
	 * 合同附件，允许多个
	 */
	@ApiListField("contract_attaches")
	@ApiField("contract_attach_d_t_o")
	private List<ContractAttachDTO> contractAttaches;

	/**
	 * 合同中心合同号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同正本，只允许一个
	 */
	@ApiField("contract_doc")
	private ContractAttachDTO contractDoc;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 用印数据标识
	 */
	@ApiField("imprint_id")
	private String imprintId;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 合同状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBussinessNumber() {
		return this.bussinessNumber;
	}
	public void setBussinessNumber(String bussinessNumber) {
		this.bussinessNumber = bussinessNumber;
	}

	public List<ContractAttachDTO> getContractAttaches() {
		return this.contractAttaches;
	}
	public void setContractAttaches(List<ContractAttachDTO> contractAttaches) {
		this.contractAttaches = contractAttaches;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public ContractAttachDTO getContractDoc() {
		return this.contractDoc;
	}
	public void setContractDoc(ContractAttachDTO contractDoc) {
		this.contractDoc = contractDoc;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getImprintId() {
		return this.imprintId;
	}
	public void setImprintId(String imprintId) {
		this.imprintId = imprintId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
