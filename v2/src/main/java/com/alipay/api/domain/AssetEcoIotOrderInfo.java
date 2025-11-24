package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态供应商音箱订单明细
 *
 * @author auto create
 * @since 1.0, 2025-11-13 10:20:38
 */
public class AssetEcoIotOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 5186749733712654396L;

	/**
	 * 申请日期
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请单ID
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 首次绑定日期
	 */
	@ApiField("first_bind_date")
	private String firstBindDate;

	/**
	 * 是否激活 1已激活，0未激活，2超时未激活终态
	 */
	@ApiField("is_active")
	private String isActive;

	/**
	 * 是否可返佣 1是，0否，2超时不可返佣终态
	 */
	@ApiField("is_rebate_eligible")
	private String isRebateEligible;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * sn码
	 */
	@ApiField("sn")
	private String sn;

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getFirstBindDate() {
		return this.firstBindDate;
	}
	public void setFirstBindDate(String firstBindDate) {
		this.firstBindDate = firstBindDate;
	}

	public String getIsActive() {
		return this.isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsRebateEligible() {
		return this.isRebateEligible;
	}
	public void setIsRebateEligible(String isRebateEligible) {
		this.isRebateEligible = isRebateEligible;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
