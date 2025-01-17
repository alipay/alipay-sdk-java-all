package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AiWeatherVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.weather.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-29 14:17:22
 */
public class AlipayCloudCloudpromoTravelWeatherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2852883747853888517L;

	/** 
	 * 天气结构
	 */
	@ApiField("ai_weather_vo")
	private AiWeatherVo aiWeatherVo;

	/** 
	 * 天气详情跳转链接
	 */
	@ApiField("result_url")
	private String resultUrl;

	public void setAiWeatherVo(AiWeatherVo aiWeatherVo) {
		this.aiWeatherVo = aiWeatherVo;
	}
	public AiWeatherVo getAiWeatherVo( ) {
		return this.aiWeatherVo;
	}

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}
	public String getResultUrl( ) {
		return this.resultUrl;
	}

}
