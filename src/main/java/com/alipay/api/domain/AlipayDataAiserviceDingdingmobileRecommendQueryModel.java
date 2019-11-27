package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 拉新推荐服务
 *
 * @author auto create
 * @since 1.0, 2019-08-14 15:13:52
 */
public class AlipayDataAiserviceDingdingmobileRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8814153356747337465L;

	/**
	 * 参数名：candidate_mobile。
应用场景：拉新推荐中候选的新用户的手机号。
生成方式：业务方传入
	 */
	@ApiListField("candidate_mobile")
	@ApiField("string")
	private List<String> candidateMobile;

	/**
	 * 手机号码，1864234324324
	 */
	@ApiField("mobile")
	private String mobile;

	public List<String> getCandidateMobile() {
		return this.candidateMobile;
	}
	public void setCandidateMobile(List<String> candidateMobile) {
		this.candidateMobile = candidateMobile;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
