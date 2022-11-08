package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 橡实接口：查询迭代版本信息
 *
 * @author auto create
 * @since 1.0, 2022-06-08 17:47:42
 */
public class AnttechBlockchainVersionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6463335215588715281L;

	/**
	 * 商务ID
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 是否部署
	 */
	@ApiField("is_troop")
	private Boolean isTroop;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 产品线ID
	 */
	@ApiField("product_line_id")
	private String productLineId;

	/**
	 * BAAS公有云3月中旬迭代
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 版本号
	 */
	@ApiField("version_num")
	private String versionNum;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getIsTroop() {
		return this.isTroop;
	}
	public void setIsTroop(Boolean isTroop) {
		this.isTroop = isTroop;
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

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductLineId() {
		return this.productLineId;
	}
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getVersionNum() {
		return this.versionNum;
	}
	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

}
