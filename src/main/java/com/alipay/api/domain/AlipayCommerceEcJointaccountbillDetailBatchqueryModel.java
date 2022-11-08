package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业账单批量分页查询
 *
 * @author auto create
 * @since 1.0, 2022-07-22 09:48:32
 */
public class AlipayCommerceEcJointaccountbillDetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1859556196983973686L;

	/**
	 * 业务场景。不传默认为ISV_DEFAULT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 截止日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页数。本参数为空或小于1默认显示第一页；如果输入的值大于总页数，则返回最后一页数据。
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 20	每页大小。本参数为空或小于1默认20条；超过20条默认按20条查询；不足20条则按实际记录数返回。
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 起始日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 员工支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
