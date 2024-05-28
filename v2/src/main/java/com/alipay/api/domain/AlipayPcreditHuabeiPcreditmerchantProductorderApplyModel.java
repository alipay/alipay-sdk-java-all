package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘系商户申请订购花呗合约
 *
 * @author auto create
 * @since 1.0, 2024-03-18 19:53:39
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3272625649775564763L;

	/**
	 * 产品开始生效的时间
	 */
	@ApiField("active_datetime")
	private String activeDatetime;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 合约订购业务场景
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 下游需要数据，纯透传
	 */
	@ApiField("extending_info")
	private String extendingInfo;

	/**
	 * 请求来源应用
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 合约订购平台
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 订购系统码，用于标识订购花呗产品的系统
	 */
	@ApiField("ordered_system_code")
	private String orderedSystemCode;

	/**
	 * 订购产品的时间，用于标识用户下单动作的时间
	 */
	@ApiField("ordering_datetime")
	private String orderingDatetime;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 销售产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	public String getActiveDatetime() {
		return this.activeDatetime;
	}
	public void setActiveDatetime(String activeDatetime) {
		this.activeDatetime = activeDatetime;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getExtendingInfo() {
		return this.extendingInfo;
	}
	public void setExtendingInfo(String extendingInfo) {
		this.extendingInfo = extendingInfo;
	}

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getOrderedSystemCode() {
		return this.orderedSystemCode;
	}
	public void setOrderedSystemCode(String orderedSystemCode) {
		this.orderedSystemCode = orderedSystemCode;
	}

	public String getOrderingDatetime() {
		return this.orderingDatetime;
	}
	public void setOrderingDatetime(String orderingDatetime) {
		this.orderingDatetime = orderingDatetime;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

}
