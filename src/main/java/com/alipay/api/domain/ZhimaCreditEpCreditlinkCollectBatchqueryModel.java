package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信授权数据批量获取
 *
 * @author auto create
 * @since 1.0, 2022-10-27 20:01:49
 */
public class ZhimaCreditEpCreditlinkCollectBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8523551457363899293L;

	/**
	 * 请求数据类型，商户请使用以签约的数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 企业的社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 商户单号，请与授权申请时的单号保持一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 批量获取数据的页码大小，默认从第一页开始，不可以为0
	 */
	@ApiField("page_number")
	private Long pageNumber;

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

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

}
