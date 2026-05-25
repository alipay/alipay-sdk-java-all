package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检验报告详情
 *
 * @author auto create
 * @since 1.0, 2026-04-02 17:22:45
 */
public class LaboratoryReport extends AlipayObject {

	private static final long serialVersionUID = 7897193859651241798L;

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
