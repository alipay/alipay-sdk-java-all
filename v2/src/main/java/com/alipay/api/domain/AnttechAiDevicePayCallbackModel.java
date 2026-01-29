package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AICO数字人设备支付回执接口
 *
 * @author auto create
 * @since 1.0, 2025-06-04 18:13:55
 */
public class AnttechAiDevicePayCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4761783692972468633L;

	/**
	 * 求签业务上下文数据，与当前支付记录一一对应的业务属性
	 */
	@ApiField("biz_context")
	private DivinationBizContextDetail bizContext;

	/**
	 * 业务回执字段，服务不做处理，透传回给调用方做相关业务逻辑处理。
	 */
	@ApiField("biz_receipt")
	private String bizReceipt;

	/**
	 * 一体机设备的ID，全局唯一
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 外部客户ID，由调用方提供，标明当前在当前场景下的唯一用户ID
	 */
	@ApiField("external_client_id")
	private String externalClientId;

	/**
	 * 外部用户名称
	 */
	@ApiField("external_client_name")
	private String externalClientName;

	/**
	 * 捐献金额，单位是元，保留两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付日期
	 */
	@ApiField("pay_date")
	private Date payDate;

	/**
	 * 支付场景：TEMPLE_DIVINATION 求签
	 */
	@ApiField("pay_scene")
	private String payScene;

	/**
	 * 调用方传入数据的唯一请求Id,用来幂等处理
	 */
	@ApiField("request_id")
	private String requestId;

	public DivinationBizContextDetail getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(DivinationBizContextDetail bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizReceipt() {
		return this.bizReceipt;
	}
	public void setBizReceipt(String bizReceipt) {
		this.bizReceipt = bizReceipt;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExternalClientId() {
		return this.externalClientId;
	}
	public void setExternalClientId(String externalClientId) {
		this.externalClientId = externalClientId;
	}

	public String getExternalClientName() {
		return this.externalClientName;
	}
	public void setExternalClientName(String externalClientName) {
		this.externalClientName = externalClientName;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayDate() {
		return this.payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayScene() {
		return this.payScene;
	}
	public void setPayScene(String payScene) {
		this.payScene = payScene;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
