package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接入运营平台提报品牌box申请单数据详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:34
 */
public class SearchBrandItems extends AlipayObject {

	private static final long serialVersionUID = 6117781458523385459L;

	/**
	 * 品牌box状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 品牌box提报关键词
	 */
	@ApiListField("brand_box_keywords")
	@ApiField("string")
	private List<String> brandBoxKeywords;

	/**
	 * 品牌box提报模板id(一拖二或一拖四)
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * [{"detail":{"index":1,"name":"搜索1","desc":"111","url":"alipays://platformapi/startapp?appId=2021001105610428","img":"http://mdgwdev.alipay.net/$%7Bafts_bizKey%7D/afts/img/A*_fm5T7bUXKEAAAAAAAAAAAAAAQAAAQ/original","blockType":"TINYAPP","serviceCode":"2020052521000303956478","bizId":"2021001105610428","subServiceCode":"","version":"2","materialId":"SM2020081901393333"},"key":"b6726dc0-e1ee-11ea-a2fa-65a874e15ce1"},{"detail":{"index":2,"name":"搜索2","desc":"222","url":"alipays://platformapi/startApp?appId=20000047&gotoLifeDetail=true&publicBizType=LIFE_APP&publicId=201114215452&sourceId=globalsearch","img":"http://mdgwdev.alipay.net/$%7Bafts_bizKey%7D/afts/img/A*Tcr1SovzsWAAAAAAAAAAAAAAAQAAAQ/original","blockType":"PUBLIC_SERVICE","serviceCode":"2020052521000303956478","bizId":"2021001105610428","subServiceCode":"","version":"2","materialId":"SM2020081901393334"},"key":"b6726dc1-e1ee-11ea-a2fa-65a874e15ce1"}]
	 */
	@ApiListField("data")
	@ApiField("brand_box_detail")
	private List<BrandBoxDetail> data;

	/**
	 * 品牌box提报merchant_type
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 搜索模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBoxStatus() {
		return this.boxStatus;
	}
	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public List<String> getBrandBoxKeywords() {
		return this.brandBoxKeywords;
	}
	public void setBrandBoxKeywords(List<String> brandBoxKeywords) {
		this.brandBoxKeywords = brandBoxKeywords;
	}

	public String getBrandTemplateId() {
		return this.brandTemplateId;
	}
	public void setBrandTemplateId(String brandTemplateId) {
		this.brandTemplateId = brandTemplateId;
	}

	public List<BrandBoxDetail> getData() {
		return this.data;
	}
	public void setData(List<BrandBoxDetail> data) {
		this.data = data;
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
