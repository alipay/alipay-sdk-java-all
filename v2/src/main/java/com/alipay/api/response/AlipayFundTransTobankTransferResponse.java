package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.tobank.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayFundTransTobankTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3499347547846378216L;

	/** 
	 * 预计到账时间，格式为yyyy-MM-ddHH:mm:ss，转账受理失败不返回。
仅在进入提现流程时提供。
请求正在等待处理时将不返回此值。
此参数为预计时间，可能与实际到账时间有较大误差，不能作为实际到账时间使用，仅供参考用途。
	 */
	@ApiField("arrival_time_end")
	private String arrivalTimeEnd;

	/** 
	 * 支付宝转账单据号，成功一定返回，失败可能不返回也可能返回。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 发起转账来源方定义的转账单据号。
请求时对应的参数，原样返回。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setArrivalTimeEnd(String arrivalTimeEnd) {
		this.arrivalTimeEnd = arrivalTimeEnd;
	}
	public String getArrivalTimeEnd( ) {
		return this.arrivalTimeEnd;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
