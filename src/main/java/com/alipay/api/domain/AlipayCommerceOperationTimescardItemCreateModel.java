package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品创建
 *
 * @author auto create
 * @since 1.0, 2022-03-18 16:46:33
 */
public class AlipayCommerceOperationTimescardItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6327196445752865315L;

	/**
	 * 商品描述，不能超过16个字
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 2020-07-01 16:50:05
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 扩展属性
	 */
	@ApiField("ext_info")
	private ItemCreateExtInfo extInfo;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("isv_partner_id")
	private String isvPartnerId;

	/**
	 * 商品logo，建议尺寸260*260
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 原价，精确到分
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 外部业务单号，幂等用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 现价，精确到分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 2020-07-01 16:50:05
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 次数
	 */
	@ApiField("times")
	private Long times;

	/**
	 * 商品标题，不能超过13个字
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public ItemCreateExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ItemCreateExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIsvPartnerId() {
		return this.isvPartnerId;
	}
	public void setIsvPartnerId(String isvPartnerId) {
		this.isvPartnerId = isvPartnerId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Long getTimes() {
		return this.times;
	}
	public void setTimes(Long times) {
		this.times = times;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
