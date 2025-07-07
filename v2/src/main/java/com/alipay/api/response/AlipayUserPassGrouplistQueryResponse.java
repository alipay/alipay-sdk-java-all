package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassInfoOpenApiModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.grouplist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:15
 */
public class AlipayUserPassGrouplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7248846155512259826L;

	/** 
	 * 券信息列表
	 */
	@ApiListField("pass_info_list")
	@ApiField("pass_info_open_api_model")
	private List<PassInfoOpenApiModel> passInfoList;

	public void setPassInfoList(List<PassInfoOpenApiModel> passInfoList) {
		this.passInfoList = passInfoList;
	}
	public List<PassInfoOpenApiModel> getPassInfoList( ) {
		return this.passInfoList;
	}

}
