package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素问医疗信息咨询能力接口
 *
 * @author auto create
 * @since 1.0, 2025-07-23 16:37:08
 */
public class AlipaySecurityDataMedicalSuwenConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3783362582129738766L;

	/**
	 * 咨询数据类型，如doctor（医生）
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 咨询场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 查询条件，如医生证号查询：{"name":"license_no","value":"12345"}
	 */
	@ApiListField("search_list")
	@ApiField("consult_item")
	private List<ConsultItem> searchList;

	/**
	 * 需要咨询的字段列表，如{"name":"scope"}
	 */
	@ApiListField("target_list")
	@ApiField("consult_item")
	private List<ConsultItem> targetList;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public List<ConsultItem> getSearchList() {
		return this.searchList;
	}
	public void setSearchList(List<ConsultItem> searchList) {
		this.searchList = searchList;
	}

	public List<ConsultItem> getTargetList() {
		return this.targetList;
	}
	public void setTargetList(List<ConsultItem> targetList) {
		this.targetList = targetList;
	}

}
