package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌认证的结果
 *
 * @author auto create
 * @since 1.0, 2020-10-21 11:44:24
 */
public class MiniappBrandAuditResult extends AlipayObject {

	private static final long serialVersionUID = 8392198731466916429L;

	/**
	 * 小程序提交品牌认证时的品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 小程序提交品牌认证时的品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 小程序提交品牌认证后的认证状态
AUDITING(审核中)
AUDIT_PASS(审核通过)
AUDIT_REJECT(驳回审核)
INVALID(已失效)
NEAR_INVALID(即将过期失效)
CANCEL(取消认证)
NO_BRAND(未认证)
	 */
	@ApiField("brand_status")
	private String brandStatus;

	/**
	 * 小程序提交品牌认证是否认证成功
	 */
	@ApiField("has_brand")
	private String hasBrand;

	/**
	 * 失效原因
	 */
	@ApiField("invalid_reason")
	private String invalidReason;

	/**
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandStatus() {
		return this.brandStatus;
	}
	public void setBrandStatus(String brandStatus) {
		this.brandStatus = brandStatus;
	}

	public String getHasBrand() {
		return this.hasBrand;
	}
	public void setHasBrand(String hasBrand) {
		this.hasBrand = hasBrand;
	}

	public String getInvalidReason() {
		return this.invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
