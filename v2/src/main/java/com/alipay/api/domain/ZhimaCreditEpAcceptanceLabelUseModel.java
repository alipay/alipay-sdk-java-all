package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 实力标场景使用效果上报
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:53:14
 */
public class ZhimaCreditEpAcceptanceLabelUseModel extends AlipayObject {

	private static final long serialVersionUID = 8163495929883274388L;

	/**
	 * 实力标场景表现数据
	 */
	@ApiListField("feedback_data")
	@ApiField("label_feedback_detail_model")
	private List<LabelFeedbackDetailModel> feedbackData;

	/**
	 * 场景码，实力标查询企信分配给商户的场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<LabelFeedbackDetailModel> getFeedbackData() {
		return this.feedbackData;
	}
	public void setFeedbackData(List<LabelFeedbackDetailModel> feedbackData) {
		this.feedbackData = feedbackData;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
