package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁电子合同签署申请详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 14:11:17
 */
public class RentEcSignApplyInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4373324813287367823L;

	/**
	 * 申请签署合同的业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 本次申请包含电子合同列表
	 */
	@ApiListField("contracts")
	@ApiField("rent_ec_sign_contract_v_o")
	private List<RentEcSignContractVO> contracts;

	/**
	 * 申请受理状态
	 */
	@ApiField("status")
	private String status;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public List<RentEcSignContractVO> getContracts() {
		return this.contracts;
	}
	public void setContracts(List<RentEcSignContractVO> contracts) {
		this.contracts = contracts;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
