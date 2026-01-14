package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.asset.nftid.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:27
 */
public class AnttechNftAssetNftidCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3662935339272866465L;

	/** 
	 * 是否支持转增
	 */
	@ApiField("nft_enable_send")
	private Boolean nftEnableSend;

	/** 
	 * OWNING(1, "待持有")OWNED(2, "已持有"),RELEASING(3, "待释放"),RELEASED(4, "已释放"),CANCELLED(5, "已取消"),
	 */
	@ApiField("own_status")
	private Long ownStatus;

	/** 
	 * 流转时间，只有资产2或者3时才会有
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	public void setNftEnableSend(Boolean nftEnableSend) {
		this.nftEnableSend = nftEnableSend;
	}
	public Boolean getNftEnableSend( ) {
		return this.nftEnableSend;
	}

	public void setOwnStatus(Long ownStatus) {
		this.ownStatus = ownStatus;
	}
	public Long getOwnStatus( ) {
		return this.ownStatus;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Date getReceiveTime( ) {
		return this.receiveTime;
	}

}
