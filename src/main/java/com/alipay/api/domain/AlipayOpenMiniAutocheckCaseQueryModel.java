package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百格用例信息查询
 *
 * @author auto create
 * @since 1.0, 2022-10-27 09:17:01
 */
public class AlipayOpenMiniAutocheckCaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2615812831486342617L;

	/**
	 * 用例唯一主键ID
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 用例名称
	 */
	@ApiField("case_name")
	private String caseName;

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseName() {
		return this.caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

}
