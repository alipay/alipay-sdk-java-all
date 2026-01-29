package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单个主记录+对应资金明细信息模型
 *
 * @author auto create
 * @since 1.0, 2023-01-30 20:03:19
 */
public class SingleFundDetailItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 4217817433178434888L;

	/**
	 * 批次资金明细模型列表
	 */
	@ApiListField("batch_fund_item_model_list")
	@ApiField("batch_fund_item_a_o_p_model")
	private List<BatchFundItemAOPModel> batchFundItemModelList;

	/**
	 * 消费记录主记录
	 */
	@ApiField("consume_record")
	private ConsumeRecordAOPModel consumeRecord;

	public List<BatchFundItemAOPModel> getBatchFundItemModelList() {
		return this.batchFundItemModelList;
	}
	public void setBatchFundItemModelList(List<BatchFundItemAOPModel> batchFundItemModelList) {
		this.batchFundItemModelList = batchFundItemModelList;
	}

	public ConsumeRecordAOPModel getConsumeRecord() {
		return this.consumeRecord;
	}
	public void setConsumeRecord(ConsumeRecordAOPModel consumeRecord) {
		this.consumeRecord = consumeRecord;
	}

}
