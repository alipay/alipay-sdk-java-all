package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape推荐策略配置
 *
 * @author auto create
 * @since 1.0, 2023-06-26 15:42:52
 */
public class ApeRecommendStrategy extends AlipayObject {

	private static final long serialVersionUID = 5199325444272542437L;

	/**
	 * 点击疲劳的时间间隔，30m表示30分钟，1h表示1小时
	 */
	@ApiField("fatigue_click_interval")
	private String fatigueClickInterval;

	/**
	 * 曝光疲劳的时间间隔，30m表示30分钟，1h表示1小时
	 */
	@ApiField("fatigue_expose_interval")
	private String fatigueExposeInterval;

	/**
	 * 按品牌打散时，不能出现重复的相邻商品个数
	 */
	@ApiField("scatter_brand_window_size")
	private Long scatterBrandWindowSize;

	/**
	 * 商品类目等级，支持1-4级类目
	 */
	@ApiField("scatter_cate_level")
	private Long scatterCateLevel;

	/**
	 * 按类目打散时，不能出现重复的相邻商品个数
	 */
	@ApiField("scatter_cate_window_size")
	private Long scatterCateWindowSize;

	/**
	 * 优先倾向策略的属性，有三个可选值：sales/hot/rating，分别表示高销量、高热度、高评分
	 */
	@ApiField("target_tendency_attr")
	private String targetTendencyAttr;

	public String getFatigueClickInterval() {
		return this.fatigueClickInterval;
	}
	public void setFatigueClickInterval(String fatigueClickInterval) {
		this.fatigueClickInterval = fatigueClickInterval;
	}

	public String getFatigueExposeInterval() {
		return this.fatigueExposeInterval;
	}
	public void setFatigueExposeInterval(String fatigueExposeInterval) {
		this.fatigueExposeInterval = fatigueExposeInterval;
	}

	public Long getScatterBrandWindowSize() {
		return this.scatterBrandWindowSize;
	}
	public void setScatterBrandWindowSize(Long scatterBrandWindowSize) {
		this.scatterBrandWindowSize = scatterBrandWindowSize;
	}

	public Long getScatterCateLevel() {
		return this.scatterCateLevel;
	}
	public void setScatterCateLevel(Long scatterCateLevel) {
		this.scatterCateLevel = scatterCateLevel;
	}

	public Long getScatterCateWindowSize() {
		return this.scatterCateWindowSize;
	}
	public void setScatterCateWindowSize(Long scatterCateWindowSize) {
		this.scatterCateWindowSize = scatterCateWindowSize;
	}

	public String getTargetTendencyAttr() {
		return this.targetTendencyAttr;
	}
	public void setTargetTendencyAttr(String targetTendencyAttr) {
		this.targetTendencyAttr = targetTendencyAttr;
	}

}
