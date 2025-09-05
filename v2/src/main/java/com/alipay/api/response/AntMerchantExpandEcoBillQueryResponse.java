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
 * @since 1.0, 2025-04-30 15:42:26
 */
public class AntMerchantExpandEcoBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8325668657254995745L;

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

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

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

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
