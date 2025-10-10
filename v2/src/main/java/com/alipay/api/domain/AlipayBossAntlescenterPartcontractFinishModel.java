package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 半份签归档合同
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:28
 */
public class AlipayBossAntlescenterPartcontractFinishModel extends AlipayObject {

	private static final long serialVersionUID = 7671775583137391933L;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 上传的合同文件
	 */
	@ApiField("file_info")
	private AntlescenterFileDTO fileInfo;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public AntlescenterFileDTO getFileInfo() {
		return this.fileInfo;
	}
	public void setFileInfo(AntlescenterFileDTO fileInfo) {
		this.fileInfo = fileInfo;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
