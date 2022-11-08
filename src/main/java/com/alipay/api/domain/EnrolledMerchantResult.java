package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消百万小店项目商家活动批量修改结果
 *
 * @author auto create
 * @since 1.0, 2022-04-28 14:36:15
 */
public class EnrolledMerchantResult extends AlipayObject {

	private static final long serialVersionUID = 2498877911848639595L;

	/**
	 * 商家维度错误码,
MERCHANT_NO_EXIST,
MERCHANT_NO_ENROLL,
MERCHANT_UNDER_RISK_CONTROL
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 商家维度错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 商户pid，唯一标识，最大10个
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 修改结果
	 */
	@ApiField("result")
	private String result;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
