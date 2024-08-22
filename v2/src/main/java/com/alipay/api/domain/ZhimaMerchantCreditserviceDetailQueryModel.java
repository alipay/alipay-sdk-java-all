package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务详情查询
 *
 * @author auto create
 * @since 1.0, 2022-11-15 10:30:28
 */
public class ZhimaMerchantCreditserviceDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4519743338351277845L;

	/**
	 * 信用服务ID，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.creditservice.detail.create">zhima.merchant.creditservice.detail.create</a>(芝麻信用信用服务创建)接口创建信用服务后获取。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/**
	 * 信用服务版本的版本号。
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
