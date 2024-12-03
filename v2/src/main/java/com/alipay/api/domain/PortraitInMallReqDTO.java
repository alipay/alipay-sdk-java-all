package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈内画像请求参数
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class PortraitInMallReqDTO extends AlipayObject {

	private static final long serialVersionUID = 2199214352899979233L;

	/**
	 * 居住人口需要分析的标签；
职业分布TOP10和职业分布TOP50请只选择其中的一个。
	 */
	@ApiListField("live_user_tag")
	@ApiField("string")
	private List<String> liveUserTag;

	/**
	 * 常驻人口下需要分析的标签；
职业分布TOP10和职业分布TOP50请只选择其中的一个。
	 */
	@ApiListField("settled_user_tag")
	@ApiField("string")
	private List<String> settledUserTag;

	/**
	 * 工作人口下需要分析的标签；
职业分布TOP10和职业分布TOP50请只选择其中的一个。
	 */
	@ApiListField("work_user_tag")
	@ApiField("string")
	private List<String> workUserTag;

	public List<String> getLiveUserTag() {
		return this.liveUserTag;
	}
	public void setLiveUserTag(List<String> liveUserTag) {
		this.liveUserTag = liveUserTag;
	}

	public List<String> getSettledUserTag() {
		return this.settledUserTag;
	}
	public void setSettledUserTag(List<String> settledUserTag) {
		this.settledUserTag = settledUserTag;
	}

	public List<String> getWorkUserTag() {
		return this.workUserTag;
	}
	public void setWorkUserTag(List<String> workUserTag) {
		this.workUserTag = workUserTag;
	}

}
