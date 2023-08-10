package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:05
 */
public class SupplierVO extends AlipayObject {

	private static final long serialVersionUID = 2319149861811134679L;

	/**
	 * 生效状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 快餐
	 */
	@ApiField("business_desc")
	private String businessDesc;

	/**
	 * 供应商附加信息，LICENSE_NO:许可证号,LICENSE_DATE:营业执照有效期,PAYMENT_DAYS:账期
	 */
	@ApiField("certificate_desc")
	private String certificateDesc;

	/**
	 * 供货商简码
	 */
	@ApiField("short_code")
	private String shortCode;

	/**
	 * 供货商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 张三
	 */
	@ApiField("supplier_name")
	private String supplierName;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBusinessDesc() {
		return this.businessDesc;
	}
	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public String getCertificateDesc() {
		return this.certificateDesc;
	}
	public void setCertificateDesc(String certificateDesc) {
		this.certificateDesc = certificateDesc;
	}

	public String getShortCode() {
		return this.shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
