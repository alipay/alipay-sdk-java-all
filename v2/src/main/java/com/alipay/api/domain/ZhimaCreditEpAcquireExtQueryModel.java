package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付收单商家明细数据查询_增强版
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:07:48
 */
public class ZhimaCreditEpAcquireExtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2585535221527432911L;

	/**
	 * 授权单号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 商户请求ID（需要唯一，有幂等校验）
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 经营者证件号（ sha256 加密）
	 */
	@ApiField("person_cert_no_sha_256")
	private String personCertNoSha256;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企业注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 入参类型（企业入参：企业KEY三选一必填，建议统代>注册号>企业名称；经营者入参：法人证件号SHA256加密的密文必填））
	 */
	@ApiField("type")
	private String type;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getPersonCertNoSha256() {
		return this.personCertNoSha256;
	}
	public void setPersonCertNoSha256(String personCertNoSha256) {
		this.personCertNoSha256 = personCertNoSha256;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
