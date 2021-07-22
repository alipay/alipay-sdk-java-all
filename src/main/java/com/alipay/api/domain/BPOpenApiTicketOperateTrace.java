package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程实例操作记录
 *
 * @author auto create
 * @since 1.0, 2021-07-14 10:18:31
 */
public class BPOpenApiTicketOperateTrace extends AlipayObject {

	private static final long serialVersionUID = 3474521922584634548L;

	/**
	 * 所做的操作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 业务系统
	 */
	@ApiField("biz_app")
	private String bizApp;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 处理节点显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 处理节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 下一步处理节点显示名称
	 */
	@ApiField("next_display_name")
	private String nextDisplayName;

	/**
	 * 下一步处理节点
	 */
	@ApiField("next_name")
	private String nextName;

	/**
	 * 节点停留时长
	 */
	@ApiField("node_duration")
	private Long nodeDuration;

	/**
	 * 操作名称
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 节点处理时长
	 */
	@ApiField("operate_duration")
	private Long operateDuration;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 操作者用户域名
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作者花名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 原处理人域名
	 */
	@ApiField("origin_operator")
	private String originOperator;

	/**
	 * 原处理人花名
	 */
	@ApiField("origin_operator_name")
	private String originOperatorName;

	/**
	 * 工单id
	 */
	@ApiField("ticket_id")
	private String ticketId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizApp() {
		return this.bizApp;
	}
	public void setBizApp(String bizApp) {
		this.bizApp = bizApp;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNextDisplayName() {
		return this.nextDisplayName;
	}
	public void setNextDisplayName(String nextDisplayName) {
		this.nextDisplayName = nextDisplayName;
	}

	public String getNextName() {
		return this.nextName;
	}
	public void setNextName(String nextName) {
		this.nextName = nextName;
	}

	public Long getNodeDuration() {
		return this.nodeDuration;
	}
	public void setNodeDuration(Long nodeDuration) {
		this.nodeDuration = nodeDuration;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public Long getOperateDuration() {
		return this.operateDuration;
	}
	public void setOperateDuration(Long operateDuration) {
		this.operateDuration = operateDuration;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOriginOperator() {
		return this.originOperator;
	}
	public void setOriginOperator(String originOperator) {
		this.originOperator = originOperator;
	}

	public String getOriginOperatorName() {
		return this.originOperatorName;
	}
	public void setOriginOperatorName(String originOperatorName) {
		this.originOperatorName = originOperatorName;
	}

	public String getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
