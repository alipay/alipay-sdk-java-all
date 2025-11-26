package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业行政处罚当事人信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:16:44
 */
public class EpAdminPenaltyPartiesInfo extends AlipayObject {

	private static final long serialVersionUID = 3381744447693717838L;

	/**
	 * 当事人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 处罚详情
	 */
	@ApiListField("punish_details")
	@ApiField("ep_admin_penalty_punish_details_info")
	private List<EpAdminPenaltyPunishDetailsInfo> punishDetails;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<EpAdminPenaltyPunishDetailsInfo> getPunishDetails() {
		return this.punishDetails;
	}
	public void setPunishDetails(List<EpAdminPenaltyPunishDetailsInfo> punishDetails) {
		this.punishDetails = punishDetails;
	}

}
