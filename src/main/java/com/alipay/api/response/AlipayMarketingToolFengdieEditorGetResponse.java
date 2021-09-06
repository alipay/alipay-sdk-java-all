package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieEditorGetRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.editor.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-25 21:55:55
 */
public class AlipayMarketingToolFengdieEditorGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3742638874554882423L;

	/** 
	 * 唤起云凤蝶站点编辑器返回模型，包含 编辑器具体免登的url
	 */
	@ApiField("data")
	private FengdieEditorGetRespModel data;

	public void setData(FengdieEditorGetRespModel data) {
		this.data = data;
	}
	public FengdieEditorGetRespModel getData( ) {
		return this.data;
	}

}
