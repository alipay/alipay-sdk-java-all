package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryDetailPositionVO;
import com.alipay.api.domain.DeliveryDetailPositionPipelineConfigVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.customer.deliverydetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-24 11:07:40
 */
public class AntfortuneStockCustomerDeliverydetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8184988527249856429L;

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

	/** 
	 * 投放流水线配置，下发后消费方根据流水线配置就行处理
	 */
	@ApiListField("delivery_detail_position_pipeline_config")
	@ApiField("delivery_detail_position_pipeline_config_v_o")
	private List<DeliveryDetailPositionPipelineConfigVO> deliveryDetailPositionPipelineConfig;

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

	public void setDeliveryDetailPositionPipelineConfig(List<DeliveryDetailPositionPipelineConfigVO> deliveryDetailPositionPipelineConfig) {
		this.deliveryDetailPositionPipelineConfig = deliveryDetailPositionPipelineConfig;
	}
	public List<DeliveryDetailPositionPipelineConfigVO> getDeliveryDetailPositionPipelineConfig( ) {
		return this.deliveryDetailPositionPipelineConfig;
	}

}
