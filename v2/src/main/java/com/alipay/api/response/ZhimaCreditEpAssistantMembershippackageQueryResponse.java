package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-23 10:17:43
 */
public class ZhimaCreditEpAssistantMembershippackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4648182845997157463L;

	/** 
	 * null
	 */
	@ApiListField("licenses")
	@ApiField("string")
	private List<String> licenses;

	/** 
	 * 剩余可解锁数量
	 */
	@ApiField("unlock_right_num")
	private Long unlockRightNum;

	public void setLicenses(List<String> licenses) {
		this.licenses = licenses;
	}
	public List<String> getLicenses( ) {
		return this.licenses;
	}

	public void setUnlockRightNum(Long unlockRightNum) {
		this.unlockRightNum = unlockRightNum;
	}
	public Long getUnlockRightNum( ) {
		return this.unlockRightNum;
	}

}
