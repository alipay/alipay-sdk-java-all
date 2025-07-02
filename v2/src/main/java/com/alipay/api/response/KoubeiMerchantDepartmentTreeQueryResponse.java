package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepartmentDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.tree.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class KoubeiMerchantDepartmentTreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1599686798971165223L;

	/** 
	 * 商户部门组织模型集合，根据返回的结果构造出商户的部门树
	 */
	@ApiListField("department_dtos")
	@ApiField("department_d_t_o")
	private List<DepartmentDTO> departmentDtos;

	public void setDepartmentDtos(List<DepartmentDTO> departmentDtos) {
		this.departmentDtos = departmentDtos;
	}
	public List<DepartmentDTO> getDepartmentDtos( ) {
		return this.departmentDtos;
	}

}
