package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 首租信息
 *
 * @author auto create
 * @since 1.0, 2025-08-20 21:37:35
 */
public class SellerSyncRentHeadLeaseExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7318818123136258632L;

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

}
