package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberEnterInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconference.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:05
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3787332199491999775L;

	/** 
	 * 用户进入信息
	 */
	@ApiListField("member_enter_infos")
	@ApiField("member_enter_info")
	private List<MemberEnterInfo> memberEnterInfos;

	public void setMemberEnterInfos(List<MemberEnterInfo> memberEnterInfos) {
		this.memberEnterInfos = memberEnterInfos;
	}
	public List<MemberEnterInfo> getMemberEnterInfos( ) {
		return this.memberEnterInfos;
	}

}
