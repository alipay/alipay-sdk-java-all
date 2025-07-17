package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepartmentLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:57:01
 */
public class KoubeiMerchantDepartmentLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3293669387454666665L;

	/** 
	 * 人员组织可用的部门标签列表
	 */
	@ApiListField("department_labels")
	@ApiField("department_label")
	private List<DepartmentLabel> departmentLabels;

	public void setDepartmentLabels(List<DepartmentLabel> departmentLabels) {
		this.departmentLabels = departmentLabels;
	}
	public List<DepartmentLabel> getDepartmentLabels( ) {
		return this.departmentLabels;
	}

}
