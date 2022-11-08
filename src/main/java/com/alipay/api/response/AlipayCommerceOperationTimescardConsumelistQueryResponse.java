package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TimeCardConsumeCardInfo;
import com.alipay.api.domain.TimeCardConsumerRecordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.consumelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-30 21:13:11
 */
public class AlipayCommerceOperationTimescardConsumelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4645327217175681621L;

	/** 
	 * 次卡信息
	 */
	@ApiField("card_info")
	private TimeCardConsumeCardInfo cardInfo;

	/** 
	 * 次卡消费记录列表
	 */
	@ApiListField("consume_record")
	@ApiField("time_card_consumer_record_info")
	private List<TimeCardConsumerRecordInfo> consumeRecord;

	public void setCardInfo(TimeCardConsumeCardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}
	public TimeCardConsumeCardInfo getCardInfo( ) {
		return this.cardInfo;
	}

	public void setConsumeRecord(List<TimeCardConsumerRecordInfo> consumeRecord) {
		this.consumeRecord = consumeRecord;
	}
	public List<TimeCardConsumerRecordInfo> getConsumeRecord( ) {
		return this.consumeRecord;
	}

}
