package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单列表
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:57:54
 */
public class ThirdPartyRefundExceptionOrderList extends AlipayObject {

	private static final long serialVersionUID = 1655829423365983455L;

	/**
	 * null
	 */
	@ApiListField("certificate_id_list")
	@ApiField("string")
	private List<String> certificateIdList;

	/**
	 * 请求退款时，商家提供的拒绝退款原因
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 退款超24h未完成处理，出现异常的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 平台订单号
	 */
	@ApiField("platform_order_no")
	private String platformOrderNo;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 退款金额(单位元)
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 用户发起退款时间
	 */
	@ApiField("refund_apply_time")
	private Date refundApplyTime;

	/**
	 * 退款状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订单退款异常产生的任务id，请记录此id，用于「三方码异常订单退款」接口中推进退款；一笔订单可能有多个任务id，请根据退款任务中的凭证清单判断是否推进退款
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 支付交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public List<String> getCertificateIdList() {
		return this.certificateIdList;
	}
	public void setCertificateIdList(List<String> certificateIdList) {
		this.certificateIdList = certificateIdList;
	}

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getPlatformOrderNo() {
		return this.platformOrderNo;
	}
	public void setPlatformOrderNo(String platformOrderNo) {
		this.platformOrderNo = platformOrderNo;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundApplyTime() {
		return this.refundApplyTime;
	}
	public void setRefundApplyTime(Date refundApplyTime) {
		this.refundApplyTime = refundApplyTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
