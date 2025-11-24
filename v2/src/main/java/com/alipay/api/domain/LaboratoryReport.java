package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检验报告详情
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class LaboratoryReport extends AlipayObject {

	private static final long serialVersionUID = 5132941312273349547L;

	/**
	 * null
	 */
	@ApiListField("result_info_list")
	@ApiField("laboratory_result_info")
	private List<LaboratoryResultInfo> resultInfoList;

	public List<LaboratoryResultInfo> getResultInfoList() {
		return this.resultInfoList;
	}
	public void setResultInfoList(List<LaboratoryResultInfo> resultInfoList) {
		this.resultInfoList = resultInfoList;
	}

}
