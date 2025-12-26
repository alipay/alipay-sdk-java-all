package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AuthorizedFamilyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.familyinfo.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-02 11:27:42
 */
public class AlipayCommerceMedicalFamilyinfoAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1896223235351521969L;

	/** 
	 * 已授权家人信息列表
	 */
	@ApiListField("data")
	@ApiField("authorized_family_info")
	private List<AuthorizedFamilyInfo> data;

	public void setData(List<AuthorizedFamilyInfo> data) {
		this.data = data;
	}
	public List<AuthorizedFamilyInfo> getData( ) {
		return this.data;
	}

}
