package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户三要素获取跳转商保码链接
 *
 * @author auto create
 * @since 1.0, 2025-10-29 17:33:20
 */
public class AlipayCommerceMedicalInsuranceUserskipQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6767175225557753951L;

	/**
	 * 证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 平安养老险
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 购买保司产品的企业ID，如：中国移动
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部平台/保司对应的用户id，用于和外部商户约定区分用户的唯一标识
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
