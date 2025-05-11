package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云营销图片优化
 *
 * @author auto create
 * @since 1.0, 2023-11-28 12:04:21
 */
public class AlipayCloudCloudpromoImageOptimizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1881242653481728346L;

	/**
	 * 背景图片地址
	 */
	@ApiField("background")
	private String background;

	/**
	 * 图片的高度像素，默认512
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 图片url地址列表，最大支持20张图片地址
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 参考开放平台行业类目的一级-二级-三级类目，多级以”-“连接
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 模板ID用于指定优化方案（非必传）
人像漫改可用模板id：portrait_STYLE_makotoshinkai-single（新海诚）、portrait_STYLE_coloredPencil-single（彩铅）、portrait_STYLE_miyazakihayao-single（宫崎骏）、portrait_STYLE_cyberpunk（赛博朋克）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 图片的宽度像素，默认512
	 */
	@ApiField("width")
	private Long width;

	public String getBackground() {
		return this.background;
	}
	public void setBackground(String background) {
		this.background = background;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
