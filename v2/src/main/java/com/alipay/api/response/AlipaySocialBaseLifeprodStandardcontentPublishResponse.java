package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifeprod.standardcontent.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-15 20:26:50
 */
public class AlipaySocialBaseLifeprodStandardcontentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 2692589725227219996L;

	/** 
	 * 内容发布后生成的ID，请业务方保存到本地（用于关联查询内容详情、删除内容等其他开放接口）
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
