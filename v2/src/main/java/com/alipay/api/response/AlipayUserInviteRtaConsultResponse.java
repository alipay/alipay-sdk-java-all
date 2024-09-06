package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RtaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.rta.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-04 14:10:42
 */
public class AlipayUserInviteRtaConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7748535675818926851L;

	/** 
	 * 一个或多个咨询策略标签，若返回多个标签，中间用“-”分隔
	 */
	@ApiField("principal_label")
	private String principalLabel;

	/** 
	 * 是否需要的流量，结果可为true和false
	 */
	@ApiField("required_flow")
	private Boolean requiredFlow;

	/** 
	 * rta咨询结果列表。最终结果形如：[{"accountId":"11111"},{"accountId":"22222"}]
	 */
	@ApiListField("rta_info_list")
	@ApiField("rta_info")
	private List<RtaInfo> rtaInfoList;

	public void setPrincipalLabel(String principalLabel) {
		this.principalLabel = principalLabel;
	}
	public String getPrincipalLabel( ) {
		return this.principalLabel;
	}

	public void setRequiredFlow(Boolean requiredFlow) {
		this.requiredFlow = requiredFlow;
	}
	public Boolean getRequiredFlow( ) {
		return this.requiredFlow;
	}

	public void setRtaInfoList(List<RtaInfo> rtaInfoList) {
		this.rtaInfoList = rtaInfoList;
	}
	public List<RtaInfo> getRtaInfoList( ) {
		return this.rtaInfoList;
	}

}
