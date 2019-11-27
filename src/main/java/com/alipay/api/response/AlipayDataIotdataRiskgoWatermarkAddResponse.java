package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.riskgo.watermark.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-09 16:05:51
 */
public class AlipayDataIotdataRiskgoWatermarkAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7425637285393795834L;

	/** 
	 * 加完水印的图片OSS地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/** 
	 * 内部调用返回信息
	 */
	@ApiField("info_msg")
	private String infoMsg;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String getInfoMsg( ) {
		return this.infoMsg;
	}

}
