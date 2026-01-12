package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运营商行业流量商品
 *
 * @author auto create
 * @since 1.0, 2024-07-11 13:25:28
 */
public class FlowItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5364599114595885975L;

	/**
	 * 权益列表
	 */
	@ApiListField("benefit_list")
	@ApiField("item_benefit")
	private List<ItemBenefit> benefitList;

	/**
	 * 退订说明
	 */
	@ApiField("cancel_note")
	private String cancelNote;

	/**
	 * 商品详情说明
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 面额
	 */
	@ApiField("face")
	private String face;

	/**
	 * 流量类型
	 */
	@ApiField("flow_type")
	private String flowType;

	/**
	 * 常见问题列表
	 */
	@ApiListField("frequent_qa_list")
	@ApiField("item_frequent_q_a")
	private List<ItemFrequentQA> frequentQaList;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 产品介绍
	 */
	@ApiListField("introduction_list")
	@ApiField("item_introduction")
	private List<ItemIntroduction> introductionList;

	/**
	 * 运营商
	 */
	@ApiField("isp")
	private String isp;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否需要用户同意协议
	 */
	@ApiField("need_protocol")
	private Boolean needProtocol;

	/**
	 * 是否可跨月
	 */
	@ApiField("over_month")
	private String overMonth;

	/**
	 * 支付方式
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 有效期
	 */
	@ApiField("period")
	private String period;

	/**
	 * 是否自动续期
	 */
	@ApiField("persist")
	private String persist;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 价格说明
	 */
	@ApiField("price_note")
	private String priceNote;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 生效范围
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 验证码长度
	 */
	@ApiField("sms_code_length")
	private Long smsCodeLength;

	/**
	 * 商品状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 订购限制
	 */
	@ApiField("subscribe_limit")
	private String subscribeLimit;

	/**
	 * 生效日期
	 */
	@ApiField("valid_time")
	private String validTime;

	public List<ItemBenefit> getBenefitList() {
		return this.benefitList;
	}
	public void setBenefitList(List<ItemBenefit> benefitList) {
		this.benefitList = benefitList;
	}

	public String getCancelNote() {
		return this.cancelNote;
	}
	public void setCancelNote(String cancelNote) {
		this.cancelNote = cancelNote;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getFlowType() {
		return this.flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public List<ItemFrequentQA> getFrequentQaList() {
		return this.frequentQaList;
	}
	public void setFrequentQaList(List<ItemFrequentQA> frequentQaList) {
		this.frequentQaList = frequentQaList;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<ItemIntroduction> getIntroductionList() {
		return this.introductionList;
	}
	public void setIntroductionList(List<ItemIntroduction> introductionList) {
		this.introductionList = introductionList;
	}

	public String getIsp() {
		return this.isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNeedProtocol() {
		return this.needProtocol;
	}
	public void setNeedProtocol(Boolean needProtocol) {
		this.needProtocol = needProtocol;
	}

	public String getOverMonth() {
		return this.overMonth;
	}
	public void setOverMonth(String overMonth) {
		this.overMonth = overMonth;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPersist() {
		return this.persist;
	}
	public void setPersist(String persist) {
		this.persist = persist;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceNote() {
		return this.priceNote;
	}
	public void setPriceNote(String priceNote) {
		this.priceNote = priceNote;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public Long getSmsCodeLength() {
		return this.smsCodeLength;
	}
	public void setSmsCodeLength(Long smsCodeLength) {
		this.smsCodeLength = smsCodeLength;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getSubscribeLimit() {
		return this.subscribeLimit;
	}
	public void setSubscribeLimit(String subscribeLimit) {
		this.subscribeLimit = subscribeLimit;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}
