package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpLabelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-04 11:06:49
 */
public class ZhimaCreditEpDossierLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185169512655947793L;

	/** 
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业标签内容列表
	 */
	@ApiListField("label_content")
	@ApiField("ep_label_content")
	private List<EpLabelContent> labelContent;

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setLabelContent(List<EpLabelContent> labelContent) {
		this.labelContent = labelContent;
	}
	public List<EpLabelContent> getLabelContent( ) {
		return this.labelContent;
	}

}
