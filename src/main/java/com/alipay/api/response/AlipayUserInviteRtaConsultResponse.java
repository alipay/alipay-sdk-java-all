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
 * @since 1.0, 2020-03-03 10:50:07
 */
public class AlipayUserInviteRtaConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8121662188453184295L;

	/** 
	 * 人群标签
	 */
	@ApiField("principal_label")
	private String principalLabel;

	/** 
	 * 是否需要的流量
	 */
	@ApiField("required_flow")
	private Boolean requiredFlow;

	/** 
	 * rta咨询结果列表
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
