package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetEcoOrderBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-01 14:12:04
 */
public class AntMerchantExpandEcoOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7518512448146312791L;

	/** 
	 * 出账日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 生态供应商订单维度账单明细
	 */
	@ApiListField("eco_order_bill_details")
	@ApiField("asset_eco_order_bill_detail")
	private List<AssetEcoOrderBillDetail> ecoOrderBillDetails;

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setEcoOrderBillDetails(List<AssetEcoOrderBillDetail> ecoOrderBillDetails) {
		this.ecoOrderBillDetails = ecoOrderBillDetails;
	}
	public List<AssetEcoOrderBillDetail> getEcoOrderBillDetails( ) {
		return this.ecoOrderBillDetails;
	}

}
