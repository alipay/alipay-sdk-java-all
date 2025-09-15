package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产险服务平台查询服务状态
 *
 * @author auto create
 * @since 1.0, 2025-06-20 14:26:02
 */
public class AlipayInsSceneServiceAvailableQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8287617112568311124L;

	/**
	 * 蚂蚁服务合约编号
	 */
	@ApiField("ser_contract_no")
	private String serContractNo;

	public String getSerContractNo() {
		return this.serContractNo;
	}
	public void setSerContractNo(String serContractNo) {
		this.serContractNo = serContractNo;
	}

}
