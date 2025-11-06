package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RefundPaymentAssetInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 19:57:04
 */
public class AlipayCloudFundWalletOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279998623827146588L;

	/** 
	 * 实际交易金额，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/** 
	 * 交易最后处理时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/** 
	 * 退款明细
	 */
	@ApiListField("refund_payment_asset_infos")
	@ApiField("refund_payment_asset_infos")
	private List<RefundPaymentAssetInfos> refundPaymentAssetInfos;

	/** 
	 * 交易总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 交易状态
	 */
	@ApiField("trans_status")
	private String transStatus;

	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}
	public String getActualAmount( ) {
		return this.actualAmount;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	public String getExecuteTime( ) {
		return this.executeTime;
	}

	public void setRefundPaymentAssetInfos(List<RefundPaymentAssetInfos> refundPaymentAssetInfos) {
		this.refundPaymentAssetInfos = refundPaymentAssetInfos;
	}
	public List<RefundPaymentAssetInfos> getRefundPaymentAssetInfos( ) {
		return this.refundPaymentAssetInfos;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getTransStatus( ) {
		return this.transStatus;
	}

}
