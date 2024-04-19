package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康门诊险药品目录批量查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-07 19:23:52
 */
public class AlipayInsSceneHealthDrugcatalogueBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2159137625983459335L;

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

}
