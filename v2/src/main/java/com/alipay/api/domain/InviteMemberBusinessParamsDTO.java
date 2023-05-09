package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 成员邀请接口扩展字段模型
 *
 * @author auto create
 * @since 1.0, 2023-02-07 10:10:50
 */
public class InviteMemberBusinessParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 1343465942772818912L;

	/**
	 * 企业员工工卡
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 出资信息
	 */
	@ApiField("fund_ext_info")
	private FundExtInfo fundExtInfo;

	/**
	 * 员工关联的群组ID，当前系统仅支持一个
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public FundExtInfo getFundExtInfo() {
		return this.fundExtInfo;
	}
	public void setFundExtInfo(FundExtInfo fundExtInfo) {
		this.fundExtInfo = fundExtInfo;
	}

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

}
