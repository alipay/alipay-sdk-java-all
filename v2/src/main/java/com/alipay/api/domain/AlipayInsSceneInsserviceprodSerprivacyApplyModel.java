package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务平台服务商虚拟号申请
 *
 * @author auto create
 * @since 1.0, 2025-03-07 11:38:35
 */
public class AlipayInsSceneInsserviceprodSerprivacyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5632583319457321986L;

	/**
	 * 蚂蚁服务申请单号
	 */
	@ApiField("apply_order_no")
	private String applyOrderNo;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 请求咨询因子
	 */
	@ApiListField("consult_factor_list")
	@ApiField("service_consult_factor")
	private List<ServiceConsultFactor> consultFactorList;

	/**
	 * 蚂蚁服务合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 请求流水号，每次请求需保持唯一，长度<128
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getApplyOrderNo() {
		return this.applyOrderNo;
	}
	public void setApplyOrderNo(String applyOrderNo) {
		this.applyOrderNo = applyOrderNo;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<ServiceConsultFactor> getConsultFactorList() {
		return this.consultFactorList;
	}
	public void setConsultFactorList(List<ServiceConsultFactor> consultFactorList) {
		this.consultFactorList = consultFactorList;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
