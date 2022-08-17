package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手淘我淘支付宝大卡片信息的数据模型，数据用于展现支付宝卡片需要的信息
 *
 * @author auto create
 * @since 1.0, 2019-11-19 20:49:14
 */
public class BigCardData extends AlipayObject {

	private static final long serialVersionUID = 4397229223428465756L;

	/**
	 * 主文本行动点文案，在卡片的button处展现
	 */
	@ApiField("action_text")
	private String actionText;

	/**
	 * 业务码，拼音或者数字，用于我淘搜集相关卡片的展现信息，便于分析各个卡片的点击率等数据情况
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 主文本信息文案，如XXXX元，XXXX积分
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 主文本副文案，在主文本的下方作为补充说明
	 */
	@ApiField("biz_title")
	private String bizTitle;

	/**
	 * 主文本字体颜色（如12545元）
	 */
	@ApiField("color")
	private String color;

	/**
	 * 卡片的图链接， 1 图 400x400 (3x)， toolType 2 图 450x249 (3x) 或 300x166 (2x)，图片体积要求 50k 以内
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 左侧行动点图片链接，对应leftAction里面的imageUrl字段
	 */
	@ApiField("left_image_url")
	private String leftImageUrl;

	/**
	 * 左侧行动点链接，对应leftAction的targetUrl字段
	 */
	@ApiField("left_target_url")
	private String leftTargetUrl;

	/**
	 * 左侧行动点文案，对应leftAction里面的title字段
	 */
	@ApiField("left_title")
	private String leftTitle;

	/**
	 * 右侧行动点图片链接，对应rightAction里面的imageUrl字段
	 */
	@ApiField("right_image_url")
	private String rightImageUrl;

	/**
	 * 右侧行动点链接，对应rightAction的targetUrl字段
	 */
	@ApiField("right_target_url")
	private String rightTargetUrl;

	/**
	 * 右侧行动点文案，对应rightAction里面的title字段
	 */
	@ApiField("right_title")
	private String rightTitle;

	/**
	 * 支付宝卡片副标题文字内容
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 主文本行动点跳转链接
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 卡片类型，目前只会传1或2，标识工具类的类型1和类型2
	 */
	@ApiField("tool_type")
	private Long toolType;

	public String getActionText() {
		return this.actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizTitle() {
		return this.bizTitle;
	}
	public void setBizTitle(String bizTitle) {
		this.bizTitle = bizTitle;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLeftImageUrl() {
		return this.leftImageUrl;
	}
	public void setLeftImageUrl(String leftImageUrl) {
		this.leftImageUrl = leftImageUrl;
	}

	public String getLeftTargetUrl() {
		return this.leftTargetUrl;
	}
	public void setLeftTargetUrl(String leftTargetUrl) {
		this.leftTargetUrl = leftTargetUrl;
	}

	public String getLeftTitle() {
		return this.leftTitle;
	}
	public void setLeftTitle(String leftTitle) {
		this.leftTitle = leftTitle;
	}

	public String getRightImageUrl() {
		return this.rightImageUrl;
	}
	public void setRightImageUrl(String rightImageUrl) {
		this.rightImageUrl = rightImageUrl;
	}

	public String getRightTargetUrl() {
		return this.rightTargetUrl;
	}
	public void setRightTargetUrl(String rightTargetUrl) {
		this.rightTargetUrl = rightTargetUrl;
	}

	public String getRightTitle() {
		return this.rightTitle;
	}
	public void setRightTitle(String rightTitle) {
		this.rightTitle = rightTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Long getToolType() {
		return this.toolType;
	}
	public void setToolType(Long toolType) {
		this.toolType = toolType;
	}

}
