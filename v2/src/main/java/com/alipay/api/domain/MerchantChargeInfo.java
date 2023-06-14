package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询单据计费状态结果
 *
 * @author auto create
 * @since 1.0, 2023-01-12 15:19:57
 */
public class MerchantChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 4215123246415639352L;

	/**
	 * certify_id
	 */
	@ApiField("certify_id")
	private String certifyId;

	/**
	 * FAIL_NOT_CHARGE：该单据不符合计费规则，不进行计费；CHARGE：该单据符合计费规则，进行计费。
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 若查询的certifyId无效（数据库中没有记录），在响应的结构体里的errorCode返回INVALID_CERTIFY_ID。
	 */
	@ApiField("error_code")
	private String errorCode;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
