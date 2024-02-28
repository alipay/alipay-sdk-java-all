package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户订阅状态查询接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 23:24:26
 */
public class AlipayCommerceMedicalUsermessageSubscriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5492241416755848164L;

	/**
	 * 固定值：医保动账，5
	 */
	@ApiField("industry_type_id")
	private Long industryTypeId;

	/**
	 * 用户openId列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public Long getIndustryTypeId() {
		return this.industryTypeId;
	}
	public void setIndustryTypeId(Long industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
