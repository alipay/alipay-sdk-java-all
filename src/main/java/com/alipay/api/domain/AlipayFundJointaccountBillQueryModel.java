package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付账单查询
 *
 * @author auto create
 * @since 1.0, 2021-03-18 10:44:36
 */
public class AlipayFundJointaccountBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7464729899424442698L;

	/**
	 * 账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 截止日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 采用分页查询，本参数为空或0默认显示第一页。如果输入的值大于总页数，则支付宝返回最后一页数据
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小，不传的情况下默认20条，超过20条默认按20条查询；不足20条则按实际记录数返回
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 因公付产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 起始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 员工ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
