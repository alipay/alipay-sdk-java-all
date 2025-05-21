package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AiPicture;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aigc.aipicture.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 13:53:27
 */
public class AlipayUserAigcAipictureBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5647474341221366457L;

	/** 
	 * AIGC生成的多媒体图片列表
	 */
	@ApiListField("pic_list")
	@ApiField("ai_picture")
	private List<AiPicture> picList;

	public void setPicList(List<AiPicture> picList) {
		this.picList = picList;
	}
	public List<AiPicture> getPicList( ) {
		return this.picList;
	}

}
