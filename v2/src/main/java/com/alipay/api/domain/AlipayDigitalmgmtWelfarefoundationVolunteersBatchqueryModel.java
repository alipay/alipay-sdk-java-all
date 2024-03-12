package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 志愿者活动时批量查询
 *
 * @author auto create
 * @since 1.0, 2023-06-16 11:22:35
 */
public class AlipayDigitalmgmtWelfarefoundationVolunteersBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2851917116215869827L;

	/**
	 * 人员ID
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	/**
	 * 蚂蚁公益基金会
	 */
	@ApiField("tenant")
	private String tenant;

	public List<String> getIds() {
		return this.ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
