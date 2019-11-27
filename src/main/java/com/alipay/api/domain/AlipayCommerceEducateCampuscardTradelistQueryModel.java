package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园一卡通消费记录
 *
 * @author auto create
 * @since 1.0, 2019-02-20 11:35:28
 */
public class AlipayCommerceEducateCampuscardTradelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2567978477931981455L;

	/**
	 * 开始日期，格式：2019-02-23，包含日期当天记录
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 记录开始位置，开始位置从0开始
	 */
	@ApiField("begin_index")
	private Long beginIndex;

	/**
	 * 返回的最大记录条数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 结束日期，格式：2019-02-24，包含日期当天记录
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 一卡通实体卡号
	 */
	@ApiField("physical_card_number")
	private String physicalCardNumber;

	/**
	 * 学校标识码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public Long getBeginIndex() {
		return this.beginIndex;
	}
	public void setBeginIndex(Long beginIndex) {
		this.beginIndex = beginIndex;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPhysicalCardNumber() {
		return this.physicalCardNumber;
	}
	public void setPhysicalCardNumber(String physicalCardNumber) {
		this.physicalCardNumber = physicalCardNumber;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
