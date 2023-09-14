package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券信息vo
 *
 * @author auto create
 * @since 1.0, 2023-01-13 14:14:28
 */
public class OpenVoucherDTO extends AlipayObject {

	private static final long serialVersionUID = 2137582598382539659L;

	/**
	 * 可用金额，单位元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 折扣信息
	 */
	@ApiField("discount_info")
	private VcpDiscountInfo discountInfo;

	/**
	 * 拓展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 生效时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 过期时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 券产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 券状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 券核销规则信息
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券ID，全局唯一
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public VcpDiscountInfo getDiscountInfo() {
		return this.discountInfo;
	}
	public void setDiscountInfo(VcpDiscountInfo discountInfo) {
		this.discountInfo = discountInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
