package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生态供应商账单明细
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:08:43
 */
public class AssetEcoBillDetail extends AlipayObject {

	private static final long serialVersionUID = 4617261838645949162L;

	/**
	 * 账单主体
	 */
	@ApiField("bill_entity")
	private String billEntity;

	/**
	 * 账单摘要编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 生态供应商订单维度账单明细
	 */
	@ApiListField("eco_order_bill_details")
	@ApiField("asset_eco_order_bill_detail")
	private List<AssetEcoOrderBillDetail> ecoOrderBillDetails;

	/**
	 * 账单月总金额，四舍五入保留两位小数，单位元
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 生态供应商店铺编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBillEntity() {
		return this.billEntity;
	}
	public void setBillEntity(String billEntity) {
		this.billEntity = billEntity;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public List<AssetEcoOrderBillDetail> getEcoOrderBillDetails() {
		return this.ecoOrderBillDetails;
	}
	public void setEcoOrderBillDetails(List<AssetEcoOrderBillDetail> ecoOrderBillDetails) {
		this.ecoOrderBillDetails = ecoOrderBillDetails;
	}

	public String getFeePrice() {
		return this.feePrice;
	}
	public void setFeePrice(String feePrice) {
		this.feePrice = feePrice;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
