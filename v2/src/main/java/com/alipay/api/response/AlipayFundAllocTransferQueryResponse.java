package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:06:50
 */
public class AlipayFundAllocTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2179375259562178341L;

	/** 
	 * 分佣的转账时间
	 */
	@ApiField("alloc_time")
	private Date allocTime;

	/** 
	 * 分佣金额或退款金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 正向分佣：PAY；
逆向退分佣：REVERSE
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 分佣凭证单号
	 */
	@ApiField("certification_no")
	private String certificationNo;

	/** 
	 * 凭证类型，用来确定certification_no代表的具体业务语义
	 */
	@ApiField("certification_type")
	private String certificationType;

	/** 
	 * 分佣单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 正向分佣请求的外部单号 或 逆向退分佣请求的外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 转账状态：FINISHED - 成功
	 */
	@ApiField("status")
	private String status;

	public void setAllocTime(Date allocTime) {
		this.allocTime = allocTime;
	}
	public Date getAllocTime( ) {
		return this.allocTime;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCertificationNo(String certificationNo) {
		this.certificationNo = certificationNo;
	}
	public String getCertificationNo( ) {
		return this.certificationNo;
	}

	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}
	public String getCertificationType( ) {
		return this.certificationType;
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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
