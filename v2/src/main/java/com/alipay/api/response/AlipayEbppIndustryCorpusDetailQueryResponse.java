package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DocDTO;
import com.alipay.api.domain.CommonQaDTO;
import com.alipay.api.domain.ServiceItemDTO;
import com.alipay.api.domain.GovOrgServiceDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.corpus.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 19:12:33
 */
public class AlipayEbppIndustryCorpusDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8273362882431832212L;

	/** 
	 * 政策文件
	 */
	@ApiField("doc_dto")
	private DocDTO docDto;

	/** 
	 * faq问答
	 */
	@ApiField("faq_dto")
	private CommonQaDTO faqDto;

	/** 
	 * 办事事项
	 */
	@ApiField("item_dto")
	private ServiceItemDTO itemDto;

	/** 
	 * 服务信息
	 */
	@ApiField("service_dto")
	private GovOrgServiceDTO serviceDto;

	public void setDocDto(DocDTO docDto) {
		this.docDto = docDto;
	}
	public DocDTO getDocDto( ) {
		return this.docDto;
	}

	public void setFaqDto(CommonQaDTO faqDto) {
		this.faqDto = faqDto;
	}
	public CommonQaDTO getFaqDto( ) {
		return this.faqDto;
	}

	public void setItemDto(ServiceItemDTO itemDto) {
		this.itemDto = itemDto;
	}
	public ServiceItemDTO getItemDto( ) {
		return this.itemDto;
	}

	public void setServiceDto(GovOrgServiceDTO serviceDto) {
		this.serviceDto = serviceDto;
	}
	public GovOrgServiceDTO getServiceDto( ) {
		return this.serviceDto;
	}

}
