package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务详情查询
 *
 * @author auto create
 * @since 1.0, 2019-11-20 21:41:52
 */
public class ZhimaMerchantCreditserviceDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2819256454219543128L;

	/**
	 * 信用服务ID，为必传字段。
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
