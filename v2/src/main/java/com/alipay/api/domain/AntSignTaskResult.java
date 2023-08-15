package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署任务结果列表
 *
 * @author auto create
 * @since 1.0, 2023-05-17 14:19:18
 */
public class AntSignTaskResult extends AlipayObject {

	private static final long serialVersionUID = 2284391283755799994L;

	/**
	 * 签署完成的文件列表
	 */
	@ApiListField("ant_sign_file_result_list")
	@ApiField("ant_sign_file_result")
	private List<AntSignFileResult> antSignFileResultList;

	/**
	 * 签署人状态列表
	 */
	@ApiListField("ant_sign_operator_result_list")
	@ApiField("ant_sign_operator_result")
	private List<AntSignOperatorResult> antSignOperatorResultList;

	/**
	 * 签署子任务id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/**
	 * 签署子任务的状态
	 */
	@ApiField("sign_task_status")
	private String signTaskStatus;

	/**
	 * 子任务流水号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	public List<AntSignFileResult> getAntSignFileResultList() {
		return this.antSignFileResultList;
	}
	public void setAntSignFileResultList(List<AntSignFileResult> antSignFileResultList) {
		this.antSignFileResultList = antSignFileResultList;
	}

	public List<AntSignOperatorResult> getAntSignOperatorResultList() {
		return this.antSignOperatorResultList;
	}
	public void setAntSignOperatorResultList(List<AntSignOperatorResult> antSignOperatorResultList) {
		this.antSignOperatorResultList = antSignOperatorResultList;
	}

	public String getSignTaskId() {
		return this.signTaskId;
	}
	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}

	public String getSignTaskStatus() {
		return this.signTaskStatus;
	}
	public void setSignTaskStatus(String signTaskStatus) {
		this.signTaskStatus = signTaskStatus;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

}
