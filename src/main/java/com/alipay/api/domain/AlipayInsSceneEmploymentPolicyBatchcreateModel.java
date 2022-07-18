package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活用工批量投保
 *
 * @author auto create
 * @since 1.0, 2022-06-23 18:37:44
 */
public class AlipayInsSceneEmploymentPolicyBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 1619437534299786247L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 员工信息
	 */
	@ApiListField("employee_list")
	@ApiField("ins_employee")
	private List<InsEmployee> employeeList;

	/**
	 * 事件时间
	 */
	@ApiField("insure_time")
	private Date insureTime;

	/**
	 * 商户信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保障期限
	 */
	@ApiField("period")
	private String period;

	/**
	 * 推荐流水号
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	/**
	 * 投保场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<InsEmployee> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<InsEmployee> employeeList) {
		this.employeeList = employeeList;
	}

	public Date getInsureTime() {
		return this.insureTime;
	}
	public void setInsureTime(Date insureTime) {
		this.insureTime = insureTime;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRecomFlowNo() {
		return this.recomFlowNo;
	}
	public void setRecomFlowNo(String recomFlowNo) {
		this.recomFlowNo = recomFlowNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
