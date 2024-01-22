package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家门店信息
 *
 * @author auto create
 * @since 1.0, 2020-09-26 20:18:11
 */
public class MerchantShopInfo extends AlipayObject {

	private static final long serialVersionUID = 2241971339351129831L;

	/**
	 * 审核驳回原因
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 商家的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商家门店编码，可自定义，但必须唯一
	 */
	@ApiField("shop_no")
	private String shopNo;

	/**
	 * 门店状态，AUDITING:审核中，AUDIT_REJECT:审核驳回，VALID:已生效，UPDATING:更新中，INVALID:已失效
	 */
	@ApiField("shop_status")
	private String shopStatus;

	public String getAuditDesc() {
		return this.auditDesc;
	}
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
