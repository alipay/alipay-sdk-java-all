package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻四方聚合支付商家数据服务实时版
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:23:23
 */
public class ZhimaCreditEpPasyncQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3585328243246427644L;

	/**
	 * 授权单号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 经营者信息（经营者证件号（ sha256 加密））
	 */
	@ApiField("business_person")
	private String businessPerson;

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
	 * 入参类型（企业入参：企业KEY三选一必填，建议统代>注册号>企业名称；经营者入参：经营者信息必填）
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

	public String getBusinessPerson() {
		return this.businessPerson;
	}
	public void setBusinessPerson(String businessPerson) {
		this.businessPerson = businessPerson;
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
