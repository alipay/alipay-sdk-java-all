package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询接口返回的流程审批信息
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:05
 */
public class ContractApprovalInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1629535217638287884L;

	/**
	 * 审批附件url列表
	 */
	@ApiListField("file_urls")
	@ApiField("string")
	private List<String> fileUrls;

	/**
	 * 审批环节
	 */
	@ApiField("node")
	private String node;

	/**
	 * 审批时间（格式如：2019-08-08 10:00:00）
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 审批人（姓名&花名）
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 审批意见
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 审批结果（待审核、通过、驳回）
	 */
	@ApiField("result")
	private String result;

	public List<String> getFileUrls() {
		return this.fileUrls;
	}
	public void setFileUrls(List<String> fileUrls) {
		this.fileUrls = fileUrls;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
