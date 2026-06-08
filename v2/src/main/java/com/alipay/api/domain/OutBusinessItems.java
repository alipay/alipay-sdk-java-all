package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务项信息引用类型对象
 *
 * @author auto create
 * @since 1.0, 2026-04-21 09:51:57
 */
public class OutBusinessItems extends AlipayObject {

	private static final long serialVersionUID = 5757736555679491346L;

	/**
	 * 服务项名称
	 */
	@ApiField("out_business_name")
	private String outBusinessName;

	/**
	 * 服务项订单唯一标识
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 服务项实收价格单位：分
	 */
	@ApiField("out_business_sale_price")
	private String outBusinessSalePrice;

	/**
	 * 履约单id
	 */
	@ApiField("out_custom_no")
	private String outCustomNo;

	/**
	 * 冲销原单据的结算单据号
	 */
	@ApiField("out_settle_no")
	private String outSettleNo;

	/**
	 * 冲销行为对应的唯一单据号
	 */
	@ApiField("out_writeoff_no")
	private String outWriteoffNo;

	/**
	 * 门店上的主体id
	 */
	@ApiField("to_subject_id")
	private String toSubjectId;

	/**
	 * 门店上的主体类型
	 */
	@ApiField("to_subject_type")
	private String toSubjectType;

	/**
	 * 冲销金额单位：分
	 */
	@ApiField("writeoff_price")
	private String writeoffPrice;

	/**
	 * 冲销时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("writeoff_time")
	private String writeoffTime;

	public String getOutBusinessName() {
		return this.outBusinessName;
	}
	public void setOutBusinessName(String outBusinessName) {
		this.outBusinessName = outBusinessName;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getOutBusinessSalePrice() {
		return this.outBusinessSalePrice;
	}
	public void setOutBusinessSalePrice(String outBusinessSalePrice) {
		this.outBusinessSalePrice = outBusinessSalePrice;
	}

	public String getOutCustomNo() {
		return this.outCustomNo;
	}
	public void setOutCustomNo(String outCustomNo) {
		this.outCustomNo = outCustomNo;
	}

	public String getOutSettleNo() {
		return this.outSettleNo;
	}
	public void setOutSettleNo(String outSettleNo) {
		this.outSettleNo = outSettleNo;
	}

	public String getOutWriteoffNo() {
		return this.outWriteoffNo;
	}
	public void setOutWriteoffNo(String outWriteoffNo) {
		this.outWriteoffNo = outWriteoffNo;
	}

	public String getToSubjectId() {
		return this.toSubjectId;
	}
	public void setToSubjectId(String toSubjectId) {
		this.toSubjectId = toSubjectId;
	}

	public String getToSubjectType() {
		return this.toSubjectType;
	}
	public void setToSubjectType(String toSubjectType) {
		this.toSubjectType = toSubjectType;
	}

	public String getWriteoffPrice() {
		return this.writeoffPrice;
	}
	public void setWriteoffPrice(String writeoffPrice) {
		this.writeoffPrice = writeoffPrice;
	}

	public String getWriteoffTime() {
		return this.writeoffTime;
	}
	public void setWriteoffTime(String writeoffTime) {
		this.writeoffTime = writeoffTime;
	}

}
