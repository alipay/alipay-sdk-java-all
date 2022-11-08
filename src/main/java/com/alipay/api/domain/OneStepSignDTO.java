package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约处理结果
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:20
 */
public class OneStepSignDTO extends AlipayObject {

	private static final long serialVersionUID = 4615813264793924688L;

	/**
	 * 业务单据唯一回执单号
	 */
	@ApiField("biz_accept_voucher_id")
	private String bizAcceptVoucherId;

	/**
	 * 合同中心生成的合同编号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 签约方式
	 */
	@ApiField("contract_sign_type")
	private String contractSignType;

	/**
	 * 签约实例ID，签约系统返回的唯一ID
	 */
	@ApiField("sign_instant_id")
	private String signInstantId;

	public String getBizAcceptVoucherId() {
		return this.bizAcceptVoucherId;
	}
	public void setBizAcceptVoucherId(String bizAcceptVoucherId) {
		this.bizAcceptVoucherId = bizAcceptVoucherId;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractSignType() {
		return this.contractSignType;
	}
	public void setContractSignType(String contractSignType) {
		this.contractSignType = contractSignType;
	}

	public String getSignInstantId() {
		return this.signInstantId;
	}
	public void setSignInstantId(String signInstantId) {
		this.signInstantId = signInstantId;
	}

}
