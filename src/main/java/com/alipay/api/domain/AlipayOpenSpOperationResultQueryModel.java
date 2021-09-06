package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务商代运营操作结果
 *
 * @author auto create
 * @since 1.0, 2021-01-01 13:24:40
 */
public class AlipayOpenSpOperationResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8511972233865295791L;

	/**
	 * 接入的产品编号。未传batch_no时必填，枚举如下：
OPENAPI_BIND_DEFAULT：操作类型为账号绑定；
OPENAPI_AUTH_DEFAULT：操作类型为代运营授权。
	 */
	@ApiField("access_product_code")
	private String accessProductCode;

	/**
	 * 支付宝登录账号，通常为手机号或者邮箱。未传batch_no时需注意：
1.当查询merchant_no为间连商户时：
  * 若 operate_type=ACCOUNT_BIND，则alipay_account必填。
  * 若 operate_type=OPERATION_AUTH，则alipay_account无需传入。
2.当查询merchant_no为直连商户时：
  * merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 支付宝操作批次号。
batch_no提供基于操作批次的精确查询，只查询本操作批次的代运营操作结果，不反映最终代运营操作结果。
注意：
1.access_product_code、merchant_no、alipay_account三个参数组合与传入 batch_no 为两种查询方式，不可同时为空且以 batch_no 优先。
2.access_product_code、merchant_no、alipay_account三个参数组合可以查询最终代运营操作结果。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 支付宝商户号。支持间连、直连商户，值为2088开头。
未传batch_no时需注意：
若查询间连商户则 merchant_no 必填； 
若查询直连商户，则merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 代运营操作类型。取值如下 ACCOUNT_BIND：账号绑定； OPERATION_AUTH：代运营授权。
	 */
	@ApiField("operate_type")
	private String operateType;

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

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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

}
