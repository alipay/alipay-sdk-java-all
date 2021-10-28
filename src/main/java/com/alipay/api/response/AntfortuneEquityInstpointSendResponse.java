package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:57
 */
public class AntfortuneEquityInstpointSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6483746786244747817L;

	/** 
	 * 积分发放流水，发放结果为true时，流水号可唯一索引本次发放记录
	 */
	@ApiField("point_trans_no")
	private String pointTransNo;

	/** 
	 * 积分发放结果，true：成功；false：失败
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	public void setPointTransNo(String pointTransNo) {
		this.pointTransNo = pointTransNo;
	}
	public String getPointTransNo( ) {
		return this.pointTransNo;
	}

	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}
	public Boolean getSendResult( ) {
		return this.sendResult;
	}

}
