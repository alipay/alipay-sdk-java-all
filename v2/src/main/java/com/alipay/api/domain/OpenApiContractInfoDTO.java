package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基础合同信息，只包含合同号以及合同中心详情地址
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:33:46
 */
public class OpenApiContractInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6468987521118779428L;

	/**
	 * 合同号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同详情url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

}
