package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同磋商文件DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-06 17:55:12
 */
public class OpenApiContractFileDTO extends AlipayObject {

	private static final long serialVersionUID = 8386229348832426573L;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合同定稿状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 文件类型
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 磋商合同卡片code
	 */
	@ApiField("matter_contract_code")
	private String matterContractCode;

	/**
	 * 合同分组号
	 */
	@ApiField("num")
	private String num;

	/**
	 * 合同文件子合同
	 */
	@ApiListField("sub_contract_file_results")
	@ApiField("open_api_sub_contract_file_d_t_o")
	private List<OpenApiSubContractFileDTO> subContractFileResults;

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getMatterContractCode() {
		return this.matterContractCode;
	}
	public void setMatterContractCode(String matterContractCode) {
		this.matterContractCode = matterContractCode;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public List<OpenApiSubContractFileDTO> getSubContractFileResults() {
		return this.subContractFileResults;
	}
	public void setSubContractFileResults(List<OpenApiSubContractFileDTO> subContractFileResults) {
		this.subContractFileResults = subContractFileResults;
	}

}
