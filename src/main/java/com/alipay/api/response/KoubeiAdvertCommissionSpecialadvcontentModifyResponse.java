package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertSpecialAdvContentModifyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.specialadvcontent.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-29 17:17:16
 */
public class KoubeiAdvertCommissionSpecialadvcontentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4854986484153952623L;

	/** 
	 * 修改特殊广告内容的返回结果
	 */
	@ApiListField("data")
	@ApiField("kb_advert_special_adv_content_modify_response")
	private List<KbAdvertSpecialAdvContentModifyResponse> data;

	public void setData(List<KbAdvertSpecialAdvContentModifyResponse> data) {
		this.data = data;
	}
	public List<KbAdvertSpecialAdvContentModifyResponse> getData( ) {
		return this.data;
	}

}
