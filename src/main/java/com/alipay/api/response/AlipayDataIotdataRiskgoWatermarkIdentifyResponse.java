package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.riskgo.watermark.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-09 16:09:39
 */
public class AlipayDataIotdataRiskgoWatermarkIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7186231149183687991L;

	/** 
	 * 调用错误信息
	 */
	@ApiField("info_msg")
	private String infoMsg;

	/** 
	 * 读取的水印内容
	 */
	@ApiField("watermark_content")
	private String watermarkContent;

	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String getInfoMsg( ) {
		return this.infoMsg;
	}

	public void setWatermarkContent(String watermarkContent) {
		this.watermarkContent = watermarkContent;
	}
	public String getWatermarkContent( ) {
		return this.watermarkContent;
	}

}
