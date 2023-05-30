package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部门信息查询
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:41:47
 */
public class KoubeiMerchantDepartmentDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1897825487784751931L;

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
