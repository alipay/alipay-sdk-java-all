package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KnCertSendOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:40
 */
public class AlipayMarketingCampaignCertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8176272627457483247L;

	/** 
	 * 用户还有效的凭证详细列表
	 */
	@ApiListField("subcert_list")
	@ApiField("kn_cert_send_order_detail")
	private List<KnCertSendOrderDetail> subcertList;

	/** 
	 * 总的真正还可用的剩余有效点数
	 */
	@ApiField("total_remain_point")
	private Long totalRemainPoint;

	public void setSubcertList(List<KnCertSendOrderDetail> subcertList) {
		this.subcertList = subcertList;
	}
	public List<KnCertSendOrderDetail> getSubcertList( ) {
		return this.subcertList;
	}

	public void setTotalRemainPoint(Long totalRemainPoint) {
		this.totalRemainPoint = totalRemainPoint;
	}
	public Long getTotalRemainPoint( ) {
		return this.totalRemainPoint;
	}

}
