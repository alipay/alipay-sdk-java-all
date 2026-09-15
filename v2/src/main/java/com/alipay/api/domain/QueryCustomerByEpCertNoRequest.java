package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询请求参数
 *
 * @author auto create
 * @since 1.0, 2026-09-02 10:27:52
 */
public class QueryCustomerByEpCertNoRequest extends AlipayObject {

	private static final long serialVersionUID = 7627938419242459356L;

	/**
	 * null
	 */
	@ApiListField("ep_cert_no_list")
	@ApiField("string")
	private List<String> epCertNoList;

	public List<String> getEpCertNoList() {
		return this.epCertNoList;
	}
	public void setEpCertNoList(List<String> epCertNoList) {
		this.epCertNoList = epCertNoList;
	}

}
