package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用AE提前收款通用扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:12:17
 */
public class ZmEpAePrepayExtParam extends AlipayObject {

	private static final long serialVersionUID = 3153624234445779391L;

	/**
	 * 审核单创建时间戳
	 */
	@ApiField("gmt_audit")
	private String gmtAudit;

	/**
	 * 订单支付时间戳
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 订单发货时间戳
	 */
	@ApiField("ship_time")
	private String shipTime;

	/**
	 * 站点信息
	 */
	@ApiField("tenant_site")
	private String tenantSite;

	public String getGmtAudit() {
		return this.gmtAudit;
	}
	public void setGmtAudit(String gmtAudit) {
		this.gmtAudit = gmtAudit;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getShipTime() {
		return this.shipTime;
	}
	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

	public String getTenantSite() {
		return this.tenantSite;
	}
	public void setTenantSite(String tenantSite) {
		this.tenantSite = tenantSite;
	}

}
