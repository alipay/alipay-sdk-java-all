package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * idtype测试接口，包含复杂参数，GZ接口
 *
 * @author auto create
 * @since 1.0, 2023-03-02 18:15:11
 */
public class AlipayOpenAppIdtypetestallOpenidbizmockBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8771975247986743635L;

	/**
	 * 额外参数
	 */
	@ApiField("extra_param_input")
	private String extraParamInput;

	/**
	 * id_type
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * idType
	 */
	@ApiField("id_type_list")
	private String idTypeList;

	/**
	 * idtype
	 */
	@ApiField("id_type_test_complex_param")
	private IdTypeTestComplexParam idTypeTestComplexParam;

	/**
	 * idType复杂类型列表
	 */
	@ApiListField("id_type_test_complex_param_list")
	@ApiField("id_type_test_complex_param")
	private List<IdTypeTestComplexParam> idTypeTestComplexParamList;

	/**
	 * openaId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * openId列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * uid列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getExtraParamInput() {
		return this.extraParamInput;
	}
	public void setExtraParamInput(String extraParamInput) {
		this.extraParamInput = extraParamInput;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdTypeList() {
		return this.idTypeList;
	}
	public void setIdTypeList(String idTypeList) {
		this.idTypeList = idTypeList;
	}

	public IdTypeTestComplexParam getIdTypeTestComplexParam() {
		return this.idTypeTestComplexParam;
	}
	public void setIdTypeTestComplexParam(IdTypeTestComplexParam idTypeTestComplexParam) {
		this.idTypeTestComplexParam = idTypeTestComplexParam;
	}

	public List<IdTypeTestComplexParam> getIdTypeTestComplexParamList() {
		return this.idTypeTestComplexParamList;
	}
	public void setIdTypeTestComplexParamList(List<IdTypeTestComplexParam> idTypeTestComplexParamList) {
		this.idTypeTestComplexParamList = idTypeTestComplexParamList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
