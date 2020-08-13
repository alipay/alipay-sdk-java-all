package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:05:58
 */
public class SsdataDataserviceRiskAudioVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7754684716515469226L;

	/**
	 * 需要识别的音频转换后的数据，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符.
	 */
	@ApiField("audio_content")
	private String audioContent;

	/**
	 * 表明用户上传的音频数据格式
	 */
	@ApiField("audio_type")
	private String audioType;

	/**
	 * 调用识别服务的用户id，与使用ssdata.dataservice.risk.audio.set的creator一致
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 风险类型， 1-涉政模型， 2-涉黄模型
	 */
	@ApiListField("risk_type")
	@ApiField("string")
	private List<String> riskType;

	/**
	 * 表明用户上传的音频数据采样率
	 */
	@ApiField("sample_rate")
	private String sampleRate;

	public String getAudioContent() {
		return this.audioContent;
	}
	public void setAudioContent(String audioContent) {
		this.audioContent = audioContent;
	}

	public String getAudioType() {
		return this.audioType;
	}
	public void setAudioType(String audioType) {
		this.audioType = audioType;
	}

	public String getChecker() {
		return this.checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}

	public List<String> getRiskType() {
		return this.riskType;
	}
	public void setRiskType(List<String> riskType) {
		this.riskType = riskType;
	}

	public String getSampleRate() {
		return this.sampleRate;
	}
	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

}
