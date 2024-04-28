package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同磋商关联事项
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:15:35
 */
public class OpenApiRelateMatterDTO extends AlipayObject {

	private static final long serialVersionUID = 3754342682437318564L;

	/**
	 * 磋商合同编号
	 */
	@ApiField("consult_contract_code")
	private String consultContractCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 事项编码
	 */
	@ApiField("matter_code")
	private String matterCode;

	/**
	 * 事项名称
	 */
	@ApiField("matter_name")
	private String matterName;

	/**
	 * 外部合同编号
	 */
	@ApiField("out_contract_code")
	private String outContractCode;

	public String getConsultContractCode() {
		return this.consultContractCode;
	}
	public void setConsultContractCode(String consultContractCode) {
		this.consultContractCode = consultContractCode;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	public String getMatterName() {
		return this.matterName;
	}
	public void setMatterName(String matterName) {
		this.matterName = matterName;
	}

	public String getOutContractCode() {
		return this.outContractCode;
	}
	public void setOutContractCode(String outContractCode) {
		this.outContractCode = outContractCode;
	}

}
