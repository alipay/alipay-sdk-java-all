package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.sidedishbatch.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class KoubeiCateringPosSidedishbatchSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7218229595983223895L;

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
