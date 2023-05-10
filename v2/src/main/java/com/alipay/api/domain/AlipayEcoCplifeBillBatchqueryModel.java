package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业费账单数据批量查询
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:35:24
 */
public class AlipayEcoCplifeBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4863781463217128154L;

	/**
	 * 查询过滤条件之一：
根据账期查询
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 查询过滤条件之一：
根据开发者上传物业费账单时需要的批次号查询指定批次下上传成功的账单。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 查询过滤条件之一：根据账单状态查询，不传该字段则返回所有状态的账单。

状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
WAIT_PAYMENT - 待缴且未过缴费截止日期
OUT_OF_DATE - 未支付且已过缴费截止日期
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 支付宝社区小区统一编号，必须在授权物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 查询过滤条件之一：
根据费用类型查询，只支持精确查询。
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 查询过滤条件之一：
根据物业系统端房屋编号查询
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 分页查询的当前页码数，分页从1开始计数。
该参数不传入的时候，默认为1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数，取值范围1-500。
不传该参数默认为200。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询过滤条件之一：
根据出账日期查询，格式为YYYYMMDD，只支持精确查询。
	 */
	@ApiField("release_day")
	private String releaseDay;

	public String getAcctPeriod() {
		return this.acctPeriod;
	}
	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCostType() {
		return this.costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getReleaseDay() {
		return this.releaseDay;
	}
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

}
