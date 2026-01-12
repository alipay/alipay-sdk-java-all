package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditBankTraining;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.creditbank.training.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEducateCreditbankTrainingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1873734496637556223L;

	/** 
	 * 培训记录
	 */
	@ApiListField("training")
	@ApiField("credit_bank_training")
	private List<CreditBankTraining> training;

	public void setTraining(List<CreditBankTraining> training) {
		this.training = training;
	}
	public List<CreditBankTraining> getTraining( ) {
		return this.training;
	}

}
