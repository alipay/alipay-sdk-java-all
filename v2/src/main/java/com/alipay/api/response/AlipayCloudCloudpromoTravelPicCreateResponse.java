package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.pic.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 10:32:28
 */
public class AlipayCloudCloudpromoTravelPicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1235586735271683348L;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 游历分享图片
	 */
	@ApiField("travel_pic")
	private String travelPic;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTravelPic(String travelPic) {
		this.travelPic = travelPic;
	}
	public String getTravelPic( ) {
		return this.travelPic;
	}

}
