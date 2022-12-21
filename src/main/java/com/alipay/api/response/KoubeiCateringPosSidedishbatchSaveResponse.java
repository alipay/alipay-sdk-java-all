package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.sidedishbatch.save response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:51:17
 */
public class KoubeiCateringPosSidedishbatchSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2657838821273287369L;

	/** 
	 * 配料添加成功的菜品
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
