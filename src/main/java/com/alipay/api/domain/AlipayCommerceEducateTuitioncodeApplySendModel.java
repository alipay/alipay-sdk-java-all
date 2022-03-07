package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码申请
 *
 * @author auto create
 * @since 1.0, 2022-01-18 16:06:30
 */
public class AlipayCommerceEducateTuitioncodeApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 6286817853962317923L;

	/**
	 * 投诉地址
	 */
	@ApiField("complain_url")
	private String complainUrl;

	/**
	 * 资金存管模式。
TEMPLATE：储值模式；BANK：银行模式。
默认不传为TEMPLATE模式
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 商家监管户信息
	 */
	@ApiField("monitor_info")
	private MonitorInfo monitorInfo;

	/**
	 * 外部申请单号
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 商家结算户信息
	 */
	@ApiField("payee_info")
	private PayeeInfo payeeInfo;

	/**
	 * 场景类型："normal"-经典类型；"driving"-驾校场景。默认为经典类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 商户账户
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 返佣pid
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getComplainUrl() {
		return this.complainUrl;
	}
	public void setComplainUrl(String complainUrl) {
		this.complainUrl = complainUrl;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public MonitorInfo getMonitorInfo() {
		return this.monitorInfo;
	}
	public void setMonitorInfo(MonitorInfo monitorInfo) {
		this.monitorInfo = monitorInfo;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public PayeeInfo getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(PayeeInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
