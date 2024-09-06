package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.certificate.certificatetion.sendcallback response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 20:02:02
 */
public class AlipayMarketingCertificateCertificatetionSendcallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 8514111929714482551L;

	/** 
	 * 商品购买后生成的凭证明细
	 */
	@ApiListField("certificate_info_list")
	@ApiField("certificate_query_info")
	private List<CertificateQueryInfo> certificateInfoList;

	/** 
	 * 购买商品的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setCertificateInfoList(List<CertificateQueryInfo> certificateInfoList) {
		this.certificateInfoList = certificateInfoList;
	}
	public List<CertificateQueryInfo> getCertificateInfoList( ) {
		return this.certificateInfoList;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
