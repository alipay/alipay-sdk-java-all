package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数
 *
 * @author auto create
 * @since 1.0, 2026-01-21 10:12:42
 */
public class IitBizDetailBillQueryPageOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 6637912316635353769L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 一般是对应业务的销售产品码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 机构Id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 期间，月份
	 */
	@ApiField("period")
	private String period;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

}
