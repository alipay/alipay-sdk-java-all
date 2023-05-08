package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改商家人群
 *
 * @author auto create
 * @since 1.0, 2023-03-19 16:40:49
 */
public class AlipayMerchantQipanCrowdModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2169621787677766414L;

	/**
	 * 人群应用渠道
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 商家人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

}
