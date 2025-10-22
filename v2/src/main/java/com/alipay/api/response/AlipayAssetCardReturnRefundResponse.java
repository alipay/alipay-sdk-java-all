package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.return.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayAssetCardReturnRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2811683312447395228L;

	/** 
	 * 账务操作时间
	 */
	@ApiField("account_dt")
	private Date accountDt;

	/** 
	 * 系统退卡订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 退卡资金，单位元，包含手续费
	 */
	@ApiField("return_amount")
	private String returnAmount;

	/** 
	 * 退款面额，单位元，包含手续费
	 */
	@ApiField("return_asset_amont")
	private String returnAssetAmont;

	/** 
	 * 退卡手续费资金，单位元
	 */
	@ApiField("return_fee_amount")
	private String returnFeeAmount;

	/** 
	 * 退卡手续费面额，单位元
	 */
	@ApiField("return_fee_asset_amount")
	private String returnFeeAssetAmount;

	public void setAccountDt(Date accountDt) {
		this.accountDt = accountDt;
	}
	public Date getAccountDt( ) {
		return this.accountDt;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}
	public String getReturnAmount( ) {
		return this.returnAmount;
	}

	public void setReturnAssetAmont(String returnAssetAmont) {
		this.returnAssetAmont = returnAssetAmont;
	}
	public String getReturnAssetAmont( ) {
		return this.returnAssetAmont;
	}

	public void setReturnFeeAmount(String returnFeeAmount) {
		this.returnFeeAmount = returnFeeAmount;
	}
	public String getReturnFeeAmount( ) {
		return this.returnFeeAmount;
	}

	public void setReturnFeeAssetAmount(String returnFeeAssetAmount) {
		this.returnFeeAssetAmount = returnFeeAssetAmount;
	}
	public String getReturnFeeAssetAmount( ) {
		return this.returnFeeAssetAmount;
	}

}
