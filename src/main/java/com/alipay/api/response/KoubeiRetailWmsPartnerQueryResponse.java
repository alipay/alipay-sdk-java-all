package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PartnerVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.partner.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsPartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4263322672781229415L;

	/** 
	 * 商户档案信息
	 */
	@ApiListField("partners")
	@ApiField("partner_v_o")
	private List<PartnerVO> partners;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setPartners(List<PartnerVO> partners) {
		this.partners = partners;
	}
	public List<PartnerVO> getPartners( ) {
		return this.partners;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
