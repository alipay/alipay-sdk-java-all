package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AI面试报告批量查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class ResourceAihrInterviewReportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4681324328493434631L;

	/**
	 * null
	 */
	@ApiListField("ai_interview_id_list")
	@ApiField("string")
	private List<String> aiInterviewIdList;

	/**
	 * 对应系统租户，用于校验是否和APPID对应租户一致
	 */
	@ApiField("channel")
	private String channel;

	public List<String> getAiInterviewIdList() {
		return this.aiInterviewIdList;
	}
	public void setAiInterviewIdList(List<String> aiInterviewIdList) {
		this.aiInterviewIdList = aiInterviewIdList;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
