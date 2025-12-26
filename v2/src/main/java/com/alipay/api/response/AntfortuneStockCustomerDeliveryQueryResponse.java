package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryPositionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.customer.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-03 16:02:03
 */
public class AntfortuneStockCustomerDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7725979934861191767L;

	/** 
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 用户投放展位内容
	 */
	@ApiListField("delivery_position")
	@ApiField("delivery_position_v_o")
	private List<DeliveryPositionVO> deliveryPosition;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setDeliveryPosition(List<DeliveryPositionVO> deliveryPosition) {
		this.deliveryPosition = deliveryPosition;
	}
	public List<DeliveryPositionVO> getDeliveryPosition( ) {
		return this.deliveryPosition;
	}

}
