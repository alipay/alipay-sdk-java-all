package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriseInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.user.enterprise.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-15 17:19:14
 */
public class AlipayCommerceEcUserEnterpriseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7715523118124569688L;

	/** 
	 * 用户所属企业列表
	 */
	@ApiListField("enterprise_info_list")
	@ApiField("enterprise_info_d_t_o")
	private List<EnterpriseInfoDTO> enterpriseInfoList;

	public void setEnterpriseInfoList(List<EnterpriseInfoDTO> enterpriseInfoList) {
		this.enterpriseInfoList = enterpriseInfoList;
	}
	public List<EnterpriseInfoDTO> getEnterpriseInfoList( ) {
		return this.enterpriseInfoList;
	}

}
