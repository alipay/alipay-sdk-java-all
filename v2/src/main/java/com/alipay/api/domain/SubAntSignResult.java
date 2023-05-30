package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子任务受理流水
 *
 * @author auto create
 * @since 1.0, 2023-05-25 13:49:19
 */
public class SubAntSignResult extends AlipayObject {

	private static final long serialVersionUID = 7451675496462115645L;

	/**
	 * 签署链接结果列表
	 */
	@ApiListField("ant_sign_url_result_list")
	@ApiField("ant_sign_url_result")
	private List<AntSignUrlResult> antSignUrlResultList;

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

	public List<AntSignUrlResult> getAntSignUrlResultList() {
		return this.antSignUrlResultList;
	}
	public void setAntSignUrlResultList(List<AntSignUrlResult> antSignUrlResultList) {
		this.antSignUrlResultList = antSignUrlResultList;
	}

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
