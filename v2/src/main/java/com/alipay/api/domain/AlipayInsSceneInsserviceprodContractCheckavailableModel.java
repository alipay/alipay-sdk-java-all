package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁保险服务平台服务合约有效性查询接口
 *
 * @author auto create
 * @since 1.0, 2023-06-09 18:03:34
 */
public class AlipayInsSceneInsserviceprodContractCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 6192289548182922993L;

	/**
	 * 支付宝的服务合约编号
(服务出单接口中携带的那个)
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

}
