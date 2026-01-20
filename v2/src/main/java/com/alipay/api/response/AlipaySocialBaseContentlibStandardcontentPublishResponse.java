package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.publish response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-28 10:47:41
 */
public class AlipaySocialBaseContentlibStandardcontentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3783427555699877782L;

	/** 
	 * 内容发布后生成的ID，请业务方保存到本地（用于关联查询内容详情、删除内容等其他开放接口）
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 用于提示发文成功后的一些提示信息，例如：内容挂载的POI位置信息不合法，请前往内容后台进行修改等
	 */
	@ApiField("extra_msg")
	private String extraMsg;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setExtraMsg(String extraMsg) {
		this.extraMsg = extraMsg;
	}
	public String getExtraMsg( ) {
		return this.extraMsg;
	}

}
