package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询代运营授权或者账号绑定二维码
 *
 * @author auto create
 * @since 1.0, 2021-01-21 21:43:45
 */
public class AlipayOpenSpOperationQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8716683743975611921L;

	/**
	 * 接入的产品编号。
操作类型为绑定的，填OPENAPI_BIND_DEFAULT;
操作类型为授权的，填OPENAPI_AUTH_DEFAULT
	 */
	@ApiField("access_product_code")
	private String accessProductCode;

	/**
	 * 支付宝登录账号。通常为手机号或者邮箱。
若代运营商户为直连才需要填，merchant_no和alipay_account不能同时为空，优先取merchant_no。
若代运营商户为间连，该字段无需填写。
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 支付宝商户号。间直连商户都支持，特别注意仅支持2088开头的间连商户。若被代运营者是间连商户，则merchant_no必填；若为直连商户，则merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 代运营操作类型。取值如下
ACCOUNT_BIND：账号绑定；仅对于间连商户
OPERATION_AUTH：代运营授权。支持间直连商户
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部操作流水。每次操作需要确保唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAccessProductCode() {
		return this.accessProductCode;
	}
	public void setAccessProductCode(String accessProductCode) {
		this.accessProductCode = accessProductCode;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
