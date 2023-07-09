package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.account.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:31:57
 */
public class AlipaySocialAntforestAccountTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3569219885349591622L;

	/** 
	 * 业务完成的时间，即单据的流水号生成时间，业务方可与transfer_id一同存储，后续账账核对的时候可以用于解决跨天问题
	 */
	@ApiField("biz_time")
	private String bizTime;

	/** 
	 * 转账之后用户现有账户的剩余可用能量
	 */
	@ApiField("current_energy")
	private Long currentEnergy;

	/** 
	 * 用于表示用户一次转账的相关单据号，可通过该单据进行能量账户的退款操作（逆向转移），可能会需要下游进行存储
	 */
	@ApiField("transfer_id")
	private String transferId;

	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}
	public String getBizTime( ) {
		return this.bizTime;
	}

	public void setCurrentEnergy(Long currentEnergy) {
		this.currentEnergy = currentEnergy;
	}
	public Long getCurrentEnergy( ) {
		return this.currentEnergy;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getTransferId( ) {
		return this.transferId;
	}

}
