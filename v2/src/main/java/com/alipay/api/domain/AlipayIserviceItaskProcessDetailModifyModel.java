package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工单推进接口
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:52:29
 */
public class AlipayIserviceItaskProcessDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4636221165412469863L;

	/**
	 * 工单平台名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 工单附件的存储地址
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部系统对工单进行处理的人员所在部门ID。
	 */
	@ApiField("exsystem_department_id")
	private String exsystemDepartmentId;

	/**
	 * BU名称（XSPACE填写对应租户名称）
	 */
	@ApiField("exsystem_department_name")
	private String exsystemDepartmentName;

	/**
	 * 外部系统对工单的处理动作。前期与外部系统沟通后，提供给外部系统。枚举（agree，reject）
	 */
	@ApiField("exsystem_operate")
	private String exsystemOperate;

	/**
	 * 外部系统对工单进行处理的备注信息
	 */
	@ApiField("exsystem_operator_comment")
	private String exsystemOperatorComment;

	/**
	 * 外部系统对工单进行处理的人员ID。
	 */
	@ApiField("exsystem_operator_id")
	private String exsystemOperatorId;

	/**
	 * 外部系统对工单进行处理的人员名称。
	 */
	@ApiField("exsystem_operator_name")
	private String exsystemOperatorName;

	/**
	 * 外部工单业务扩展字段，业务属性信息都放置在此字段。最大10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

	/**
	 * 工单流程编号
	 */
	@ApiField("process_no")
	private String processNo;

	/**
	 * 工单流程编码_服务端提供给消费端流程模板code
	 */
	@ApiField("process_template_code")
	private String processTemplateCode;

	/**
	 * 工单信息唯一标识ID，简写为puid。为app_name、process_no和alipay_process_id共同组合而成，供工单推进接口使用。
	 */
	@ApiField("process_unique_id")
	private String processUniqueId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAttachment() {
		return this.attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getExappName() {
		return this.exappName;
	}
	public void setExappName(String exappName) {
		this.exappName = exappName;
	}

	public String getExsystemDepartmentId() {
		return this.exsystemDepartmentId;
	}
	public void setExsystemDepartmentId(String exsystemDepartmentId) {
		this.exsystemDepartmentId = exsystemDepartmentId;
	}

	public String getExsystemDepartmentName() {
		return this.exsystemDepartmentName;
	}
	public void setExsystemDepartmentName(String exsystemDepartmentName) {
		this.exsystemDepartmentName = exsystemDepartmentName;
	}

	public String getExsystemOperate() {
		return this.exsystemOperate;
	}
	public void setExsystemOperate(String exsystemOperate) {
		this.exsystemOperate = exsystemOperate;
	}

	public String getExsystemOperatorComment() {
		return this.exsystemOperatorComment;
	}
	public void setExsystemOperatorComment(String exsystemOperatorComment) {
		this.exsystemOperatorComment = exsystemOperatorComment;
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

	public List<ExtendFieldInfo> getExtendFieldInfos() {
		return this.extendFieldInfos;
	}
	public void setExtendFieldInfos(List<ExtendFieldInfo> extendFieldInfos) {
		this.extendFieldInfos = extendFieldInfos;
	}

	public String getProcessNo() {
		return this.processNo;
	}
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	public String getProcessTemplateCode() {
		return this.processTemplateCode;
	}
	public void setProcessTemplateCode(String processTemplateCode) {
		this.processTemplateCode = processTemplateCode;
	}

	public String getProcessUniqueId() {
		return this.processUniqueId;
	}
	public void setProcessUniqueId(String processUniqueId) {
		this.processUniqueId = processUniqueId;
	}

}
