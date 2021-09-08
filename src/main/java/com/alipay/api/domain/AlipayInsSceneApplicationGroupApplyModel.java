package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多保单投保申请
 *
 * @author auto create
 * @since 1.0, 2019-08-26 16:49:02
 */
public class AlipayInsSceneApplicationGroupApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4521953651999586867L;

	/**
	 * 收件人
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保申请信息列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application")
	private List<InsApplication> applications;

	/**
	 * 保费支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 权益，可选不唯一，优惠使用，优惠决策时产生。
	 */
	@ApiListField("coupons")
	@ApiField("ins_coupon")
	private List<InsCoupon> coupons;

	/**
	 * 优惠单号，可选不唯一，优惠使用，优惠决策时产生。
	 */
	@ApiField("discount_id")
	private String discountId;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报价单号，可选不唯一，用于指定投保订单对应的报价单，报价时产生。
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public InsAddressee getAddressee() {
		return this.addressee;
	}
	public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public List<InsApplication> getApplications() {
		return this.applications;
	}
	public void setApplications(List<InsApplication> applications) {
		this.applications = applications;
	}

	public String getBillTitle() {
		return this.billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public List<InsCoupon> getCoupons() {
		return this.coupons;
	}
	public void setCoupons(List<InsCoupon> coupons) {
		this.coupons = coupons;
	}

	public String getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getQuoteBizId() {
		return this.quoteBizId;
	}
	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
