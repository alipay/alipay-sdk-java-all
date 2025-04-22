package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 家庭医生商品批量搜索查询接口
 *
 * @author auto create
 * @since 1.0, 2022-03-15 15:12:17
 */
public class AlipayInsSceneFamilydoctorItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3358387252839768286L;

	/**
	 * 服务合约号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 病症列表
	 */
	@ApiListField("disease_name_list")
	@ApiField("string")
	private List<String> diseaseNameList;

	/**
	 * 是否急诊，true急诊，false非急诊
	 */
	@ApiField("emergency")
	private Boolean emergency;

	/**
	 * 药品通用名
	 */
	@ApiListField("general_name_list")
	@ApiField("string")
	private List<String> generalNameList;

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

	public List<String> getDiseaseNameList() {
		return this.diseaseNameList;
	}
	public void setDiseaseNameList(List<String> diseaseNameList) {
		this.diseaseNameList = diseaseNameList;
	}

	public Boolean getEmergency() {
		return this.emergency;
	}
	public void setEmergency(Boolean emergency) {
		this.emergency = emergency;
	}

	public List<String> getGeneralNameList() {
		return this.generalNameList;
	}
	public void setGeneralNameList(List<String> generalNameList) {
		this.generalNameList = generalNameList;
	}

}
