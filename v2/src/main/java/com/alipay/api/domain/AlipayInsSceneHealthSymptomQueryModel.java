package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康门诊险症状查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-20 14:53:03
 */
public class AlipayInsSceneHealthSymptomQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8439486755643216783L;

	/**
	 * 蚂蚁合约单号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 症状搜索关键词
	 */
	@ApiField("symptom_search_keyword")
	private String symptomSearchKeyword;

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

	public String getSymptomSearchKeyword() {
		return this.symptomSearchKeyword;
	}
	public void setSymptomSearchKeyword(String symptomSearchKeyword) {
		this.symptomSearchKeyword = symptomSearchKeyword;
	}

}
