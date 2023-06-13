package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技预付订单退费
 *
 * @author auto create
 * @since 1.0, 2019-07-08 21:12:04
 */
public class AlipayOpenOperationBizfeeAftechRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4813284426973335776L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 退费币种
币种数字编码。
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 费用订单号
	 */
	@ApiField("fee_order_no")
	private String feeOrderNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 退费金额
单位元，最多两位小数。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退费流水号
	 */
	@ApiField("refund_no")
	private String refundNo;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFeeOrderNo() {
		return this.feeOrderNo;
	}
	public void setFeeOrderNo(String feeOrderNo) {
		this.feeOrderNo = feeOrderNo;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundNo() {
		return this.refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
