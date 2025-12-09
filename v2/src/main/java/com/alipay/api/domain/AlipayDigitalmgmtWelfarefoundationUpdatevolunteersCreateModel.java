package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量新增蚂蚁公益基金会志愿者
 *
 * @author auto create
 * @since 1.0, 2023-06-16 11:22:21
 */
public class AlipayDigitalmgmtWelfarefoundationUpdatevolunteersCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4792468597891283541L;

	/**
	 * 租户编码
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 志愿者信息
	 */
	@ApiListField("volunteers")
	@ApiField("add_volunteer_req")
	private List<AddVolunteerReq> volunteers;

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public List<AddVolunteerReq> getVolunteers() {
		return this.volunteers;
	}
	public void setVolunteers(List<AddVolunteerReq> volunteers) {
		this.volunteers = volunteers;
	}

}
