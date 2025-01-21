package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云薪酬结算数据上传模型明细
 *
 * @author auto create
 * @since 1.0, 2023-10-26 11:16:19
 */
public class SalaryDataDetail extends AlipayObject {

	private static final long serialVersionUID = 2419437665985546965L;

	/**
	 * 指标名明细
	 */
	@ApiField("data_detail")
	private String dataDetail;

	/**
	 * 技能组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDataDetail() {
		return this.dataDetail;
	}
	public void setDataDetail(String dataDetail) {
		this.dataDetail = dataDetail;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
