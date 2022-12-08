package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.settle response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:36:39
 */
public class AlipayAssetPointVoucherprodBenefittemplateSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 2773288624338178566L;

	/** 
	 * 资产id，即结算的权益模板的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 资金单据流水id，权益结算平台的结算流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 实际结算的金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 当前结算状态，I：结算已受理，尚未划拨资金；S：划拨资金完成；C： 划拨资金失败
	 */
	@ApiField("status")
	private String status;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
