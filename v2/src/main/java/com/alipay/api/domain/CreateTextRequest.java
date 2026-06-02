package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 动态在百灵平台创建及发布文案,支持批量操作
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:44
 */
public class CreateTextRequest extends AlipayObject {

	private static final long serialVersionUID = 3165169624915282724L;

	/**
	 * null
	 */
	@ApiListField("common_text_list")
	@ApiField("common_text_req")
	private List<CommonTextReq> commonTextList;

	/**
	 * 是否直接发布
	 */
	@ApiField("publish_flag")
	private Boolean publishFlag;

	/**
	 * 工号
例如:xxxxxx
	 */
	@ApiField("work_id")
	private String workId;

	public List<CommonTextReq> getCommonTextList() {
		return this.commonTextList;
	}
	public void setCommonTextList(List<CommonTextReq> commonTextList) {
		this.commonTextList = commonTextList;
	}

	public Boolean getPublishFlag() {
		return this.publishFlag;
	}
	public void setPublishFlag(Boolean publishFlag) {
		this.publishFlag = publishFlag;
	}

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
