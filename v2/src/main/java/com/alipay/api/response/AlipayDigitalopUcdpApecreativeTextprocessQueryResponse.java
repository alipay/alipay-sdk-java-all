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
 * @since 1.0, 2023-07-26 20:11:51
 */
public class AlipayDigitalopUcdpApecreativeTextprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2644669147588828272L;

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
