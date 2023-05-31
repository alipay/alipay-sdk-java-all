package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别结果
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:05
 */
public class SsdataDataserviceRiskAudioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3399597673811782194L;

	/**
	 * 调用识别服务的用户id，与使用ssdata.dataservice.risk.audio.set的creator一致
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 用户音频请求唯一识别码
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 风险类型，1-涉政模型， 2-涉黄模型。与ssdata.dataservice.risk.audio.verify接口传数据时的参数保持一致。
	 */
	@ApiListField("risk_type")
	@ApiField("string")
	private List<String> riskType;

	public String getChecker() {
		return this.checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getRiskType() {
		return this.riskType;
	}
	public void setRiskType(List<String> riskType) {
		this.riskType = riskType;
	}

}
