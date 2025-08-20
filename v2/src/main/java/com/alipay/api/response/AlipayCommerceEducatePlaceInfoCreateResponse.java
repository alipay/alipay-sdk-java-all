package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.place.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 14:47:35
 */
public class AlipayCommerceEducatePlaceInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3317978926763425459L;

	/** 
	 * 不在花名册中的学工号列表
	 */
	@ApiListField("not_exist_employee_no_list")
	@ApiField("string")
	private List<String> notExistEmployeeNoList;

	/** 
	 * 位置id
	 */
	@ApiField("place_id")
	private String placeId;

	public void setNotExistEmployeeNoList(List<String> notExistEmployeeNoList) {
		this.notExistEmployeeNoList = notExistEmployeeNoList;
	}
	public List<String> getNotExistEmployeeNoList( ) {
		return this.notExistEmployeeNoList;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getPlaceId( ) {
		return this.placeId;
	}

}
