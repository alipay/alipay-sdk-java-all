package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class HealthLaboratoryReport extends AlipayObject {

	private static final long serialVersionUID = 4573588747362437847L;

	/**
	 * 项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * null
	 */
	@ApiListField("result_info_list")
	@ApiField("report_result_info")
	private List<ReportResultInfo> resultInfoList;

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<ReportResultInfo> getResultInfoList() {
		return this.resultInfoList;
	}
	public void setResultInfoList(List<ReportResultInfo> resultInfoList) {
		this.resultInfoList = resultInfoList;
	}

}
