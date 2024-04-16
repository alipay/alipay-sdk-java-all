package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.usercenter.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-03 09:53:32
 */
public class AnttechOceanbaseUsercenterBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1658313188754825459L;

	/** 
	 * MEMBER=会员，HUAWEIMP_BUYER=华为云MP买家
	 */
	@ApiListField("entity_role_type_list")
	@ApiField("string")
	private List<String> entityRoleTypeList;

	/** 
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public void setEntityRoleTypeList(List<String> entityRoleTypeList) {
		this.entityRoleTypeList = entityRoleTypeList;
	}
	public List<String> getEntityRoleTypeList( ) {
		return this.entityRoleTypeList;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

}
