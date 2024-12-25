package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateSubmitResonse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.certification.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:02:17
 */
public class AlipayCommerceMerchantcardCertificationUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7363178637926545722L;

	/** 
	 * 批量核销结果
	 */
	@ApiListField("context")
	@ApiField("certificate_submit_resonse")
	private List<CertificateSubmitResonse> context;

	/** 
	 * ture:提交成功
false:提交失败
	 */
	@ApiField("res")
	private Boolean res;

	public void setContext(List<CertificateSubmitResonse> context) {
		this.context = context;
	}
	public List<CertificateSubmitResonse> getContext( ) {
		return this.context;
	}

	public void setRes(Boolean res) {
		this.res = res;
	}
	public Boolean getRes( ) {
		return this.res;
	}

}
