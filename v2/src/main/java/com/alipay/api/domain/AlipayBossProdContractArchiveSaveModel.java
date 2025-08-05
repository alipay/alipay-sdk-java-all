package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同归档接口
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:40:19
 */
public class AlipayBossProdContractArchiveSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5791162374232937319L;

	/**
	 * 合同号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同文件
	 */
	@ApiListField("contract_files")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> contractFiles;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 业务幂等键，由业务自行决定
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public List<OpenApiContractFileSaDTO> getContractFiles() {
		return this.contractFiles;
	}
	public void setContractFiles(List<OpenApiContractFileSaDTO> contractFiles) {
		this.contractFiles = contractFiles;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
