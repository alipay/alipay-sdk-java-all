package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据产品合约编号查询合同内容
 *
 * @author auto create
 * @since 1.0, 2023-05-12 11:32:15
 */
public class MybankCreditProdarrangementContracttextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7247571771556868975L;

	/**
	 * 业务编号，例如合约编号，贷款申请编号等
	 */
	@ApiField("bsn_no")
	private String bsnNo;

	/**
	 * 合同类型，枚举如下：LOAN：贷款合同类型，PRE_LOAN_INVESTIGATION : 贷前调查征信授权合同， POST_LOAN_MANAGEMENT : 贷后管理征信授权合同;
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 查询场景类型，例如根据业务单据号或者合约号来查询；
枚举如下：AR_NO：合约类型，BSN_NO：业务场景
	 */
	@ApiField("query_type")
	private String queryType;

	public String getBsnNo() {
		return this.bsnNo;
	}
	public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
	}

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
