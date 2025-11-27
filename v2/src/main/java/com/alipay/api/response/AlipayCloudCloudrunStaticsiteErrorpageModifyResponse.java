package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorPageSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.errorpage.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-12 10:46:49
 */
public class AlipayCloudCloudrunStaticsiteErrorpageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6898794611979344869L;

	/** 
	 * 需要修改错误页面的域名列表
	 */
	@ApiListField("domain_list")
	@ApiField("string")
	private List<String> domainList;

	/** 
	 * 错误页面配置
	 */
	@ApiField("error_page")
	private ErrorPageSetting errorPage;

	public void setDomainList(List<String> domainList) {
		this.domainList = domainList;
	}
	public List<String> getDomainList( ) {
		return this.domainList;
	}

	public void setErrorPage(ErrorPageSetting errorPage) {
		this.errorPage = errorPage;
	}
	public ErrorPageSetting getErrorPage( ) {
		return this.errorPage;
	}

}
