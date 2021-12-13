package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货主创建物流金融的协议
 *
 * @author auto create
 * @since 1.0, 2020-01-03 14:04:37
 */
public class AnttechBlockchainFinanceMylogisticfinsysContractApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2222113917789849177L;

	/**
	 * 姓名
	 */
	@ApiField("contract_name")
	private String contractName;

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

}
