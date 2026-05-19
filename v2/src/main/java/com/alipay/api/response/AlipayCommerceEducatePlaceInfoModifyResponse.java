package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.place.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 20:47:43
 */
public class AlipayCommerceEducatePlaceInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3561533154565768249L;

	/** 
	 * 不在花名册中的学工号列表
	 */
	@ApiListField("not_exist_employee_no_list")
	@ApiField("string")
	private List<String> notExistEmployeeNoList;

	public void setNotExistEmployeeNoList(List<String> notExistEmployeeNoList) {
		this.notExistEmployeeNoList = notExistEmployeeNoList;
	}
	public List<String> getNotExistEmployeeNoList( ) {
		return this.notExistEmployeeNoList;
	}

}
