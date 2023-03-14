package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.desk.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:18:49
 */
public class KoubeiCateringPosDeskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8145749958847521156L;

	/** 
	 * 桌位ID
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	public List<String> getIds( ) {
		return this.ids;
	}

}
