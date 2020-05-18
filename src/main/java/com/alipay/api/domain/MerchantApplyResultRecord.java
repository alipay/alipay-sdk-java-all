package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户入驻申请单认证、审核详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class MerchantApplyResultRecord extends AlipayObject {

	private static final long serialVersionUID = 3894533492322192174L;

	/**
	 * 签约产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 如审核失败，表示该字段引发的审核失败
	 */
	@ApiField("prop_input_key")
	private String propInputKey;

	/**
	 * 认证、产品签约审核失败原因
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 认证审核、产品签约审核状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * 详情类型，CETIFY为认证，PROD为产品签约，COMMENT为认证审核批注
	 */
	@ApiField("result_type")
	private String resultType;

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getPropInputKey() {
		return this.propInputKey;
	}
	public void setPropInputKey(String propInputKey) {
		this.propInputKey = propInputKey;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public String getResultType() {
		return this.resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

}
