package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新模板
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:54:19
 */
public class AlipaySecurityProdTemplateSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2895945768689787682L;

	/**
	 * 责任人中文名
	 */
	@ApiField("charge_name")
	private String chargeName;

	/**
	 * 负责人工号
	 */
	@ApiField("charge_no")
	private String chargeNo;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 模板id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 参与人列表
	 */
	@ApiListField("participants")
	@ApiField("string")
	private List<String> participants;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板名字
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getChargeName() {
		return this.chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public String getChargeNo() {
		return this.chargeNo;
	}
	public void setChargeNo(String chargeNo) {
		this.chargeNo = chargeNo;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
