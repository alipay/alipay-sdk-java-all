package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户流水查询
 *
 * @author auto create
 * @since 1.0, 2022-09-20 17:02:13
 */
public class AlipayFincoreFunddsAccountlogWitnessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1491532682355734253L;

	/**
	 * 子户account_no,查询监管户流水不需要填写
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型,本次支持监管户和托管子户
SUPERVISED_ACC-监管户
ENTRUST_SUB_ACC-托管子户
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 此字段专门用于：存管户在支付宝收单类型入金场景下，按照支付宝交易单号查询该入金账务流水。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 结束时间，yyyy-mm-dd hh:mm:ss形式
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 查询页码，默认1。注：必须大于0
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，默认20。
注：0< pageSize <= 20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 签约产品码,唯一,区分资金存管服务产品类型
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 开始时间，yyyy-mm-dd hh:mm:ss形式
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 用户id|二级商户smid，查询子户时必填，查询监管户不填
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
