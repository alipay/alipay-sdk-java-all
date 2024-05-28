package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能营销素材处理接口
 *
 * @author auto create
 * @since 1.0, 2024-04-24 17:45:44
 */
public class AlipayCloudCloudpromoMaterialProcessApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8584618567895155578L;

	/**
	 * 图片的高度像素，默认750
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 图片url地址列表，最大暂时支持10张图片地址
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 外部业务号，作为幂等ID使用
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 素材处理场景，取以下枚举值：
WHITE_BACKGROUND（商品图白底化处理）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 模板id，用于指定背景优化方案（非必传）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 图片的宽度像素，默认750
	 */
	@ApiField("width")
	private Long width;

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

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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
