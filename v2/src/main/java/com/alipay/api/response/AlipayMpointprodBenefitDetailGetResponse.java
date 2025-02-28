package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mpointprod.benefit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:34
 */
public class AlipayMpointprodBenefitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8733247662368156979L;

	/** 
	 * 权益详情列表
	 */
	@ApiListField("benefit_infos")
	@ApiField("benefit_info")
	private List<BenefitInfo> benefitInfos;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述
	 */
	@ApiField("msg")
	private String msg;

	public void setBenefitInfos(List<BenefitInfo> benefitInfos) {
		this.benefitInfos = benefitInfos;
	}
	public List<BenefitInfo> getBenefitInfos( ) {
		return this.benefitInfos;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
