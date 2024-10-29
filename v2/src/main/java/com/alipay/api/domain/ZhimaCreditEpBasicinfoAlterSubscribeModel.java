package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用企业基础信息变更订阅
 *
 * @author auto create
 * @since 1.0, 2024-05-08 11:54:53
 */
public class ZhimaCreditEpBasicinfoAlterSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 8492229785318671787L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 监听组号不填写，默认开通全部监听项；若要自定义监听项需联系客户经理进行配置
	 */
	@ApiField("listen_group_id")
	private String listenGroupId;

	/**
	 * 企业监听：EnterpriseListen
	 */
	@ApiField("product_code")
	private String productCode;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getListenGroupId() {
		return this.listenGroupId;
	}
	public void setListenGroupId(String listenGroupId) {
		this.listenGroupId = listenGroupId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
