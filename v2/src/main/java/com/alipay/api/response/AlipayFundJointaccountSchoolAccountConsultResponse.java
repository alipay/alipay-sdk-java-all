package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JASchoolEntityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.school.account.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-07 11:02:38
 */
public class AlipayFundJointaccountSchoolAccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4626331647575525325L;

	/** 
	 * 返回学生是否加小荷包，若学生的证件号、姓名等信息不匹配则返回false
	 */
	@ApiField("has_registered")
	private Boolean hasRegistered;

	/** 
	 * 如果有对应的实体会返回实体id校内额度提醒校外额度提醒是否签约代扣
	 */
	@ApiListField("school_entity_info_list")
	@ApiField("j_a_school_entity_info")
	private List<JASchoolEntityInfo> schoolEntityInfoList;

	public void setHasRegistered(Boolean hasRegistered) {
		this.hasRegistered = hasRegistered;
	}
	public Boolean getHasRegistered( ) {
		return this.hasRegistered;
	}

	public void setSchoolEntityInfoList(List<JASchoolEntityInfo> schoolEntityInfoList) {
		this.schoolEntityInfoList = schoolEntityInfoList;
	}
	public List<JASchoolEntityInfo> getSchoolEntityInfoList( ) {
		return this.schoolEntityInfoList;
	}

}
