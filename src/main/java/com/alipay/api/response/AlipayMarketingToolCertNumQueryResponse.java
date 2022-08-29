package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertAvailableNumVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.cert.num.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 18:00:10
 */
public class AlipayMarketingToolCertNumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2462935639832641565L;

	/** 
	 * 凭证可用点数列表。
	 */
	@ApiListField("cert_available_num")
	@ApiField("cert_available_num_v_o")
	private List<CertAvailableNumVO> certAvailableNum;

	public void setCertAvailableNum(List<CertAvailableNumVO> certAvailableNum) {
		this.certAvailableNum = certAvailableNum;
	}
	public List<CertAvailableNumVO> getCertAvailableNum( ) {
		return this.certAvailableNum;
	}

}
