package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务流水批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-06-23 17:07:57
 */
public class MybankEcnyBizflowBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8529246114693568969L;

	/**
	 * 按不同场景约定传入对应账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 查询结束时间，必须大于开始时间，最大查询间隔需小于等于31天。返回结果日期小于等于2026-01-31 23:59:59
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 查询开始时间，返回结果日期大于等于2026-01-01 00:00:00
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 第一次查询为空，翻页查询取最后条记录的FlowNo
	 */
	@ApiField("next_cursor")
	private String nextCursor;

	/**
	 * 每页10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 仅支持字母、数字，作为幂等字段，需保证在调用方内部不重复
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 由双方约定分配值
	 */
	@ApiField("request_scene")
	private String requestScene;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getNextCursor() {
		return this.nextCursor;
	}
	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestScene() {
		return this.requestScene;
	}
	public void setRequestScene(String requestScene) {
		this.requestScene = requestScene;
	}

}
