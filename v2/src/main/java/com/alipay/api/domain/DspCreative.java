package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素材信息
 *
 * @author auto create
 * @since 1.0, 2024-05-14 14:17:49
 */
public class DspCreative extends AlipayObject {

	private static final long serialVersionUID = 8615645178234548852L;

	/**
	 * 应用下载
	 */
	@ApiListField("app_download")
	@ApiField("dsp_app_download")
	private List<DspAppDownload> appDownload;

	/**
	 * 创意内容元数据列表
	 */
	@ApiListField("creative_elements")
	@ApiField("dsp_creative_element")
	private List<DspCreativeElement> creativeElements;

	/**
	 * 创意id
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 创意标签，包含创意来源等信息
	 */
	@ApiListField("creative_tags")
	@ApiField("string")
	private List<String> creativeTags;

	/**
	 * 唤端链接
	 */
	@ApiField("deeplink_url")
	private String deeplinkUrl;

	/**
	 * 素材失效日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 创意生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 跳转链接
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 行业id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public List<DspAppDownload> getAppDownload() {
		return this.appDownload;
	}
	public void setAppDownload(List<DspAppDownload> appDownload) {
		this.appDownload = appDownload;
	}

	public List<DspCreativeElement> getCreativeElements() {
		return this.creativeElements;
	}
	public void setCreativeElements(List<DspCreativeElement> creativeElements) {
		this.creativeElements = creativeElements;
	}

	public String getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}

	public List<String> getCreativeTags() {
		return this.creativeTags;
	}
	public void setCreativeTags(List<String> creativeTags) {
		this.creativeTags = creativeTags;
	}

	public String getDeeplinkUrl() {
		return this.deeplinkUrl;
	}
	public void setDeeplinkUrl(String deeplinkUrl) {
		this.deeplinkUrl = deeplinkUrl;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
