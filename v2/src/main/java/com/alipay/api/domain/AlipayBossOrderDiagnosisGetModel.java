package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单诊断服务
 *
 * @author auto create
 * @since 1.0, 2019-04-17 16:56:42
 */
public class AlipayBossOrderDiagnosisGetModel extends AlipayObject {

	private static final long serialVersionUID = 4651891259162846284L;

	/**
	 * 返回的具体的结果信息，选填
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结束时间，按照yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 发现人，用于表示详细的问题发现者的类别
PFUNDDTS：资金治理服务平台
TIANWEN：淘宝天问平台
TRADEBRAIN：交易大脑
BCP：淘宝业务实时校验平台
DEVELOPER：开发
CUSTOMER_SERVICE：客服
	 */
	@ApiField("find_operator")
	private String findOperator;

	/**
	 * 订单号，订单号和外部订单号两者不能同时为空
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号，例如，淘宝订单号；
订单号和外部订单号两者不能同时为空
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 问题发现的来源，有以下几类
OUTSIDE_AUTOMATIC，外部自动发现
INSIDE_AUTOMATIC，内部自动发现
MANUAL_CONSULT，人工咨询
	 */
	@ApiField("source")
	private String source;

	/**
	 * 开始时间，按照yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFindOperator() {
		return this.findOperator;
	}
	public void setFindOperator(String findOperator) {
		this.findOperator = findOperator;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
