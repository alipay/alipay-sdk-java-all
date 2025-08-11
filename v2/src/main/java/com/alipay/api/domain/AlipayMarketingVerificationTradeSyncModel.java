package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-02-28 15:35:48
 */
public class AlipayMarketingVerificationTradeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4357678615583173396L;

	/**
	 * SYNC：交易信息回传
VERIFY：核销信息上报
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 支付宝订单号，非必填，如撤销交易信息回传/核销上报，则需传入该参数
	 */
	@ApiField("alipay_refund_no")
	private String alipayRefundNo;

	/**
	 * 支付宝交易号，用于识别交易信息
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 本次同步的资格相关业务信息，相同交易号相同操作类型时，若业务参数一致则视为幂等重试，否则视为交易信息补传，将重新提交核验平台
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 交易/退款时间，格式： yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝分配的场景编码，用于识别活动场景及区域等信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAlipayRefundNo() {
		return this.alipayRefundNo;
	}
	public void setAlipayRefundNo(String alipayRefundNo) {
		this.alipayRefundNo = alipayRefundNo;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
