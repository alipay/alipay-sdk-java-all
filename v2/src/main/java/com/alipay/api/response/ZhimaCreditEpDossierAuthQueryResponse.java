package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpAuthContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:11:43
 */
public class ZhimaCreditEpDossierAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2353739521672546875L;

	/** 
	 * 用户名下企业授权信息列表
	 */
	@ApiListField("ep_auth_content")
	@ApiField("ep_auth_content")
	private List<EpAuthContent> epAuthContent;

	public void setEpAuthContent(List<EpAuthContent> epAuthContent) {
		this.epAuthContent = epAuthContent;
	}
	public List<EpAuthContent> getEpAuthContent( ) {
		return this.epAuthContent;
	}

}
