package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收单规则
 *
 * @author auto create
 * @since 1.0, 2023-03-07 19:54:35
 */
public class AuthorizedRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 1419245648264848666L;

	/**
	 * 授权商户列表
	 */
	@ApiListField("authorized_detail_list")
	@ApiField("authorize_detail_d_t_o")
	private List<AuthorizeDetailDTO> authorizedDetailList;

	/**
	 * WHITELIST-白名单
ALL-全部
	 */
	@ApiField("authorized_type")
	private String authorizedType;

	public List<AuthorizeDetailDTO> getAuthorizedDetailList() {
		return this.authorizedDetailList;
	}
	public void setAuthorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
		this.authorizedDetailList = authorizedDetailList;
	}

	public String getAuthorizedType() {
		return this.authorizedType;
	}
	public void setAuthorizedType(String authorizedType) {
		this.authorizedType = authorizedType;
	}

}
