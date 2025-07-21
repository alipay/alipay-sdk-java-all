package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态ISV申请二维码接口
 *
 * @author auto create
 * @since 1.0, 2024-11-04 19:32:20
 */
public class AntMerchantExpandEcoQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1367744918194376998L;

	/**
	 * 支付宝物料通码code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 参数是用于发码时的幂等校验，如果参数相同则会发相同的码
	 */
	@ApiField("idempotent_num")
	private String idempotentNum;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getIdempotentNum() {
		return this.idempotentNum;
	}
	public void setIdempotentNum(String idempotentNum) {
		this.idempotentNum = idempotentNum;
	}

}
