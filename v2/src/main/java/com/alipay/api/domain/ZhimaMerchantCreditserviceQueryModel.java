package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务详情查询
 *
 * @author auto create
 * @since 1.0, 2025-07-16 16:35:43
 */
public class ZhimaMerchantCreditserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1249894465193216166L;

	/**
	 * 信用服务ID，通过zhima.merchant.creditservice.create(芝麻信用信用服务创建)接口创建信用服务后获取。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/**
	 * 成功创建后返回的信用服务的版本号，从1开始，随着信用服务配置更新递增。
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getCreditServiceId() {
		return this.creditServiceId;
	}
	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
