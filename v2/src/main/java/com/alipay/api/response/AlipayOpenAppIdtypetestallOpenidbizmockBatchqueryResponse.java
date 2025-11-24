package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IdTypeTestComplexParam;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.idtypetestall.openidbizmock.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 10:29:10
 */
public class AlipayOpenAppIdtypetestallOpenidbizmockBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5627629659629966774L;

	/** 
	 * uid列表
	 */
	@ApiField("id_type")
	private String idType;

	/** 
	 * idType
	 */
	@ApiField("id_type_list")
	private String idTypeList;

	/** 
	 * 复杂类型
	 */
	@ApiField("id_type_test_complex_param")
	private IdTypeTestComplexParam idTypeTestComplexParam;

	/** 
	 * 复杂类型列表
	 */
	@ApiListField("id_type_test_complex_param_list")
	@ApiField("id_type_test_complex_param")
	private List<IdTypeTestComplexParam> idTypeTestComplexParamList;

	/** 
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * OPENID_LIST
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
	 * UID
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/** 
	 * zone
	 */
	@ApiField("zone_name")
	private String zoneName;

	/** 
	 * zone类型
	 */
	@ApiField("zone_type")
	private String zoneType;

	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdType( ) {
		return this.idType;
	}

	public void setIdTypeList(String idTypeList) {
		this.idTypeList = idTypeList;
	}
	public String getIdTypeList( ) {
		return this.idTypeList;
	}

	public void setIdTypeTestComplexParam(IdTypeTestComplexParam idTypeTestComplexParam) {
		this.idTypeTestComplexParam = idTypeTestComplexParam;
	}
	public IdTypeTestComplexParam getIdTypeTestComplexParam( ) {
		return this.idTypeTestComplexParam;
	}

	public void setIdTypeTestComplexParamList(List<IdTypeTestComplexParam> idTypeTestComplexParamList) {
		this.idTypeTestComplexParamList = idTypeTestComplexParamList;
	}
	public List<IdTypeTestComplexParam> getIdTypeTestComplexParamList( ) {
		return this.idTypeTestComplexParamList;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}
	public List<String> getOpenIdList( ) {
		return this.openIdList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneName( ) {
		return this.zoneName;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}
	public String getZoneType( ) {
		return this.zoneType;
	}

}
