package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部门信息查询
 *
 * @author auto create
 * @since 1.0, 2022-05-05 17:45:34
 */
public class KoubeiMerchantDepartmentDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4452561747749753212L;

	/**
	 * 人员管理场景的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}
