package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:34:25
 */
public class EvaluationOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7896723315473658994L;

	/**
	 * 申请名称
	 */
	@ApiField("apply_name")
	private String applyName;

	/**
	 * 登记时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 单据审核失败原因，非接口调用失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 单据状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 结果文件访问url
	 */
	@ApiField("result_file_url")
	private String resultFileUrl;

	public String getApplyName() {
		return this.applyName;
	}
	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getResultFileUrl() {
		return this.resultFileUrl;
	}
	public void setResultFileUrl(String resultFileUrl) {
		this.resultFileUrl = resultFileUrl;
	}

}
