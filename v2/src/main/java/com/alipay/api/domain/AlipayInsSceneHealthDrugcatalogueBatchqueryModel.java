package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康门诊险药品目录批量查询接口
 *
 * @author auto create
 * @since 1.0, 2025-10-13 19:45:51
 */
public class AlipayInsSceneHealthDrugcatalogueBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7328911684418532474L;

	/**
	 * 蚂蚁合约单号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 疾病名称列表
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
	 * 药品通用名列表
	 */
	@ApiListField("general_name_list")
	@ApiField("string")
	private List<String> generalNameList;

	/**
	 * 商品名称列表
	 */
	@ApiListField("item_name_list")
	@ApiField("string")
	private List<String> itemNameList;

	/**
	 * 查询时预选药品信息列表
	 */
	@ApiListField("pre_select_drug_list")
	@ApiField("drug_d_t_o")
	private List<DrugDTO> preSelectDrugList;

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

	public List<String> getItemNameList() {
		return this.itemNameList;
	}
	public void setItemNameList(List<String> itemNameList) {
		this.itemNameList = itemNameList;
	}

	public List<DrugDTO> getPreSelectDrugList() {
		return this.preSelectDrugList;
	}
	public void setPreSelectDrugList(List<DrugDTO> preSelectDrugList) {
		this.preSelectDrugList = preSelectDrugList;
	}

}
