package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生态供应商订单维度账单明细
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:08:43
 */
public class AssetEcoOrderBillDetail extends AlipayObject {

	private static final long serialVersionUID = 1457496213417941688L;

	/**
	 * 实际情况下订单结算费用总金额 （单位元，四舍五入两位小数）
	 */
	@ApiField("actual_fee_price")
	private String actualFeePrice;

	/**
	 * 账单主体
	 */
	@ApiField("bill_entity")
	private String billEntity;

	/**
	 * 账单状态
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 生态供应商外部订单号交易平台
	 */
	@ApiField("busi_platform")
	private String busiPlatform;

	/**
	 * 50.40
	 */
	@ApiField("correct_fee_price")
	private String correctFeePrice;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 生态供应商订单费用明细
	 */
	@ApiListField("eco_fee_details")
	@ApiField("asset_eco_fee_detail")
	private List<AssetEcoFeeDetail> ecoFeeDetails;

	/**
	 * 供应链平台生态平台订单号
	 */
	@ApiField("eco_order_id")
	private String ecoOrderId;

	/**
	 * 下单时间
	 */
	@ApiField("order_date")
	private String orderDate;

	/**
	 * 生态供应商外部交易平台订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 生态供应商店铺编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 不可结算原因，若bill_status=结算状态UN_BILL，则该项不为空
	 */
	@ApiField("unbill_reason")
	private String unbillReason;

	public String getActualFeePrice() {
		return this.actualFeePrice;
	}
	public void setActualFeePrice(String actualFeePrice) {
		this.actualFeePrice = actualFeePrice;
	}

	public String getBillEntity() {
		return this.billEntity;
	}
	public void setBillEntity(String billEntity) {
		this.billEntity = billEntity;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBusiPlatform() {
		return this.busiPlatform;
	}
	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}

	public String getCorrectFeePrice() {
		return this.correctFeePrice;
	}
	public void setCorrectFeePrice(String correctFeePrice) {
		this.correctFeePrice = correctFeePrice;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public List<AssetEcoFeeDetail> getEcoFeeDetails() {
		return this.ecoFeeDetails;
	}
	public void setEcoFeeDetails(List<AssetEcoFeeDetail> ecoFeeDetails) {
		this.ecoFeeDetails = ecoFeeDetails;
	}

	public String getEcoOrderId() {
		return this.ecoOrderId;
	}
	public void setEcoOrderId(String ecoOrderId) {
		this.ecoOrderId = ecoOrderId;
	}

	public String getOrderDate() {
		return this.orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getUnbillReason() {
		return this.unbillReason;
	}
	public void setUnbillReason(String unbillReason) {
		this.unbillReason = unbillReason;
	}

}
