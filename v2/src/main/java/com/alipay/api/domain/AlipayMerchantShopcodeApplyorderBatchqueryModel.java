package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询门店码开通流水记录
 *
 * @author auto create
 * @since 1.0, 2020-12-11 14:19:00
 */
public class AlipayMerchantShopcodeApplyorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2332712296727859681L;

	/**
	 * 支付宝侧生成的开通流水编号，可以通过传入该参数查询指定流水编号的开通状态。
	 */
	@ApiListField("apply_ids")
	@ApiField("string")
	private List<String> applyIds;

	/**
	 * 查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 开通门店码的商户支付宝登录ID，一般为手机号或邮箱
	 */
	@ApiListField("merchant_login_ids")
	@ApiField("string")
	private List<String> merchantLoginIds;

	/**
	 * 服务商操作员小二2088
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页查询数量，用于翻页查询，每次最多查询100条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务商侧生成的开通流水编号，可以通过传入该参数查询指定流水编号的开通状态。
	 */
	@ApiListField("request_ids")
	@ApiField("string")
	private List<String> requestIds;

	/**
	 * 外部间联商户PID，最多可传入100个
	 */
	@ApiListField("smids")
	@ApiField("string")
	private List<String> smids;

	/**
	 * 查询开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public List<String> getApplyIds() {
		return this.applyIds;
	}
	public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<String> getMerchantLoginIds() {
		return this.merchantLoginIds;
	}
	public void setMerchantLoginIds(List<String> merchantLoginIds) {
		this.merchantLoginIds = merchantLoginIds;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRequestIds() {
		return this.requestIds;
	}
	public void setRequestIds(List<String> requestIds) {
		this.requestIds = requestIds;
	}

	public List<String> getSmids() {
		return this.smids;
	}
	public void setSmids(List<String> smids) {
		this.smids = smids;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
