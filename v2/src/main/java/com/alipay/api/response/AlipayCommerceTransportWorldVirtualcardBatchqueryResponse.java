package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayQueryCardModelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.virtualcard.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:37:43
 */
public class AlipayCommerceTransportWorldVirtualcardBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2495136641591616299L;

	/** 
	 * 虚拟卡信息查询结果列表
	 */
	@ApiListField("card_models")
	@ApiField("alipay_query_card_model_result")
	private List<AlipayQueryCardModelResult> cardModels;

	/** 
	 * 错误消息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务错误码
	 */
	@ApiField("sub_error_code")
	private String subErrorCode;

	public void setCardModels(List<AlipayQueryCardModelResult> cardModels) {
		this.cardModels = cardModels;
	}
	public List<AlipayQueryCardModelResult> getCardModels( ) {
		return this.cardModels;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setSubErrorCode(String subErrorCode) {
		this.subErrorCode = subErrorCode;
	}
	public String getSubErrorCode( ) {
		return this.subErrorCode;
	}

}
