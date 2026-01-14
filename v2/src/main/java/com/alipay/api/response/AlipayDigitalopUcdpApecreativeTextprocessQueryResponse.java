package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TextProduceStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.textprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:46:41
 */
public class AlipayDigitalopUcdpApecreativeTextprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6679178131314449695L;

	/** 
	 * 文本产出进度
	 */
	@ApiListField("text_produce_status_list")
	@ApiField("text_produce_status")
	private List<TextProduceStatus> textProduceStatusList;

	public void setTextProduceStatusList(List<TextProduceStatus> textProduceStatusList) {
		this.textProduceStatusList = textProduceStatusList;
	}
	public List<TextProduceStatus> getTextProduceStatusList( ) {
		return this.textProduceStatusList;
	}

}
