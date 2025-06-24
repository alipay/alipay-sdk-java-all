package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询反馈类型选项
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:02:02
 */
public class AlipayCommerceMedicalLargermodelFeedbackQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1434654589955899117L;

	/**
	 * 反馈渠道：
● 安诊儿app：azeApp
● 安诊儿小程序：azeMiniProgram
● 健康管家app：healthManagerApp
● 健康管家小程序：healthManagerMiniProgram
	 */
	@ApiField("feedback_channel")
	private String feedbackChannel;

	/**
	 * 反馈场景:
常规问答：generalQA
深度思考：deepThinking
深入问答追问：depthQAFollowUp
多模态反馈（报告解读、药盒识别）：multimodal
云陪诊：cloudAccompaniedAiagnosis
深度思考+多模态反馈：deepThinkingAndMultimodal
云陪诊住院反馈:ypzHospitalized
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 当【反馈场景】为【云陪诊】时必填
● 有：yes
● 无：no
	 */
	@ApiField("service_status")
	private String serviceStatus;

	public String getFeedbackChannel() {
		return this.feedbackChannel;
	}
	public void setFeedbackChannel(String feedbackChannel) {
		this.feedbackChannel = feedbackChannel;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

}
