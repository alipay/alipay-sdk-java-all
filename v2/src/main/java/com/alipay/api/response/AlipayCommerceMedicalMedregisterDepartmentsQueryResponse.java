package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepartmentVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medregister.departments.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 17:52:21
 */
public class AlipayCommerceMedicalMedregisterDepartmentsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7538162854266799323L;

	/** 
	 * 该接口返回科室列表（非树）
	 */
	@ApiListField("data")
	@ApiField("department_v_o")
	private List<DepartmentVO> data;

	public void setData(List<DepartmentVO> data) {
		this.data = data;
	}
	public List<DepartmentVO> getData( ) {
		return this.data;
	}

}
