package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建工单
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:52:12
 */
public class AlipayIserviceItaskProcessDetailCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2873987529933423385L;

	/**
	 * 接口服务端名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 附件地址
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部工单创建人ID
	 */
	@ApiField("excreator_id")
	private String excreatorId;

	/**
	 * 外部工单创建人名称
	 */
	@ApiField("excreator_name")
	private String excreatorName;

	/**
	 * 外部工单创建人部门ID
	 */
	@ApiField("exsystem_department_id")
	private String exsystemDepartmentId;

	/**
	 * BU名称（xspace填写对应的租户名称）
	 */
	@ApiField("exsystem_department_name")
	private String exsystemDepartmentName;

	/**
	 * 外部工单业务扩展字段列表，业务属性信息都放置在此字段。最多10个字段。
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
	 * 工单流程编号_服务端提供给消费端流程模板code
	 */
	@ApiField("process_template_code")
	private String processTemplateCode;

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

	public String getExcreatorId() {
		return this.excreatorId;
	}
	public void setExcreatorId(String excreatorId) {
		this.excreatorId = excreatorId;
	}

	public String getExcreatorName() {
		return this.excreatorName;
	}
	public void setExcreatorName(String excreatorName) {
		this.excreatorName = excreatorName;
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

}
