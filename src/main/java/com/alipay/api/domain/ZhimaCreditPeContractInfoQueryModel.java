package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:11:27
 */
public class ZhimaCreditPeContractInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6117879695335716135L;

	/**
	 * 活动名称，由芝麻分配
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 电子合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 支付宝ID
	 */
	@ApiField("uid")
	private String uid;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
