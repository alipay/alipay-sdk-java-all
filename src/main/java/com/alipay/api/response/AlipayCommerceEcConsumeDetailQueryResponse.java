package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcConsumeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.consume.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 20:01:44
 */
public class AlipayCommerceEcConsumeDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5733381563698418672L;

	/** 
	 * 账单信息
	 */
	@ApiField("consume_info")
	private EcConsumeInfo consumeInfo;

	/** 
	 * 关联账单列表
	 */
	@ApiListField("related_refund_list")
	@ApiField("ec_consume_info")
	private List<EcConsumeInfo> relatedRefundList;

	public void setConsumeInfo(EcConsumeInfo consumeInfo) {
		this.consumeInfo = consumeInfo;
	}
	public EcConsumeInfo getConsumeInfo( ) {
		return this.consumeInfo;
	}

	public void setRelatedRefundList(List<EcConsumeInfo> relatedRefundList) {
		this.relatedRefundList = relatedRefundList;
	}
	public List<EcConsumeInfo> getRelatedRefundList( ) {
		return this.relatedRefundList;
	}

}
