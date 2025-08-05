package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活用工团单批增单创建
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:36:22
 */
public class AlipayInsSceneEmploymentGroupendorseAppendModel extends AlipayObject {

	private static final long serialVersionUID = 2761417542995286232L;

	/**
	 * 雇员列表
	 */
	@ApiListField("employee_list")
	@ApiField("ins_employee")
	private List<InsEmployee> employeeList;

	/**
	 * 批改类型
	 */
	@ApiField("endorse_order_type")
	private String endorseOrderType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 主单号
	 */
	@ApiField("summary_order_no")
	private String summaryOrderNo;

	public List<InsEmployee> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<InsEmployee> employeeList) {
		this.employeeList = employeeList;
	}

	public String getEndorseOrderType() {
		return this.endorseOrderType;
	}
	public void setEndorseOrderType(String endorseOrderType) {
		this.endorseOrderType = endorseOrderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSummaryOrderNo() {
		return this.summaryOrderNo;
	}
	public void setSummaryOrderNo(String summaryOrderNo) {
		this.summaryOrderNo = summaryOrderNo;
	}

}
