package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信授权数据获取
 *
 * @author auto create
 * @since 1.0, 2022-06-28 20:06:27
 */
public class ZhimaCreditEpCreditlinkCollectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3265571184133981335L;

	/**
	 * 请求数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 被查询企业的社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 商户单号，请与授权申请时的单号保持一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

}
