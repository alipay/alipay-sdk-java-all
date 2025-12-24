package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌box工单详情数据信息
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:52:54
 */
public class SearchOrderDetailDataBrandItems extends AlipayObject {

	private static final long serialVersionUID = 3579476175641915598L;

	/**
	 * 工单详情bizid
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 上下架状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 关键词信息
	 */
	@ApiField("brand_box_keywords")
	private String brandBoxKeywords;

	/**
	 * 工单详情数据信息
	 */
	@ApiListField("brand_detail_list")
	@ApiField("search_order_brand_detail")
	private List<SearchOrderBrandDetail> brandDetailList;

	/**
	 * 品牌展示模板类型
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 工单详情数据channel
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 工单详情数据merchant_type
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBoxStatus() {
		return this.boxStatus;
	}
	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public String getBrandBoxKeywords() {
		return this.brandBoxKeywords;
	}
	public void setBrandBoxKeywords(String brandBoxKeywords) {
		this.brandBoxKeywords = brandBoxKeywords;
	}

	public List<SearchOrderBrandDetail> getBrandDetailList() {
		return this.brandDetailList;
	}
	public void setBrandDetailList(List<SearchOrderBrandDetail> brandDetailList) {
		this.brandDetailList = brandDetailList;
	}

	public String getBrandTemplateId() {
		return this.brandTemplateId;
	}
	public void setBrandTemplateId(String brandTemplateId) {
		this.brandTemplateId = brandTemplateId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
