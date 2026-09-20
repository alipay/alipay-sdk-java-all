package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部场景商户信息
 *
 * @author auto create
 * @since 1.0, 2026-09-02 14:23:21
 */
public class ExternalScenariosMerchantDTO extends AlipayObject {

	private static final long serialVersionUID = 4254419623814169225L;

	/**
	 * 商户的支付宝登录号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户的支付宝PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商户统一社会信用代码
	 */
	@ApiField("merchant_uscc")
	private String merchantUscc;

	/**
	 * 在支付宝完成进件的二级商户ID，需和商户主体身份一致
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMerchantUscc() {
		return this.merchantUscc;
	}
	public void setMerchantUscc(String merchantUscc) {
		this.merchantUscc = merchantUscc;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
