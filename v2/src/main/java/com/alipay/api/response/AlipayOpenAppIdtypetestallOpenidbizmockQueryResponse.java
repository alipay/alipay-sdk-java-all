package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IdTypeUserDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.idtypetestall.openidbizmock.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-15 14:51:37
 */
public class AlipayOpenAppIdtypetestallOpenidbizmockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5636254514627178964L;

	/** 
	 * idType
	 */
	@ApiField("id_type")
	private String idType;

	/** 
	 * 1
	 */
	@ApiField("id_type_list")
	private String idTypeList;

	/** 
	 * 1
	 */
	@ApiField("list_id_type")
	private String listIdType;

	/** 
	 * 1
	 */
	@ApiField("list_open_id")
	private String listOpenId;

	/** 
	 * 1
	 */
	@ApiField("list_user_id")
	private String listUserId;

	/** 
	 * openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 1
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/** 
	 * idType测试
	 */
	@ApiField("user_detail")
	private IdTypeUserDetail userDetail;

	/** 
	 * 1
	 */
	@ApiListField("user_detail_list")
	@ApiField("id_type_user_detail")
	private List<IdTypeUserDetail> userDetailList;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 1
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/** 
	 * 1
	 */
	@ApiField("zone_name")
	private String zoneName;

	/** 
	 * 1
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

	public void setListIdType(String listIdType) {
		this.listIdType = listIdType;
	}
	public String getListIdType( ) {
		return this.listIdType;
	}

	public void setListOpenId(String listOpenId) {
		this.listOpenId = listOpenId;
	}
	public String getListOpenId( ) {
		return this.listOpenId;
	}

	public void setListUserId(String listUserId) {
		this.listUserId = listUserId;
	}
	public String getListUserId( ) {
		return this.listUserId;
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

	public void setUserDetail(IdTypeUserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public IdTypeUserDetail getUserDetail( ) {
		return this.userDetail;
	}

	public void setUserDetailList(List<IdTypeUserDetail> userDetailList) {
		this.userDetailList = userDetailList;
	}
	public List<IdTypeUserDetail> getUserDetailList( ) {
		return this.userDetailList;
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
