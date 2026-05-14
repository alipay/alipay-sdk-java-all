package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生核算
 *
 * @author auto create
 * @since 1.0, 2026-04-22 17:12:45
 */
public class AlipayCommerceMedicalHealthmanagemDoctorSettleModel extends AlipayObject {

	private static final long serialVersionUID = 8872883684313951292L;

	/**
	 * 医生核算的金额，精确到分，仅支持人民币
	 */
	@ApiField("bill_amount")
	private Long billAmount;

	/**
	 * 服务项结算明细单的编号，由健管履约服务项结算时传递
	 */
	@ApiField("finance_detail_no")
	private String financeDetailNo;

	/**
	 * 医生核算的时间
	 */
	@ApiField("gmt_service")
	private Date gmtService;

	/**
	 * 服务包中服务项配置的ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 服务项履约单号，由健管履约订单系统传递
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 服务包订单的单号，由健管履约订单系统传递
	 */
	@ApiField("package_order_no")
	private String packageOrderNo;

	public Long getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}

	public String getFinanceDetailNo() {
		return this.financeDetailNo;
	}
	public void setFinanceDetailNo(String financeDetailNo) {
		this.financeDetailNo = financeDetailNo;
	}

	public Date getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(Date gmtService) {
		this.gmtService = gmtService;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

	public String getPackageOrderNo() {
		return this.packageOrderNo;
	}
	public void setPackageOrderNo(String packageOrderNo) {
		this.packageOrderNo = packageOrderNo;
	}

}
