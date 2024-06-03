package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayInstEquitySendResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.payinst.equity.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-23 17:21:57
 */
public class AnttechMorseMarketingPayinstEquitySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4563789681665434294L;

	/** 
	 * 蚂蚁侧返回的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 权益发放结果详情
	 */
	@ApiListField("result_details")
	@ApiField("pay_inst_equity_send_result")
	private List<PayInstEquitySendResult> resultDetails;

	/** 
	 * 发放成功后生成的发放凭证号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/** 
	 * 全部成功返回true，有任何失败返回false
	 */
	@ApiField("send_success")
	private Boolean sendSuccess;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setResultDetails(List<PayInstEquitySendResult> resultDetails) {
		this.resultDetails = resultDetails;
	}
	public List<PayInstEquitySendResult> getResultDetails( ) {
		return this.resultDetails;
	}

	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}
	public String getSendOrderId( ) {
		return this.sendOrderId;
	}

	public void setSendSuccess(Boolean sendSuccess) {
		this.sendSuccess = sendSuccess;
	}
	public Boolean getSendSuccess( ) {
		return this.sendSuccess;
	}

}
