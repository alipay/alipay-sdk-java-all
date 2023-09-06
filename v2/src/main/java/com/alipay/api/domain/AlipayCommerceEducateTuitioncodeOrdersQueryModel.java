package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码订单查询
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:49:23
 */
public class AlipayCommerceEducateTuitioncodeOrdersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8743969243849742351L;

	/**
	 * 是否查询打款计划列表。true-查看；false-不查看
	 */
	@ApiField("include_plans")
	private Boolean includePlans;

	/**
	 * 当前分页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 场景，固定"XFM"
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级商户在直付通的smid值
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 若为空则查询全量，不支持多选。1打款调度中；2打款完成；3退款中；4退款完成。
	 */
	@ApiField("status")
	private String status;

	public Boolean getIncludePlans() {
		return this.includePlans;
	}
	public void setIncludePlans(Boolean includePlans) {
		this.includePlans = includePlans;
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
