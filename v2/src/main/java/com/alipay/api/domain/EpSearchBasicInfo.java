package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模糊搜索命中的企业列表
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:28:08
 */
public class EpSearchBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 4482498849945181354L;

	/**
	 * 企业统一社会信用代码或注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 标准工商企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

}
