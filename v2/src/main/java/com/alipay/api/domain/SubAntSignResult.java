package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子任务受理流水
 *
 * @author auto create
 * @since 1.0, 2023-05-15 09:39:26
 */
public class SubAntSignResult extends AlipayObject {

	private static final long serialVersionUID = 1519847827963182583L;

	/**
	 * 我方签署方id
	 */
	@ApiField("our_user_id")
	private String ourUserId;

	/**
	 * 是否关联业务 true:关联  false：不关联
	 */
	@ApiField("related_business")
	private Boolean relatedBusiness;

	/**
	 * 子任务id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/**
	 * 子业务流水号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	public String getOurUserId() {
		return this.ourUserId;
	}
	public void setOurUserId(String ourUserId) {
		this.ourUserId = ourUserId;
	}

	public Boolean getRelatedBusiness() {
		return this.relatedBusiness;
	}
	public void setRelatedBusiness(Boolean relatedBusiness) {
		this.relatedBusiness = relatedBusiness;
	}

	public String getSignTaskId() {
		return this.signTaskId;
	}
	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

}
