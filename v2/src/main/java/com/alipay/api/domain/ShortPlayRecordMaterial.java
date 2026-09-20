package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧备案材料信息。
 *
 * @author auto create
 * @since 1.0, 2026-09-16 16:43:03
 */
public class ShortPlayRecordMaterial extends AlipayObject {

	private static final long serialVersionUID = 2466144923423648225L;

	/**
	 * 演员列表。
	 */
	@ApiListField("actor_list")
	@ApiField("short_play_actor")
	private List<ShortPlayActor> actorList;

	/**
	 * 全部演员片酬占制作总成本比例（取值范围 0~1）
	 */
	@ApiField("actor_salary_ratio")
	private String actorSalaryRatio;

	/**
	 * 动画类短剧类型，可选值：动画漫剧 / 沙雕漫剧 / 动态解说漫剧 / 静态解说漫剧（节目分类为 动画微短剧 时必填，单选）
	 */
	@ApiField("animation_type")
	private String animationType;

	/**
	 * 受众定位，可选值：男频 / 女频（多选）
	 */
	@ApiListField("audience")
	@ApiField("string")
	private List<String> audience;

	/**
	 * 平均每集时长（分钟）
	 */
	@ApiField("avg_duration")
	private Long avgDuration;

	/**
	 * 特殊声明。无：0；该剧内容由 AI 生成：1；该剧有未成年出演：2
	 */
	@ApiField("content_declared")
	private String contentDeclared;

	/**
	 * 版权方名称，最多30个字
	 */
	@ApiField("copyright_holder")
	private String copyrightHolder;

	/**
	 * 导演列表。
	 */
	@ApiListField("director")
	@ApiField("string")
	private List<String> director;

	/**
	 * 是否全网首轮播出。0 或不传：否；1：是
	 */
	@ApiField("first_broadcast")
	private Boolean firstBroadcast;

	/**
	 * 主要演员片酬占总片酬比例（取值范围 0~1）
	 */
	@ApiField("main_actor_salary_ratio")
	private String mainActorSalaryRatio;

	/**
	 * 制作费用（元）
	 */
	@ApiField("playlet_production_cost")
	private Long playletProductionCost;

	/**
	 * 制片方。
	 */
	@ApiField("producer")
	private String producer;

	/**
	 * 节目分类，可选值：真人微短剧 / AI真人微短剧 / 动画微短剧（单选）
	 */
	@ApiField("program_category")
	private String programCategory;

	/**
	 * 编剧列表
	 */
	@ApiListField("screen_writer")
	@ApiField("string")
	private List<String> screenWriter;

	/**
	 * 总集数
	 */
	@ApiField("seqs_count")
	private Long seqsCount;

	/**
	 * 短剧简介，最少 200 个字
	 */
	@ApiField("summary")
	private String summary;

	public List<ShortPlayActor> getActorList() {
		return this.actorList;
	}
	public void setActorList(List<ShortPlayActor> actorList) {
		this.actorList = actorList;
	}

	public String getActorSalaryRatio() {
		return this.actorSalaryRatio;
	}
	public void setActorSalaryRatio(String actorSalaryRatio) {
		this.actorSalaryRatio = actorSalaryRatio;
	}

	public String getAnimationType() {
		return this.animationType;
	}
	public void setAnimationType(String animationType) {
		this.animationType = animationType;
	}

	public List<String> getAudience() {
		return this.audience;
	}
	public void setAudience(List<String> audience) {
		this.audience = audience;
	}

	public Long getAvgDuration() {
		return this.avgDuration;
	}
	public void setAvgDuration(Long avgDuration) {
		this.avgDuration = avgDuration;
	}

	public String getContentDeclared() {
		return this.contentDeclared;
	}
	public void setContentDeclared(String contentDeclared) {
		this.contentDeclared = contentDeclared;
	}

	public String getCopyrightHolder() {
		return this.copyrightHolder;
	}
	public void setCopyrightHolder(String copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	public List<String> getDirector() {
		return this.director;
	}
	public void setDirector(List<String> director) {
		this.director = director;
	}

	public Boolean getFirstBroadcast() {
		return this.firstBroadcast;
	}
	public void setFirstBroadcast(Boolean firstBroadcast) {
		this.firstBroadcast = firstBroadcast;
	}

	public String getMainActorSalaryRatio() {
		return this.mainActorSalaryRatio;
	}
	public void setMainActorSalaryRatio(String mainActorSalaryRatio) {
		this.mainActorSalaryRatio = mainActorSalaryRatio;
	}

	public Long getPlayletProductionCost() {
		return this.playletProductionCost;
	}
	public void setPlayletProductionCost(Long playletProductionCost) {
		this.playletProductionCost = playletProductionCost;
	}

	public String getProducer() {
		return this.producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getProgramCategory() {
		return this.programCategory;
	}
	public void setProgramCategory(String programCategory) {
		this.programCategory = programCategory;
	}

	public List<String> getScreenWriter() {
		return this.screenWriter;
	}
	public void setScreenWriter(List<String> screenWriter) {
		this.screenWriter = screenWriter;
	}

	public Long getSeqsCount() {
		return this.seqsCount;
	}
	public void setSeqsCount(Long seqsCount) {
		this.seqsCount = seqsCount;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

}
