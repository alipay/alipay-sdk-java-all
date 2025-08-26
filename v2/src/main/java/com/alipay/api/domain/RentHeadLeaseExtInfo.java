package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商首租相关信息
 *
 * @author auto create
 * @since 1.0, 2025-08-20 09:30:32
 */
public class RentHeadLeaseExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3633328756542927216L;

	/**
	 * 首租订单券后签约价，单位：元
	 */
	@ApiField("head_lease_after_coupon_price")
	private String headLeaseAfterCouponPrice;

	/**
	 * 首租订单买断价，单位：元
	 */
	@ApiField("head_lease_buyout_price")
	private String headLeaseBuyoutPrice;

	/**
	 * 首租订单历史逾期次数
	 */
	@ApiField("head_lease_max_overdue_count")
	private String headLeaseMaxOverdueCount;

	/**
	 * 首租订单历史最大逾期天数，单位：天
	 */
	@ApiField("head_lease_max_overdue_days")
	private String headLeaseMaxOverdueDays;

	/**
	 * 商户首租订单号
	 */
	@ApiField("head_lease_order_id")
	private String headLeaseOrderId;

	/**
	 * 首租订单券前签约价，单位：元
	 */
	@ApiField("head_lease_pre_coupon_price")
	private String headLeasePreCouponPrice;

	/**
	 * 首租协议
	 */
	@ApiField("head_lease_protocol")
	private RentFile headLeaseProtocol;

	/**
	 * 平台服务协议
	 */
	@ApiField("platform_service_protocol")
	private RentFile platformServiceProtocol;

	public String getHeadLeaseAfterCouponPrice() {
		return this.headLeaseAfterCouponPrice;
	}
	public void setHeadLeaseAfterCouponPrice(String headLeaseAfterCouponPrice) {
		this.headLeaseAfterCouponPrice = headLeaseAfterCouponPrice;
	}

	public String getHeadLeaseBuyoutPrice() {
		return this.headLeaseBuyoutPrice;
	}
	public void setHeadLeaseBuyoutPrice(String headLeaseBuyoutPrice) {
		this.headLeaseBuyoutPrice = headLeaseBuyoutPrice;
	}

	public String getHeadLeaseMaxOverdueCount() {
		return this.headLeaseMaxOverdueCount;
	}
	public void setHeadLeaseMaxOverdueCount(String headLeaseMaxOverdueCount) {
		this.headLeaseMaxOverdueCount = headLeaseMaxOverdueCount;
	}

	public String getHeadLeaseMaxOverdueDays() {
		return this.headLeaseMaxOverdueDays;
	}
	public void setHeadLeaseMaxOverdueDays(String headLeaseMaxOverdueDays) {
		this.headLeaseMaxOverdueDays = headLeaseMaxOverdueDays;
	}

	public String getHeadLeaseOrderId() {
		return this.headLeaseOrderId;
	}
	public void setHeadLeaseOrderId(String headLeaseOrderId) {
		this.headLeaseOrderId = headLeaseOrderId;
	}

	public String getHeadLeasePreCouponPrice() {
		return this.headLeasePreCouponPrice;
	}
	public void setHeadLeasePreCouponPrice(String headLeasePreCouponPrice) {
		this.headLeasePreCouponPrice = headLeasePreCouponPrice;
	}

	public RentFile getHeadLeaseProtocol() {
		return this.headLeaseProtocol;
	}
	public void setHeadLeaseProtocol(RentFile headLeaseProtocol) {
		this.headLeaseProtocol = headLeaseProtocol;
	}

	public RentFile getPlatformServiceProtocol() {
		return this.platformServiceProtocol;
	}
	public void setPlatformServiceProtocol(RentFile platformServiceProtocol) {
		this.platformServiceProtocol = platformServiceProtocol;
	}

}
