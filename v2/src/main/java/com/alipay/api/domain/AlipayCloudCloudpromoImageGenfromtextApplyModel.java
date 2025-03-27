package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AIGC文生图接口
 *
 * @author auto create
 * @since 1.0, 2023-12-13 10:40:42
 */
public class AlipayCloudCloudpromoImageGenfromtextApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8662981529276668529L;

	/**
	 * 图片的高度像素
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 生成图片的数量，限制在1-4之间
	 */
	@ApiField("image_num")
	private Long imageNum;

	/**
	 * 参考开放平台行业类目的一级-二级-三级类目，多级以”-“连接
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 不希望出现在图片里的内容
	 */
	@ApiField("negative_prompt")
	private String negativePrompt;

	/**
	 * 外部业务号，做幂等id使用
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 生成图片的提示词
	 */
	@ApiField("prompt")
	private String prompt;

	/**
	 * 图片的宽度像素
	 */
	@ApiField("width")
	private Long width;

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getImageNum() {
		return this.imageNum;
	}
	public void setImageNum(Long imageNum) {
		this.imageNum = imageNum;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getNegativePrompt() {
		return this.negativePrompt;
	}
	public void setNegativePrompt(String negativePrompt) {
		this.negativePrompt = negativePrompt;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getPrompt() {
		return this.prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
