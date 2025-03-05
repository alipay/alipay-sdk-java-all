package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetEcoBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-07 17:32:22
 */
public class AntMerchantExpandEcoBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4265343693675946635L;

	/** 
	 * 出账日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 生态供应商账单明细
	 */
	@ApiListField("eco_bill_details")
	@ApiField("asset_eco_bill_detail")
	private List<AssetEcoBillDetail> ecoBillDetails;

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setEcoBillDetails(List<AssetEcoBillDetail> ecoBillDetails) {
		this.ecoBillDetails = ecoBillDetails;
	}
	public List<AssetEcoBillDetail> getEcoBillDetails( ) {
		return this.ecoBillDetails;
	}

}
