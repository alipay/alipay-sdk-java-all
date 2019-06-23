package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部工单完结同步接口
 *
 * @author auto create
 * @since 1.0, 2018-09-14 20:33:46
 */
public class AlipayIserviceItaskProcessDetailSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8248754581642397641L;

	/**
	 * 需要同步的蚂蚁域内的具体工单平台
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部系统工单处理同学id
	 */
	@ApiField("exsystem_operator_id")
	private String exsystemOperatorId;

	/**
	 * 外部系统对工单进行处理的人员名称
	 */
	@ApiField("exsystem_operator_name")
	private String exsystemOperatorName;

	/**
	 * 外部系统的工单id
	 */
	@ApiField("exsystem_ticket_id")
	private String exsystemTicketId;

	/**
	 * 外部系统的工单状态，枚举值，目前只有一个值: COMPLETED。
如果传空，默认为 COMPLETED 。
	 */
	@ApiField("exsystem_ticket_state")
	private String exsystemTicketState;

	/**
	 * 外部工单业务扩展字段列表，业务属性信息都放置在此字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getExappName() {
		return this.exappName;
	}
	public void setExappName(String exappName) {
		this.exappName = exappName;
	}

	public String getExsystemOperatorId() {
		return this.exsystemOperatorId;
	}
	public void setExsystemOperatorId(String exsystemOperatorId) {
		this.exsystemOperatorId = exsystemOperatorId;
	}

	public String getExsystemOperatorName() {
		return this.exsystemOperatorName;
	}
	public void setExsystemOperatorName(String exsystemOperatorName) {
		this.exsystemOperatorName = exsystemOperatorName;
	}

	public String getExsystemTicketId() {
		return this.exsystemTicketId;
	}
	public void setExsystemTicketId(String exsystemTicketId) {
		this.exsystemTicketId = exsystemTicketId;
	}

	public String getExsystemTicketState() {
		return this.exsystemTicketState;
	}
	public void setExsystemTicketState(String exsystemTicketState) {
		this.exsystemTicketState = exsystemTicketState;
	}

	public List<ExtendFieldInfo> getExtendFieldInfos() {
		return this.extendFieldInfos;
	}
	public void setExtendFieldInfos(List<ExtendFieldInfo> extendFieldInfos) {
		this.extendFieldInfos = extendFieldInfos;
	}

}
