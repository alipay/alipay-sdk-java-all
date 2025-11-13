package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZXZExpertFrameworkList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.expertframework.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:37:03
 */
public class AntfortuneFinresearchExpertframeworkListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5688453338225145363L;

	/** 
	 * 返回值里面是预设专家框架列表信息，包括了框架名称。介绍，所属的大类等信息
	 */
	@ApiField("expert_frameworks")
	private ZXZExpertFrameworkList expertFrameworks;

	public void setExpertFrameworks(ZXZExpertFrameworkList expertFrameworks) {
		this.expertFrameworks = expertFrameworks;
	}
	public ZXZExpertFrameworkList getExpertFrameworks( ) {
		return this.expertFrameworks;
	}

}
