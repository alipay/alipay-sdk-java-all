package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeliveryDetailPositionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.customer.deliverydetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-19 17:42:12
 */
public class AntfortuneStockCustomerDeliverydetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1775239348966286969L;

	/** 
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 用户投放展位内容数组
	 */
	@ApiField("delivery_detail_position")
	private DeliveryDetailPositionVO deliveryDetailPosition;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setDeliveryDetailPosition(DeliveryDetailPositionVO deliveryDetailPosition) {
		this.deliveryDetailPosition = deliveryDetailPosition;
	}
	public DeliveryDetailPositionVO getDeliveryDetailPosition( ) {
		return this.deliveryDetailPosition;
	}

}
