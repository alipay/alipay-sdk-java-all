package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批操作节点信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 16:37:40
 */
public class NodeOperateDTO extends AlipayObject {

	private static final long serialVersionUID = 3661616694517965256L;

	/**
	 * 流程平台puid
	 */
	@ApiField("ant_process_puid")
	private String antProcessPuid;

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
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 节点显示名称
	 */
	@ApiField("node_display_name")
	private String nodeDisplayName;

	/**
	 * 节点停留时长
	 */
	@ApiField("node_duration")
	private String nodeDuration;

	/**
	 * 节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 操作详情
	 */
	@ApiField("operate_detail")
	private String operateDetail;

	/**
	 * 操作时长
	 */
	@ApiField("operate_duration")
	private String operateDuration;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 操作人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作人工号
	 */
	@ApiField("operator_work_no")
	private String operatorWorkNo;

	/**
	 * 连通的状态
	 */
	@ApiField("ticket_state")
	private String ticketState;

	/**
	 * 工单标题
	 */
	@ApiField("title")
	private String title;

	public String getAntProcessPuid() {
		return this.antProcessPuid;
	}
	public void setAntProcessPuid(String antProcessPuid) {
		this.antProcessPuid = antProcessPuid;
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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNodeDisplayName() {
		return this.nodeDisplayName;
	}
	public void setNodeDisplayName(String nodeDisplayName) {
		this.nodeDisplayName = nodeDisplayName;
	}

	public String getNodeDuration() {
		return this.nodeDuration;
	}
	public void setNodeDuration(String nodeDuration) {
		this.nodeDuration = nodeDuration;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getOperateDetail() {
		return this.operateDetail;
	}
	public void setOperateDetail(String operateDetail) {
		this.operateDetail = operateDetail;
	}

	public String getOperateDuration() {
		return this.operateDuration;
	}
	public void setOperateDuration(String operateDuration) {
		this.operateDuration = operateDuration;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
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

	public String getOperatorWorkNo() {
		return this.operatorWorkNo;
	}
	public void setOperatorWorkNo(String operatorWorkNo) {
		this.operatorWorkNo = operatorWorkNo;
	}

	public String getTicketState() {
		return this.ticketState;
	}
	public void setTicketState(String ticketState) {
		this.ticketState = ticketState;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
